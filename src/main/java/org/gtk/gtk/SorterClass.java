package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual table for {@code GtkSorter}.
 */
public class SorterClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("compare"),
        Interop.valueLayout.ADDRESS.withName("get_order"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved8")
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
     * Allocate a new {@link SorterClass}
     * @return A new, uninitialized @{link SorterClass}
     */
    public static SorterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SorterClass newInstance = new SorterClass(segment.address(), Ownership.NONE);
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
     * Create a SorterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SorterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SorterClass struct;
        
         /**
         * A {@link SorterClass.Build} object constructs a {@link SorterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SorterClass.allocate();
        }
        
         /**
         * Finish building the {@link SorterClass} struct.
         * @return A new instance of {@code SorterClass} with the fields 
         *         that were set in the Build object.
         */
        public SorterClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setCompare(java.lang.foreign.MemoryAddress compare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compare == null ? MemoryAddress.NULL : compare));
            return this;
        }
        
        public Build setGetOrder(java.lang.foreign.MemoryAddress get_order) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_order"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_order == null ? MemoryAddress.NULL : get_order));
            return this;
        }
        
        public Build setGtkReserved1(java.lang.foreign.MemoryAddress _gtk_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved1 == null ? MemoryAddress.NULL : _gtk_reserved1));
            return this;
        }
        
        public Build setGtkReserved2(java.lang.foreign.MemoryAddress _gtk_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved2 == null ? MemoryAddress.NULL : _gtk_reserved2));
            return this;
        }
        
        public Build setGtkReserved3(java.lang.foreign.MemoryAddress _gtk_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved3 == null ? MemoryAddress.NULL : _gtk_reserved3));
            return this;
        }
        
        public Build setGtkReserved4(java.lang.foreign.MemoryAddress _gtk_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved4 == null ? MemoryAddress.NULL : _gtk_reserved4));
            return this;
        }
        
        public Build setGtkReserved5(java.lang.foreign.MemoryAddress _gtk_reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved5 == null ? MemoryAddress.NULL : _gtk_reserved5));
            return this;
        }
        
        public Build setGtkReserved6(java.lang.foreign.MemoryAddress _gtk_reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved6 == null ? MemoryAddress.NULL : _gtk_reserved6));
            return this;
        }
        
        public Build setGtkReserved7(java.lang.foreign.MemoryAddress _gtk_reserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved7 == null ? MemoryAddress.NULL : _gtk_reserved7));
            return this;
        }
        
        public Build setGtkReserved8(java.lang.foreign.MemoryAddress _gtk_reserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved8 == null ? MemoryAddress.NULL : _gtk_reserved8));
            return this;
        }
    }
}
