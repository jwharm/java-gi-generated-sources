package org.gtk.gio;

/**
 * When doing file operations that may take a while, such as moving
 * a file or copying a file, a progress callback is used to pass how
 * far along that operation is to the application.
 */
@FunctionalInterface
public interface FileProgressCallback {
        void onFileProgressCallback(long currentNumBytes, long totalNumBytes);
}
