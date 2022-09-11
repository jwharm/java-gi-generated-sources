package org.gtk.gio;

@FunctionalInterface
public interface FileMeasureProgressCallback {

        void onFileMeasureProgressCallback(boolean reporting, long currentSize, long numDirs, long numFiles);
}
