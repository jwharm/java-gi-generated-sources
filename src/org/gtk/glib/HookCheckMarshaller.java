package org.gtk.glib;

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 */
@FunctionalInterface
public interface HookCheckMarshaller {
        boolean onHookCheckMarshaller(Hook hook);
}
