package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_cancellable_source_new().
 */
@FunctionalInterface
public interface CancellableSourceFunc {
        boolean onCancellableSourceFunc(@Nullable Cancellable cancellable);
}
