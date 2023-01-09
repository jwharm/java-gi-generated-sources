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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.SorterClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CustomSorterClass}
     * @return A new, uninitialized @{link CustomSorterClass}
     */
    public static CustomSorterClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CustomSorterClass newInstance = new CustomSorterClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.SorterClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.SorterClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.SorterClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Create a CustomSorterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CustomSorterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CustomSorterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CustomSorterClass(input);
    
    /**
     * A {@link CustomSorterClass.Builder} object constructs a {@link CustomSorterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CustomSorterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CustomSorterClass struct;
        
        private Builder() {
            struct = CustomSorterClass.allocate();
        }
        
        /**
         * Finish building the {@link CustomSorterClass} struct.
         * @return A new instance of {@code CustomSorterClass} with the fields 
         *         that were set in the Builder object.
         */
        public CustomSorterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.SorterClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
    }
}
