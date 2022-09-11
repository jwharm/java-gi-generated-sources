package org.gtk.gio;

@FunctionalInterface
public interface IOSchedulerJobFunc {

        void onIOSchedulerJobFunc(IOSchedulerJob job, Cancellable cancellable);
}
