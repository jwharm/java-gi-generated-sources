package org.gtk.gobject;

/**
 * A callback function used by the type system to initialize a new
 * interface.
 * 
 * This function should initialize all internal data and* allocate any
 * resources required by the interface.
 * 
 * The members of @iface_data are guaranteed to have been filled with
 * zeros before this function is called.
 */
@FunctionalInterface
public interface InterfaceInitFunc {
        void onInterfaceInitFunc(TypeInterface gIface);
}
