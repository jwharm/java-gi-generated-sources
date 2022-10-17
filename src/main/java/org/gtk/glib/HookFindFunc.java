package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function passed to g_hook_find().
 */
@FunctionalInterface
public interface HookFindFunc {
        boolean onHookFindFunc(@NotNull Hook hook);
}
