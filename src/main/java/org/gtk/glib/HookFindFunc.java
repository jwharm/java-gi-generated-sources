package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of the function passed to g_hook_find().
 */
@FunctionalInterface
public interface HookFindFunc {
        boolean onHookFindFunc(Hook hook);
}
