package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DataOutputStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDataOutputStreamClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterOutputStreamClass.getMemoryLayout().withName("parent_class"),
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
     * Allocate a new {@link DataOutputStreamClass}
     * @return A new, uninitialized @{link DataOutputStreamClass}
     */
    public static DataOutputStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DataOutputStreamClass newInstance = new DataOutputStreamClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.FilterOutputStreamClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gio.FilterOutputStreamClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DataOutputStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataOutputStreamClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DataOutputStreamClass struct;
        
         /**
         * A {@link DataOutputStreamClass.Build} object constructs a {@link DataOutputStreamClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DataOutputStreamClass.allocate();
        }
        
         /**
         * Finish building the {@link DataOutputStreamClass} struct.
         * @return A new instance of {@code DataOutputStreamClass} with the fields 
         *         that were set in the Build object.
         */
        public DataOutputStreamClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gio.FilterOutputStreamClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
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
