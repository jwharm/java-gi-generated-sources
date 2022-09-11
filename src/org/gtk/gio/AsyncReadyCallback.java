package org.gtk.gio;

@FunctionalInterface
public interface AsyncReadyCallback {

        void onAsyncReadyCallback(org.gtk.gobject.Object sourceObject, AsyncResult res);
}
