/*
 * Copyright (C) 2012 Eyal LEZMY (http://www.eyal.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.eyal.lib.image.downloader;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.AndroidHttpClient;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import fr.eyal.lib.data.service.model.DataLibResponse;
import fr.eyal.lib.service.MultiThreadService;
import fr.eyal.lib.util.FileManager;

/**
 * @author Eyal LEZMY
 */
public class ImageDownloaderService extends MultiThreadService {

    private static final String TAG = ImageDownloaderService.class.getSimpleName();

    private static final int MAX_THREADS = 3;

    private static final int COMPRESSION_QUALITY = 100;

    public static final String INTENT_EXTRA_PACKAGE_NAME = "packageName";
    public static final String INTENT_EXTRA_URL = "imageUrl";
    public static final String INTENT_EXTRA_PREFIX = "prefix";
    public static final String INTENT_EXTRA_HAS_EXTERNAL_STORAGE = "hasExternalStorage";

    public ImageDownloaderService() {
        super(MAX_THREADS);
    }

    @Override
    protected void onHandleIntent(final Intent intent) {
        final String url = intent.getStringExtra(INTENT_EXTRA_URL);
        final String prefix = intent.getStringExtra(INTENT_EXTRA_PREFIX);
        final String packageName = intent.getStringExtra(INTENT_EXTRA_PACKAGE_NAME);
        final boolean hasExternalStorage = intent.getIntExtra(INTENT_EXTRA_HAS_EXTERNAL_STORAGE, 0) == 1;

        Log.i(TAG, "Getting image from " + url);

        if (url == null) {
            sendFailure(intent, "Empty URL");
            return;
        }

        String filename = prefix + FileManager.getFileName(url);

        final AndroidHttpClient client = AndroidHttpClient.newInstance("Android");
        final HttpGet getRequest = new HttpGet(url);

        try {
            HttpResponse response = client.execute(getRequest);
            final int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode != HttpStatus.SC_OK) {
                sendFailure(intent, "Error " + statusCode + " while retrieving bitmap from " + url);
                return;
            }

            final HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream inputStream = null;
                try {
                    inputStream = entity.getContent();

                    Bitmap bitmap = BitmapFactory.decodeStream(new FlushedInputStream(inputStream));

                    if (bitmap == null) {
                        sendFailure(intent, "Error while retrieving bitmap from " + url);
                        return;
                    }

                    if (hasExternalStorage) {
                        FileManager.saveOnSdCard(filename, packageName, bitmap, COMPRESSION_QUALITY);
                    } else {
                        FileManager.saveInInternalStorage(this, filename, bitmap, COMPRESSION_QUALITY);
                    }

                    Log.i(TAG, "Send success");
                    sendSuccess(intent, filename);
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    entity.consumeContent();
                }
            } else {
                Log.e(TAG, "No response !!!");
            }
        } catch (IOException e) {
            Log.e(TAG, "I/O error while retrieving bitmap from " + url, e);
            getRequest.abort();
            sendFailure(intent, "I/O error while retrieving bitmap from " + url);
        } catch (IllegalStateException e) {
            Log.e(TAG, "Incorrect URL: " + url);
            getRequest.abort();
            sendFailure(intent, "Incorrect URL: " + url);
        } catch (Exception e) {
            Log.e(TAG, "Error while retrieving bitmap from " + url, e);
            getRequest.abort();
            sendFailure(intent, "Error while retrieving bitmap from " + url);
        } finally {
            client.close();
        }
    }

    private void sendSuccess(final Intent intent, final String filename) {
        sendResult(intent, filename, DataLibResponse.STATUS_OK);

    }

    private void sendFailure(final Intent intent, final String message) {
        sendResult(intent, message, DataLibResponse.STATUS_ERROR);

    }

    protected void sendResult(final Intent intent, final String result, final int code) {

        ResultReceiver receiver = (ResultReceiver) intent.getParcelableExtra(INTENT_EXTRA_RECEIVER);

        if (receiver != null) {
            Bundle b = new Bundle();
            b.putString(ImageDownloader.RECEIVER_EXTRA_URL, intent.getStringExtra(INTENT_EXTRA_URL));
            b.putString(ImageDownloader.RECEIVER_EXTRA_PREFIX, intent.getStringExtra(INTENT_EXTRA_PREFIX));

            receiver.send(code, b);
        }
    }

    static class FlushedInputStream extends FilterInputStream {
        public FlushedInputStream(final InputStream inputStream) {
            super(inputStream);
        }

        @Override
        public long skip(final long n) throws IOException {
            long totalBytesSkipped = 0L;
            while (totalBytesSkipped < n) {
                long bytesSkipped = in.skip(n - totalBytesSkipped);
                if (bytesSkipped == 0L) {
                    int b = read();
                    if (b < 0) {
                        break; // we reached EOF
                    } else {
                        bytesSkipped = 1; // we read one byte
                    }
                }
                totalBytesSkipped += bytesSkipped;
            }
            return totalBytesSkipped;
        }
    }

}
