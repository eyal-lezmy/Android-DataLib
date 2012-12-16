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

package fr.eyal.lib.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

/**
 * @author Eyal LEZMY
 */
public class FileManager {

    private static final String TAG = "FileManager";

    private static final String DEFAULT_EXTENSION = ".jpg";
    private static final String NOMEDIA_FILENAME = ".nomedia";

    /**
     * Returns whether a file exists on the sdcard
     * 
     * @param filename the file name
     * @param packageName the name of the package
     * @return whether a file exists on the sdcard
     */
    public static boolean isFileOnSd(final String filename, final String packageName) {

        final String fullFilename = getExternalStorageFileDirectory(packageName) + filename;
        final File file = new File(fullFilename);
        return file.isFile();
    }

    /**
     * Get the fullpath for a given package name
     * 
     * @param packageName the name of the package
     * @return the fullpath for a given package name
     */
    private static String getExternalStorageFileDirectory(final String packageName) {
        final StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separatorChar + "Android" + File.separatorChar + "data" + File.separatorChar);
        sb.append(packageName);
        sb.append(File.separatorChar + "files" + File.separatorChar);
        return sb.toString();
    }

    /**
     * Save a Bitmap in the default application directory into SDCard
     * 
     * @param filename the file name.
     * @param packageName the name of the package
     * @param bitmap the Bitmap to save.
     * @param compressionQuality the quality for compression.
     */
    public static void saveOnSdCard(final String filename, final String packageName, final Bitmap bitmap, final int compressionQuality) {

        final String directory = getExternalStorageFileDirectory(packageName);
        final String name = filename;
        final File imageFile = new File(directory, name);
        final File imageDir = new File(directory);
        if (!imageDir.isDirectory()) {
            imageDir.mkdirs();
            final File noMediaFile = new File(directory, NOMEDIA_FILENAME);
            try {
                noMediaFile.createNewFile();
            } catch (final IOException e) {
                Out.e(TAG, "Error while creating .nomedia file", e);
            }
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(imageFile);

            if (getFileExtension(name).equals(DEFAULT_EXTENSION)) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, compressionQuality, fos);
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, compressionQuality, fos);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Save a Bitmap in the default application directory into the internal
     * storage
     * 
     * @param context the application context
     * @param filename the file name.
     * @param bitmap the Bitmap to save.
     * @param compressionQuality the quality for compression.
     */
    public static void saveInInternalStorage(final Context context, final String filename, final Bitmap bitmap, final int compressionQuality) {

        FileOutputStream fos = null;
        try {
            fos = context.openFileOutput(filename, Context.MODE_PRIVATE);

            if (getFileExtension(filename).equals(DEFAULT_EXTENSION)) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, compressionQuality, fos);
            } else {
                bitmap.compress(Bitmap.CompressFormat.PNG, compressionQuality, fos);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Returns a Bitmap image from device SDCard or null if image not found.
     * This function reach the cache directory of the SD card, i-e
     * Android/data/<package>/file/ folder.
     * 
     * @param filename the file name for this Bitmap.
     * @param packageName the name of the package
     * @return the bitmap save on the SDCard
     */
    public static Bitmap getPictureFromSDCard(final String filename, final String packageName) {
        return getPictureFromSDCard("", filename, packageName);
    }

    private static StringBuilder sStringBuilder = new StringBuilder();

    /**
     * Returns a Bitmap image from device SDCard or null if image not found.
     * This function reach the cache directory of the SD card, i-e
     * Android/data/<package>/file/ folder.
     * 
     * @param path the path starting from the cache directory of the application
     *            (without separator '/' character)
     * @param filename the file name for this Bitmap.
     * @param packageName the name of the package
     * @return the bitmap save on the SDCard
     */
    public static Bitmap getPictureFromSDCard(final String path, final String filename, final String packageName) {
        return getPictureFromSDCard(path, filename, packageName, false);
    }

    /**
     * Returns a Bitmap image from device SDCard or null if image not found.
     * This function reach the cache directory of the SD card, i-e
     * Android/data/<package>/file/ folder.
     * 
     * @param path the path starting from the cache directory of the application
     *            (without separator '/' character)
     * @param filename the file name for this Bitmap.
     * @param packageName the name of the package
     * @param hasSpecialPath add "external_sd" to the file path
     * @return the bitmap save on the SDCard
     */
    public static Bitmap getPictureFromSDCard(final String path, final String filename, final String packageName, final boolean hasSpecialPath) {

        sStringBuilder.setLength(0);
        sStringBuilder.append(Environment.getExternalStorageDirectory());
        if (hasSpecialPath) {
            sStringBuilder.append(File.separatorChar + "external_sd");
        }
        sStringBuilder.append(File.separatorChar + "Android" + File.separatorChar + "data" + File.separatorChar);
        sStringBuilder.append(packageName);
        sStringBuilder.append(File.separatorChar + "files" + File.separatorChar);
        if (path != null && path != "") {
            sStringBuilder.append(path + File.separatorChar);
        }
        sStringBuilder.append(filename);

        final String fullPath = sStringBuilder.toString();

        Bitmap returnBitmap = null;
        final File picture = new File(fullPath);
        if (picture.isFile()) {
            returnBitmap = BitmapFactory.decodeFile(fullPath);
        }

        return returnBitmap;
    }

    /**
     * Returns a Bitmap image from internal storage or null if image not found.
     * 
     * @param filename the file name for this Bitmap.
     * @param context the application context
     * @return the bitmap save on the internal storage
     */
    public static Bitmap getPictureFromInternalStorage(final String filename, final Context context) {

        try {
            final FileInputStream fis = context.openFileInput(filename);
            return BitmapFactory.decodeStream(fis);

        } catch (final FileNotFoundException e) {
            return null;
        }
    }

    public static void deletePrefixedFilesFromDirectoryInSDCard(final String packageName, final String prefix) {
        final String path = getExternalStorageFileDirectory(packageName);

        final File directory = new File(path);
        if (directory != null) {
            final File[] files = directory.listFiles();
            if (files != null) {

                final int filesLength = files.length;
                for (int i = 0; i < filesLength; i++) {
                    final String filename = files[i].getName();

                    if (filename.length() >= prefix.length() && filename.substring(0, prefix.length()).equals(prefix)) {
                        files[i].delete();
                    }
                }
            }
        }
    }

    public static void deletePrefixedFilesFromDirectoryInInternalStorage(final Context context, final String prefix) {
        final File directory = context.getFilesDir();
        if (directory != null) {
            final File[] files = directory.listFiles();
            if (files != null) {
                final int filesLength = files.length;
                for (int i = 0; i < filesLength; i++) {
                    final String filename = files[i].getName();

                    if (filename.length() >= prefix.length() && filename.substring(0, prefix.length()).equals(prefix)) {
                        files[i].delete();
                    }
                }
            }
        }
    }

    /**
     * Get the file extension
     * 
     * @param filename the file name
     * @return the file extension
     */
    private static String getFileExtension(final String filename) {
        String extension;
        final int dotPos = filename.lastIndexOf(".");
        if (dotPos != -1 || (dotPos != filename.length() - 1)) {
            extension = filename.substring(dotPos);
        } else {
            extension = DEFAULT_EXTENSION;
        }
        return extension;
    }

    /**
     * Get the file name
     * 
     * @param fullpath the full path
     * @return the file name
     */
    public static String getFileName(final String fullpath) {
        final int dotPos = fullpath.lastIndexOf(File.separatorChar);
        if (dotPos != -1 || (dotPos != fullpath.length() - 1)) {
            return fullpath.substring(dotPos + 1);
        } else {
            return fullpath;
        }
    }
}
