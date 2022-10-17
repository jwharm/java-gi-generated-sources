package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Type definition for a function that will be called back when an asynchronous
 * operation within GIO has been completed. {@link AsyncReadyCallback}
 * callbacks from {@link Task} are guaranteed to be invoked in a later
 * iteration of the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the {@link Task} was created. All other users of
 * {@link AsyncReadyCallback} must likewise call it asynchronously in a
 * later iteration of the main context.
 * <p>
 * The asynchronous operation is guaranteed to have held a reference to
 * {@code source_object} from the time when the {@code *_async()} function was called, until
 * after this callback returns.
 */
@FunctionalInterface
public interface AsyncReadyCallback {
        void onAsyncReadyCallback(@Nullable org.gtk.gobject.Object sourceObject, @NotNull AsyncResult res);
}
