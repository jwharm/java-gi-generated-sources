package org.gtk.glib;

/**
 * Defines the type of function used by g_hook_list_marshal().
 */
@FunctionalInterface
public interface HookMarshaller {
        void onHookMarshaller(Hook hook);
}
