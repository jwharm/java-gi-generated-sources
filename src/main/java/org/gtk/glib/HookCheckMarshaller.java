package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 */
@FunctionalInterface
public interface HookCheckMarshaller {
        boolean onHookCheckMarshaller(@NotNull org.gtk.glib.Hook hook);
}
