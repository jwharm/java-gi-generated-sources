package org.gtk.gio;

@FunctionalInterface
public interface FileReadMoreCallback {

    /**
     * When loading the partial contents of a file with g_file_load_partial_contents_async(),
     * it may become necessary to determine if any more data from the file should be loaded.
     * A #GFileReadMoreCallback function facilitates this by returning %TRUE if more data
     * should be read, or %FALSE otherwise.
     */
    public boolean onFileReadMoreCallback(java.lang.String fileContents, long fileSize, jdk.incubator.foreign.MemoryAddress callbackData);
}
