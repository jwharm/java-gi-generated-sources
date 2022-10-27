package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Simple thread function that runs an asynchronous operation and
 * checks for cancellation.
 */
@FunctionalInterface
public interface SimpleAsyncThreadFunc {
        void onSimpleAsyncThreadFunc(@NotNull org.gtk.gio.SimpleAsyncResult res, @NotNull org.gtk.gobject.Object object, @Nullable org.gtk.gio.Cancellable cancellable);
}
