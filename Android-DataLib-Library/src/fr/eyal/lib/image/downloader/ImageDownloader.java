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

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.ImageView;
import fr.eyal.lib.util.FileManager;

/**
 * @author Eyal LEZMY
 */
public class ImageDownloader {

    @SuppressWarnings("unused")
    private static final String TAG = "ImageDownloader";

    // Singleton management
    private static ImageDownloader sInstance;

    public static ImageDownloader getInstance(final Context context, final String packageName) {
        synchronized (ImageDownloader.class) {
        	if (sInstance == null) {
                sInstance = new ImageDownloader(context, packageName);
            }	
		}
        return sInstance;
    }

    public static final String RECEIVER_EXTRA_URL = "url";
    public static final String RECEIVER_EXTRA_PREFIX = "prefix";

    public static final int NO_PLACEHOLDER = -1;

    private Context mContext;
    private HashMap<String, DownloadHolder> mDownloadHolderUrlHashMap;
    private HashMap<ImageView, DownloadHolder> mDownloadHolderImageViewHashMap;
    private String mPackageName;
    private HashMap<String, SoftReference<Bitmap>> mImageCache;
    private boolean mHasExternalStorage;

    private Handler mHandler = new Handler();
    private EvalReceiver mEvalReceiver = new EvalReceiver(mHandler);

    private ImageDownloader(final Context context, final String packageName) {
        mContext = context.getApplicationContext();
        mPackageName = packageName;
        mDownloadHolderUrlHashMap = new HashMap<String, DownloadHolder>();
        mDownloadHolderImageViewHashMap = new HashMap<ImageView, DownloadHolder>();
        mImageCache = new HashMap<String, SoftReference<Bitmap>>();
        mHasExternalStorage = Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param imageView The ImageView where the image will be put
     */
    public void download(final String url, final ImageView imageView) {
        download(url, "", imageView, NO_PLACEHOLDER, null);
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param imageView The ImageView where the image will be put
     */
    public void download(final String url, final String prefix, final ImageView imageView) {
        download(url, prefix, imageView, NO_PLACEHOLDER, null);
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param imageView The ImageView where the image will be put
     * @param placeholderResId The id of the drawable which will be used while
     *            the image is downloaded if given
     */
    public void download(final String url, final ImageView imageView, final int placeholderResId) {
        download(url, "", imageView, placeholderResId, null);
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param imageView The ImageView where the image will be put
     * @param placeholderResId The id of the drawable which will be used while
     *            the image is downloaded if given
     */
    public void download(final String url, final String prefix, final ImageView imageView, final int placeholderResId) {
        download(url, prefix, imageView, placeholderResId, null);
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param prefix The prefix to add to the filename
     * @param imageView The ImageView where the image will be put
     * @param placeholderResId The id of the drawable which will be used while
     *            the image is downloaded if given
     * @param parentView A parent view to invalidate if given
     */
    public void download(final String url, final ImageView imageView, final int placeholderResId, final View parentView) {
        download(url, "", imageView, placeholderResId, parentView);
    }

    /**
     * Download the specified image from the Internet and binds it to the
     * provided ImageView. The binding is immediate if the image is found in the
     * cache and will be done asynchronously otherwise. A null bitmap will be
     * associated to the ImageView if an error occurs.
     * 
     * @param url The url of the image
     * @param prefix The prefix to add to the filename
     * @param imageView The ImageView where the image will be put
     * @param placeholderResId The id of the drawable which will be used while
     *            the image is downloaded if given
     * @param parentView A parent view to invalidate if given
     */
    public void download(final String url, final String prefix, final ImageView imageView, final int placeholderResId, final View parentView) {

        // Check if this imageview is already saved
        final DownloadHolder oldDh = mDownloadHolderImageViewHashMap.get(imageView);

        if (oldDh != null) {
            final int imageViewIndex = oldDh.mImageViewList.indexOf(imageView);
            oldDh.mImageViewList.remove(imageViewIndex);
            oldDh.mParentViewList.remove(imageViewIndex);

            mDownloadHolderImageViewHashMap.remove(imageView);
        }

        final String filename = prefix + FileManager.getFileName(url);

        // Try to get the image from the softReference Cache
        final SoftReference<Bitmap> softRef = mImageCache.get(url);
        if (softRef != null) {
            final Bitmap bitmap = softRef.get();
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);

                if (parentView != null) {
                    parentView.invalidate();
                }
                return;
            }
        }

        // Try to get the image from the SD Card or internal memory
        Bitmap bitmap;
        if (mHasExternalStorage) {
            bitmap = FileManager.getPictureFromSDCard(filename, mPackageName);
        } else {
            bitmap = FileManager.getPictureFromInternalStorage(filename, mContext);
        }

        if (bitmap != null) {
            mImageCache.put(url, new SoftReference<Bitmap>(bitmap));

            imageView.setImageBitmap(bitmap);

            if (parentView != null) {
                parentView.invalidate();
            }
            return;
        }

        // Get the image from the server

        // Set the placeholder if any
        if (placeholderResId != -1) {
            imageView.setImageResource(placeholderResId);

            if (parentView != null) {
                parentView.invalidate();
            }
        } else {
            imageView.setImageBitmap(null);
        }

        // Add the save

        DownloadHolder dh = mDownloadHolderUrlHashMap.get(url);
        if (dh != null) {
            dh.mImageViewList.add(imageView);
            dh.mParentViewList.add(parentView);
            mDownloadHolderImageViewHashMap.put(imageView, dh);
            return;
        } else {
            dh = new DownloadHolder(url);
            mDownloadHolderUrlHashMap.put(url, dh);
            dh.mImageViewList.add(imageView);
            dh.mParentViewList.add(parentView);

            mDownloadHolderImageViewHashMap.put(imageView, dh);

            // Launch the download
            final Intent i = new Intent(mContext, ImageDownloaderService.class);
            i.putExtra(ImageDownloaderService.INTENT_EXTRA_RECEIVER, mEvalReceiver);
            i.putExtra(ImageDownloaderService.INTENT_EXTRA_PACKAGE_NAME, mPackageName);
            i.putExtra(ImageDownloaderService.INTENT_EXTRA_URL, url);
            i.putExtra(ImageDownloaderService.INTENT_EXTRA_PREFIX, prefix);
            i.putExtra(ImageDownloaderService.INTENT_EXTRA_HAS_EXTERNAL_STORAGE, mHasExternalStorage ? 1 : 0);
            mContext.startService(i);
        }

    }

    /**
     * The ResultReceiver that will receive the result from the Service
     */
    private class EvalReceiver extends ResultReceiver {
        EvalReceiver(final Handler h) {
            super(h);
        }

        @Override
        public void onReceiveResult(final int resultCode, final Bundle resultData) {

            Bitmap bitmap = null;
            final String url = resultData.getString(RECEIVER_EXTRA_URL);
            final String prefix = resultData.getString(RECEIVER_EXTRA_PREFIX);

            if (resultCode != ImageDownloaderService.ERROR_CODE) {
                final String filename = prefix + FileManager.getFileName(url);

                if (mHasExternalStorage) {
                    bitmap = FileManager.getPictureFromSDCard(filename, mPackageName);
                } else {
                    bitmap = FileManager.getPictureFromInternalStorage(filename, mContext);
                }
            }

            final DownloadHolder dh = mDownloadHolderUrlHashMap.get(url);

            if (dh != null) {
                final ArrayList<ImageView> imageViewList = dh.mImageViewList;
                final ArrayList<View> parentViewList = dh.mParentViewList;

                final int imageViewListLength = imageViewList.size();

                for (int i = 0; i < imageViewListLength; i++) {
                    final ImageView imageView = imageViewList.get(i);
                    imageView.setImageBitmap(bitmap);

                    final View parentView = parentViewList.get(i);
                    if (parentView != null) {
                        parentView.invalidate();
                    }

                    mDownloadHolderImageViewHashMap.remove(imageView);
                }

                mDownloadHolderUrlHashMap.remove(url);
            }

            if (bitmap != null) {
                mImageCache.put(url, new SoftReference<Bitmap>(bitmap));
            }
        }
    }

    public void clearSoftRefCache() {
        mImageCache.clear();
    }

    private class DownloadHolder {
        @SuppressWarnings("unused")
        public String mUrl;
        public ArrayList<ImageView> mImageViewList;
        public ArrayList<View> mParentViewList;

        public DownloadHolder(final String url) {
            mUrl = url;
            mImageViewList = new ArrayList<ImageView>();
            mParentViewList = new ArrayList<View>();
        }
    }
}
