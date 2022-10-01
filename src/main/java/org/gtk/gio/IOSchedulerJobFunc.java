package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * I/O Job function.
 * <p>
 * Long-running jobs should periodically check the {@code cancellable}
 * to see if they have been cancelled.
 */
@FunctionalInterface
public interface IOSchedulerJobFunc {
        boolean onIOSchedulerJobFunc(IOSchedulerJob job, Cancellable cancellable);
}
