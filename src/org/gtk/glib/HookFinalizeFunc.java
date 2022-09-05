package org.gtk.glib;

@FunctionalInterface
public interface HookFinalizeFunc {

    /**
     * Defines the type of function to be called when a hook in a
     * list of hooks gets finalized.
     */
    public void onHookFinalizeFunc(HookList hookList, Hook hook);
}
