package org.gtk.gio;

/**
 * Type definition for a function that will be called back when an asynchronous
 * operation within GIO has been completed. {@link org.gtk.gio.AsyncReadyCallback} callbacks from {@link org.gtk.gio.Task} are guaranteed to be invoked in a later
 * iteration of the
 * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
 * where the {@link org.gtk.gio.Task} was created. All other users of
 * {@link org.gtk.gio.AsyncReadyCallback} must likewise call it asynchronously in a
 * later iteration of the main context.
 * <p>
 * The asynchronous operation is guaranteed to have held a reference to
 * @source_object from the time when the <code>*_async()</code> function was called, until
 * after this callback returns.
 */
@FunctionalInterface
public interface AsyncReadyCallback {
        void onAsyncReadyCallback(org.gtk.gobject.Object sourceObject, AsyncResult res);
}
