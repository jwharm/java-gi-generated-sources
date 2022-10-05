package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * A callback called after an interface vtable is initialized.
 * <p>
 * See g_type_add_interface_check().
 */
@FunctionalInterface
public interface TypeInterfaceCheckFunc {
        void onTypeInterfaceCheckFunc(TypeInterface gIface);
}