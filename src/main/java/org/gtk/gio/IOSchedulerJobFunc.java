package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * I/O Job function.
 * <p>
 * Long-running jobs should periodically check the {@code cancellable}
 * to see if they have been cancelled.
 */
@FunctionalInterface
public interface IOSchedulerJobFunc {
        boolean onIOSchedulerJobFunc(@NotNull org.gtk.gio.IOSchedulerJob job, @Nullable org.gtk.gio.Cancellable cancellable);
}
