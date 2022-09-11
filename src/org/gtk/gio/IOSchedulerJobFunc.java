package org.gtk.gio;

/**
 * I/O Job function.
 * 
 * Long-running jobs should periodically check the @cancellable
 * to see if they have been cancelled.
 */
@FunctionalInterface
public interface IOSchedulerJobFunc {
        boolean onIOSchedulerJobFunc(IOSchedulerJob job, Cancellable cancellable);
}
