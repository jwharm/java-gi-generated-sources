package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 */
@FunctionalInterface
public interface HookFinalizeFunc {
        void onHookFinalizeFunc(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook);
}
