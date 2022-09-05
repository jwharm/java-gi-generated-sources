package org.gtk.gobject;

@FunctionalInterface
public interface InterfaceFinalizeFunc {

    /**
     * A callback function used by the type system to finalize an interface.
     * 
     * This function should destroy any internal data and release any resources
     * allocated by the corresponding GInterfaceInitFunc() function.
     */
    public void onInterfaceFinalizeFunc(TypeInterface gIface, jdk.incubator.foreign.MemoryAddress ifaceData);
}
