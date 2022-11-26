package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CustomSorterClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCustomSorterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.SorterClass.getMemoryLayout().withName("parent_class")
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
     * Allocate a new {@link CustomSorterClass}
     * @return A new, uninitialized @{link CustomSorterClass}
     */
    public static CustomSorterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CustomSorterClass newInstance = new CustomSorterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.SorterClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.SorterClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a CustomSorterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CustomSorterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CustomSorterClass struct;
        
         /**
         * A {@link CustomSorterClass.Build} object constructs a {@link CustomSorterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CustomSorterClass.allocate();
        }
        
         /**
         * Finish building the {@link CustomSorterClass} struct.
         * @return A new instance of {@code CustomSorterClass} with the fields 
         *         that were set in the Build object.
         */
        public CustomSorterClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gtk.SorterClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
    }
}
