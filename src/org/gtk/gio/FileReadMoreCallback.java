package org.gtk.gio;

@FunctionalInterface
public interface FileReadMoreCallback {

        void onFileReadMoreCallback(java.lang.String fileContents, long fileSize);
}
