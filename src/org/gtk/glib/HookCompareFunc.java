package org.gtk.glib;

@FunctionalInterface
public interface HookCompareFunc {

    /**
     * Defines the type of function used to compare #GHook elements in
     * g_hook_insert_sorted().
     */
    public int onHookCompareFunc(Hook newHook, Hook sibling);
}
