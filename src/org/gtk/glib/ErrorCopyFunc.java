package org.gtk.glib;

@FunctionalInterface
public interface ErrorCopyFunc {

        void onErrorCopyFunc(Error srcError);
}
