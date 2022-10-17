package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used by g_hook_list_marshal().
 */
@FunctionalInterface
public interface HookMarshaller {
        void onHookMarshaller(@NotNull Hook hook);
}
