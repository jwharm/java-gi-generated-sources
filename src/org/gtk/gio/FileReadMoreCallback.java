package org.gtk.gio;

/**
 * When loading the partial contents of a file with g_file_load_partial_contents_async(),
 * it may become necessary to determine if any more data from the file should be loaded.
 * A {@link org.gtk.gio.FileReadMoreCallback} function facilitates this by returning <code>true</code> if more data
 * should be read, or <code>false</code> otherwise.
 */
@FunctionalInterface
public interface FileReadMoreCallback {
        boolean onFileReadMoreCallback(java.lang.String fileContents, long fileSize);
}
