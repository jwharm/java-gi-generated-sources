package org.gtk.gio;

@FunctionalInterface
public interface FileProgressCallback {

        void onFileProgressCallback(long currentNumBytes, long totalNumBytes);
}
