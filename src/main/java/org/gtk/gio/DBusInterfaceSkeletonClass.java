package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusInterfaceSkeleton}.
 * @version 2.30
 */
public class DBusInterfaceSkeletonClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceSkeletonClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_info"),
        Interop.valueLayout.ADDRESS.withName("get_vtable"),
        Interop.valueLayout.ADDRESS.withName("get_properties"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("vfunc_padding"),
        Interop.valueLayout.ADDRESS.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("signal_padding")
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
     * Allocate a new {@link DBusInterfaceSkeletonClass}
     * @return A new, uninitialized @{link DBusInterfaceSkeletonClass}
     */
    public static DBusInterfaceSkeletonClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceSkeletonClass newInstance = new DBusInterfaceSkeletonClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DBusInterfaceSkeletonClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusInterfaceSkeletonClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusInterfaceSkeletonClass struct;
        
         /**
         * A {@link DBusInterfaceSkeletonClass.Build} object constructs a {@link DBusInterfaceSkeletonClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusInterfaceSkeletonClass.allocate();
        }
        
         /**
         * Finish building the {@link DBusInterfaceSkeletonClass} struct.
         * @return A new instance of {@code DBusInterfaceSkeletonClass} with the fields 
         *         that were set in the Build object.
         */
        public DBusInterfaceSkeletonClass construct() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetInfo(java.lang.foreign.MemoryAddress getInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInfo == null ? MemoryAddress.NULL : getInfo));
            return this;
        }
        
        public Build setGetVtable(java.lang.foreign.MemoryAddress getVtable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vtable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVtable == null ? MemoryAddress.NULL : getVtable));
            return this;
        }
        
        public Build setGetProperties(java.lang.foreign.MemoryAddress getProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperties == null ? MemoryAddress.NULL : getProperties));
            return this;
        }
        
        public Build setFlush(java.lang.foreign.MemoryAddress flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush));
            return this;
        }
        
        public Build setVfuncPadding(java.lang.foreign.MemoryAddress[] vfuncPadding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vfunc_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vfuncPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(vfuncPadding, false)));
            return this;
        }
        
        public Build setGAuthorizeMethod(java.lang.foreign.MemoryAddress gAuthorizeMethod) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gAuthorizeMethod == null ? MemoryAddress.NULL : gAuthorizeMethod));
            return this;
        }
        
        public Build setSignalPadding(java.lang.foreign.MemoryAddress[] signalPadding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signal_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signalPadding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signalPadding, false)));
            return this;
        }
    }
}
