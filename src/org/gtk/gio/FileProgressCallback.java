package org.gtk.gio;

@FunctionalInterface
public interface FileProgressCallback {

    /**
     * When doing file operations that may take a while, such as moving
     * a file or copying a file, a progress callback is used to pass how
     * far along that operation is to the application.
     */
    public void onFileProgressCallback(long currentNumBytes, long totalNumBytes, jdk.incubator.foreign.MemoryAddress userData);
}
