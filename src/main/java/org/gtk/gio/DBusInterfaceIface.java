package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base type for D-Bus interfaces.
 * @version 2.30
 */
public class DBusInterfaceIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
        Interop.valueLayout.ADDRESS.withName("get_info"),
        Interop.valueLayout.ADDRESS.withName("get_object"),
        Interop.valueLayout.ADDRESS.withName("set_object"),
        Interop.valueLayout.ADDRESS.withName("dup_object")
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
     * Allocate a new {@link DBusInterfaceIface}
     * @return A new, uninitialized @{link DBusInterfaceIface}
     */
    public static DBusInterfaceIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceIface newInstance = new DBusInterfaceIface(segment.address(), Ownership.NONE);
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
     * Create a DBusInterfaceIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusInterfaceIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusInterfaceIface struct;
        
         /**
         * A {@link DBusInterfaceIface.Build} object constructs a {@link DBusInterfaceIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusInterfaceIface.allocate();
        }
        
         /**
         * Finish building the {@link DBusInterfaceIface} struct.
         * @return A new instance of {@code DBusInterfaceIface} with the fields 
         *         that were set in the Build object.
         */
        public DBusInterfaceIface construct() {
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
        
        public Build setGetInfo(java.lang.foreign.MemoryAddress get_info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_info == null ? MemoryAddress.NULL : get_info));
            return this;
        }
        
        public Build setGetObject(java.lang.foreign.MemoryAddress get_object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_object == null ? MemoryAddress.NULL : get_object));
            return this;
        }
        
        public Build setSetObject(java.lang.foreign.MemoryAddress set_object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_object == null ? MemoryAddress.NULL : set_object));
            return this;
        }
        
        public Build setDupObject(java.lang.foreign.MemoryAddress dup_object) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup_object == null ? MemoryAddress.NULL : dup_object));
            return this;
        }
    }
}
