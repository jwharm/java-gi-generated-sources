package org.gtk.glib;

/**
 * Defines the type of the function passed to g_hook_find().
 */
@FunctionalInterface
public interface HookFindFunc {
        boolean onHookFindFunc(Hook hook);
}
