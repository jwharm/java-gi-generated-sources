package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke_check().
 */
@FunctionalInterface
public interface HookCheckFunc {
        boolean onHookCheckFunc();
}
