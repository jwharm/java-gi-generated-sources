package org.gtk.gobject;

/**
 * A callback called after an interface vtable is initialized.
 * 
 * See g_type_add_interface_check().
 */
@FunctionalInterface
public interface TypeInterfaceCheckFunc {
        void onTypeInterfaceCheckFunc(TypeInterface gIface);
}
