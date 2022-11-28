package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base object type for D-Bus objects.
 * @version 2.30
 */
public class DBusObjectIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("get_object_path"),
        Interop.valueLayout.ADDRESS.withName("get_interfaces"),
        Interop.valueLayout.ADDRESS.withName("get_interface"),
        Interop.valueLayout.ADDRESS.withName("interface_added"),
        Interop.valueLayout.ADDRESS.withName("interface_removed")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusObjectIface}
     * @return A new, uninitialized @{link DBusObjectIface}
     */
    public static DBusObjectIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectIface newInstance = new DBusObjectIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface parentIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DBusObjectIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusObjectIface struct;
        
         /**
         * A {@link DBusObjectIface.Build} object constructs a {@link DBusObjectIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusObjectIface.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectIface} struct.
         * @return A new instance of {@code DBusObjectIface} with the fields 
         *         that were set in the Build object.
         */
        public DBusObjectIface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param parentIface The value for the {@code parentIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Build setGetObjectPath(java.lang.foreign.MemoryAddress getObjectPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getObjectPath == null ? MemoryAddress.NULL : getObjectPath));
            return this;
        }
        
        public Build setGetInterfaces(java.lang.foreign.MemoryAddress getInterfaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_interfaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterfaces == null ? MemoryAddress.NULL : getInterfaces));
            return this;
        }
        
        public Build setGetInterface(java.lang.foreign.MemoryAddress getInterface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_interface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInterface == null ? MemoryAddress.NULL : getInterface));
            return this;
        }
        
        public Build setInterfaceAdded(java.lang.foreign.MemoryAddress interfaceAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceAdded == null ? MemoryAddress.NULL : interfaceAdded));
            return this;
        }
        
        public Build setInterfaceRemoved(java.lang.foreign.MemoryAddress interfaceRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceRemoved == null ? MemoryAddress.NULL : interfaceRemoved));
            return this;
        }
    }
}
