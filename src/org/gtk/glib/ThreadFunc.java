package org.gtk.glib;

@FunctionalInterface
public interface ThreadFunc {

    /**
     * Specifies the type of the @func functions passed to g_thread_new()
     * or g_thread_try_new().
     */
    public jdk.incubator.foreign.MemoryAddress onThreadFunc(jdk.incubator.foreign.MemoryAddress data);
}
