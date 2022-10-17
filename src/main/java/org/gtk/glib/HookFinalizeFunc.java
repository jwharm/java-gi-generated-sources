package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 */
@FunctionalInterface
public interface HookFinalizeFunc {
        void onHookFinalizeFunc(@NotNull HookList hookList, @NotNull Hook hook);
}
