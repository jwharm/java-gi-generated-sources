package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function passed to g_hook_find().
 */
@FunctionalInterface
public interface HookFindFunc {
        boolean onHookFindFunc(@NotNull org.gtk.glib.Hook hook);
}
