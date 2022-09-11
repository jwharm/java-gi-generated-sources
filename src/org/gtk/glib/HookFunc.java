package org.gtk.glib;

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke().
 */
@FunctionalInterface
public interface HookFunc {
        void onHookFunc();
}
