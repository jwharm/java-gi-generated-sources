package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Simple thread function that runs an asynchronous operation and
 * checks for cancellation.
 */
@FunctionalInterface
public interface SimpleAsyncThreadFunc {
        void onSimpleAsyncThreadFunc(@NotNull SimpleAsyncResult res, @NotNull org.gtk.gobject.Object object, @Nullable Cancellable cancellable);
}
