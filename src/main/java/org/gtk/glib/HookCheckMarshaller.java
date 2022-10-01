package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 */
@FunctionalInterface
public interface HookCheckMarshaller {
        boolean onHookCheckMarshaller(Hook hook);
}
