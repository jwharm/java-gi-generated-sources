package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GInitiallyUnowned type.
 */
public class InitiallyUnownedClass extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnownedClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        Interop.valueLayout.ADDRESS.withName("construct_properties"),
        Interop.valueLayout.ADDRESS.withName("constructor"),
        Interop.valueLayout.ADDRESS.withName("set_property"),
        Interop.valueLayout.ADDRESS.withName("get_property"),
        Interop.valueLayout.ADDRESS.withName("dispose"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("dispatch_properties_changed"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("constructed"),
        Interop.valueLayout.C_LONG.withName("flags"),
        Interop.valueLayout.C_LONG.withName("n_construct_properties"),
        Interop.valueLayout.ADDRESS.withName("pspecs"),
        Interop.valueLayout.C_LONG.withName("n_pspecs"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("pdummy")
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
     * Allocate a new {@link InitiallyUnownedClass}
     * @return A new, uninitialized @{link InitiallyUnownedClass}
     */
    public static InitiallyUnownedClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InitiallyUnownedClass newInstance = new InitiallyUnownedClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass gTypeClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return new org.gtk.gobject.TypeClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a InitiallyUnownedClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InitiallyUnownedClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InitiallyUnownedClass struct;
        
         /**
         * A {@link InitiallyUnownedClass.Build} object constructs a {@link InitiallyUnownedClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InitiallyUnownedClass.allocate();
        }
        
         /**
         * Finish building the {@link InitiallyUnownedClass} struct.
         * @return A new instance of {@code InitiallyUnownedClass} with the fields 
         *         that were set in the Build object.
         */
        public InitiallyUnownedClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gTypeClass The value for the {@code gTypeClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
            return this;
        }
        
        public Build setConstructProperties(org.gtk.glib.SList constructProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("construct_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructProperties == null ? MemoryAddress.NULL : constructProperties.handle()));
            return this;
        }
        
        public Build setConstructor(java.lang.foreign.MemoryAddress constructor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructor == null ? MemoryAddress.NULL : constructor));
            return this;
        }
        
        public Build setSetProperty(java.lang.foreign.MemoryAddress setProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setProperty == null ? MemoryAddress.NULL : setProperty));
            return this;
        }
        
        public Build setGetProperty(java.lang.foreign.MemoryAddress getProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperty == null ? MemoryAddress.NULL : getProperty));
            return this;
        }
        
        public Build setDispose(java.lang.foreign.MemoryAddress dispose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose));
            return this;
        }
        
        public Build setFinalize(java.lang.foreign.MemoryAddress finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize));
            return this;
        }
        
        public Build setDispatchPropertiesChanged(java.lang.foreign.MemoryAddress dispatchPropertiesChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatchPropertiesChanged == null ? MemoryAddress.NULL : dispatchPropertiesChanged));
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        public Build setConstructed(java.lang.foreign.MemoryAddress constructed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructed == null ? MemoryAddress.NULL : constructed));
            return this;
        }
        
        public Build setFlags(long flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        public Build setNConstructProperties(long nConstructProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_construct_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nConstructProperties);
            return this;
        }
        
        public Build setPspecs(java.lang.foreign.MemoryAddress pspecs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pspecs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pspecs == null ? MemoryAddress.NULL : (Addressable) pspecs));
            return this;
        }
        
        public Build setNPspecs(long nPspecs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_pspecs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPspecs);
            return this;
        }
        
        public Build setPdummy(java.lang.foreign.MemoryAddress[] pdummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pdummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pdummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pdummy, false)));
            return this;
        }
    }
}
