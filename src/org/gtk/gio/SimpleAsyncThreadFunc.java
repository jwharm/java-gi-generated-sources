package org.gtk.gio;

/**
 * Simple thread function that runs an asynchronous operation and
 * checks for cancellation.
 */
@FunctionalInterface
public interface SimpleAsyncThreadFunc {
        void onSimpleAsyncThreadFunc(SimpleAsyncResult res, org.gtk.gobject.Object object, Cancellable cancellable);
}
