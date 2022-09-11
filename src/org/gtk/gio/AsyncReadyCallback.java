package org.gtk.gio;

/**
 * Type definition for a function that will be called back when an asynchronous
 * operation within GIO has been completed. #GAsyncReadyCallback
 * callbacks from #GTask are guaranteed to be invoked in a later
 * iteration of the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the #GTask was created. All other users of
 * #GAsyncReadyCallback must likewise call it asynchronously in a
 * later iteration of the main context.
 * 
 * The asynchronous operation is guaranteed to have held a reference to
 * @source_object from the time when the `*_async()` function was called, until
 * after this callback returns.
 */
@FunctionalInterface
public interface AsyncReadyCallback {
        void onAsyncReadyCallback(org.gtk.gobject.Object sourceObject, AsyncResult res);
}
