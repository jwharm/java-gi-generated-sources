package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base type for D-Bus object managers.
 * @version 2.30
 */
public class DBusObjectManagerIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("get_object_path"),
        Interop.valueLayout.ADDRESS.withName("get_objects"),
        Interop.valueLayout.ADDRESS.withName("get_object"),
        Interop.valueLayout.ADDRESS.withName("get_interface"),
        Interop.valueLayout.ADDRESS.withName("object_added"),
        Interop.valueLayout.ADDRESS.withName("object_removed"),
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
     * Allocate a new {@link DBusObjectManagerIface}
     * @return A new, uninitialized @{link DBusObjectManagerIface}
     */
    public static DBusObjectManagerIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectManagerIface newInstance = new DBusObjectManagerIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface parent_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DBusObjectManagerIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectManagerIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusObjectManagerIface struct;
        
         /**
         * A {@link DBusObjectManagerIface.Build} object constructs a {@link DBusObjectManagerIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusObjectManagerIface.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectManagerIface} struct.
         * @return A new instance of {@code DBusObjectManagerIface} with the fields 
         *         that were set in the Build object.
         */
        public DBusObjectManagerIface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param parent_iface The value for the {@code parent_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentIface(org.gtk.gobject.TypeInterface parent_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_iface == null ? MemoryAddress.NULL : parent_iface.handle()));
            return this;
        }
        
        public Build setGetObjectPath(java.lang.foreign.MemoryAddress get_object_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_object_path == null ? MemoryAddress.NULL : get_object_path));
            return this;
        }
        
        public Build setGetObjects(java.lang.foreign.MemoryAddress get_objects) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_objects"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_objects == null ? MemoryAddress.NULL : get_objects));
            return this;
        }
        
        public Build setGetObject(java.lang.foreign.MemoryAddress get_object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_object == null ? MemoryAddress.NULL : get_object));
            return this;
        }
        
        public Build setGetInterface(java.lang.foreign.MemoryAddress get_interface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_interface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_interface == null ? MemoryAddress.NULL : get_interface));
            return this;
        }
        
        public Build setObjectAdded(java.lang.foreign.MemoryAddress object_added) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object_added == null ? MemoryAddress.NULL : object_added));
            return this;
        }
        
        public Build setObjectRemoved(java.lang.foreign.MemoryAddress object_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (object_removed == null ? MemoryAddress.NULL : object_removed));
            return this;
        }
        
        public Build setInterfaceAdded(java.lang.foreign.MemoryAddress interface_added) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interface_added == null ? MemoryAddress.NULL : interface_added));
            return this;
        }
        
        public Build setInterfaceRemoved(java.lang.foreign.MemoryAddress interface_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interface_removed == null ? MemoryAddress.NULL : interface_removed));
            return this;
        }
    }
}
