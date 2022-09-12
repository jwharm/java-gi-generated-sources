package org.gtk.glib;

/**
 * Defines the type of function used to compare #GHook elements in
 * g_hook_insert_sorted().
 */
@FunctionalInterface
public interface HookCompareFunc {
        int onHookCompareFunc(Hook newHook, Hook sibling);
}
