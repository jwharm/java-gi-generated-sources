package org.gtk.gio;

@FunctionalInterface
public interface CancellableSourceFunc {

    /**
     * This is the function type of the callback used for the #GSource
     * returned by g_cancellable_source_new().
     */
    public boolean onCancellableSourceFunc(Cancellable cancellable, jdk.incubator.foreign.MemoryAddress userData);
}
