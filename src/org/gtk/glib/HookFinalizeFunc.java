package org.gtk.glib;

@FunctionalInterface
public interface HookFinalizeFunc {

        void onHookFinalizeFunc(HookList hookList);
}
