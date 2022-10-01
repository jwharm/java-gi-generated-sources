package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of function used to compare {@link Hook} elements in
 * g_hook_insert_sorted().
 */
@FunctionalInterface
public interface HookCompareFunc {
        int onHookCompareFunc(Hook newHook, Hook sibling);
}
