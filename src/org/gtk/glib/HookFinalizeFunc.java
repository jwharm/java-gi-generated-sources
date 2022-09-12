package org.gtk.glib;

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 */
@FunctionalInterface
public interface HookFinalizeFunc {
        void onHookFinalizeFunc(HookList hookList, Hook hook);
}
