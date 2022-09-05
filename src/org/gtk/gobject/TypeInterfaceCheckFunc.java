package org.gtk.gobject;

@FunctionalInterface
public interface TypeInterfaceCheckFunc {

    /**
     * A callback called after an interface vtable is initialized.
     * 
     * See g_type_add_interface_check().
     */
    public void onTypeInterfaceCheckFunc(jdk.incubator.foreign.MemoryAddress checkData, TypeInterface gIface);
}
