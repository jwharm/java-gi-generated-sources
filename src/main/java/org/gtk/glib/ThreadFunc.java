package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the type of the {@code func} functions passed to g_thread_new()
 * or g_thread_try_new().
 */
@FunctionalInterface
public interface ThreadFunc {
        java.lang.foreign.MemoryAddress onThreadFunc();
}
