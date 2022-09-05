package org.gtk.gobject;

@FunctionalInterface
public interface InterfaceInitFunc {

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
    public void onInterfaceInitFunc(TypeInterface gIface, jdk.incubator.foreign.MemoryAddress ifaceData);
}
