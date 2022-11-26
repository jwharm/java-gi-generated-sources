package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link SocketControlMessage}.
 */
public class SocketControlMessageClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketControlMessageClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_size"),
        Interop.valueLayout.ADDRESS.withName("get_level"),
        Interop.valueLayout.ADDRESS.withName("get_type"),
        Interop.valueLayout.ADDRESS.withName("serialize"),
        Interop.valueLayout.ADDRESS.withName("deserialize"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5")
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
     * Allocate a new {@link SocketControlMessageClass}
     * @return A new, uninitialized @{link SocketControlMessageClass}
     */
    public static SocketControlMessageClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketControlMessageClass newInstance = new SocketControlMessageClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SocketControlMessageClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketControlMessageClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SocketControlMessageClass struct;
        
         /**
         * A {@link SocketControlMessageClass.Build} object constructs a {@link SocketControlMessageClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SocketControlMessageClass.allocate();
        }
        
         /**
         * Finish building the {@link SocketControlMessageClass} struct.
         * @return A new instance of {@code SocketControlMessageClass} with the fields 
         *         that were set in the Build object.
         */
        public SocketControlMessageClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setGetSize(java.lang.foreign.MemoryAddress get_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_size == null ? MemoryAddress.NULL : get_size));
            return this;
        }
        
        public Build setGetLevel(java.lang.foreign.MemoryAddress get_level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_level == null ? MemoryAddress.NULL : get_level));
            return this;
        }
        
        public Build setGetType(java.lang.foreign.MemoryAddress get_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_type == null ? MemoryAddress.NULL : get_type));
            return this;
        }
        
        public Build setSerialize(java.lang.foreign.MemoryAddress serialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize));
            return this;
        }
        
        public Build setDeserialize(java.lang.foreign.MemoryAddress deserialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserialize == null ? MemoryAddress.NULL : deserialize));
            return this;
        }
        
        public Build setGReserved1(java.lang.foreign.MemoryAddress _g_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved1 == null ? MemoryAddress.NULL : _g_reserved1));
            return this;
        }
        
        public Build setGReserved2(java.lang.foreign.MemoryAddress _g_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved2 == null ? MemoryAddress.NULL : _g_reserved2));
            return this;
        }
        
        public Build setGReserved3(java.lang.foreign.MemoryAddress _g_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved3 == null ? MemoryAddress.NULL : _g_reserved3));
            return this;
        }
        
        public Build setGReserved4(java.lang.foreign.MemoryAddress _g_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved4 == null ? MemoryAddress.NULL : _g_reserved4));
            return this;
        }
        
        public Build setGReserved5(java.lang.foreign.MemoryAddress _g_reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved5 == null ? MemoryAddress.NULL : _g_reserved5));
            return this;
        }
    }
}
