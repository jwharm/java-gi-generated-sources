package org.gtk.gio;

@FunctionalInterface
public interface IOSchedulerJobFunc {

    /**
     * I/O Job function.
     * 
     * Long-running jobs should periodically check the @cancellable
     * to see if they have been cancelled.
     */
    public boolean onIOSchedulerJobFunc(IOSchedulerJob job, Cancellable cancellable, jdk.incubator.foreign.MemoryAddress userData);
}
