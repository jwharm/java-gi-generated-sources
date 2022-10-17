package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used to compare {@link Hook} elements in
 * g_hook_insert_sorted().
 */
@FunctionalInterface
public interface HookCompareFunc {
        int onHookCompareFunc(@NotNull Hook newHook, @NotNull Hook sibling);
}
