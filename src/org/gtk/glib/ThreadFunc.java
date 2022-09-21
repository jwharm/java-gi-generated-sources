package org.gtk.glib;

/**
 * Specifies the type of the {@code func} functions passed to g_thread_new()
 * or g_thread_try_new().
 */
@FunctionalInterface
public interface ThreadFunc {
        jdk.incubator.foreign.MemoryAddress onThreadFunc();
}
