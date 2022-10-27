package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_cancellable_source_new().
 * @version 2.28
 */
@FunctionalInterface
public interface CancellableSourceFunc {
        boolean onCancellableSourceFunc(@Nullable org.gtk.gio.Cancellable cancellable);
}
