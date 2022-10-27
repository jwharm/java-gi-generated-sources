package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback called after an interface vtable is initialized.
 * <p>
 * See g_type_add_interface_check().
 * @version 2.4
 */
@FunctionalInterface
public interface TypeInterfaceCheckFunc {
        void onTypeInterfaceCheckFunc(@NotNull org.gtk.gobject.TypeInterface gIface);
}
