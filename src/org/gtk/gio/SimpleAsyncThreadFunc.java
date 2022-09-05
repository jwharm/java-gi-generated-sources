package org.gtk.gio;

@FunctionalInterface
public interface SimpleAsyncThreadFunc {

    /**
     * Simple thread function that runs an asynchronous operation and
     * checks for cancellation.
     */
    public void onSimpleAsyncThreadFunc(SimpleAsyncResult res, org.gtk.gobject.Object object, Cancellable cancellable);
}
