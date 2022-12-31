package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class OverlayLayoutChildClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkOverlayLayoutChildClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.LayoutChildClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OverlayLayoutChildClass}
     * @return A new, uninitialized @{link OverlayLayoutChildClass}
     */
    public static OverlayLayoutChildClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OverlayLayoutChildClass newInstance = new OverlayLayoutChildClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.LayoutChildClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.LayoutChildClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.LayoutChildClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Create a OverlayLayoutChildClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OverlayLayoutChildClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OverlayLayoutChildClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OverlayLayoutChildClass(input, ownership);
    
    /**
     * A {@link OverlayLayoutChildClass.Builder} object constructs a {@link OverlayLayoutChildClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OverlayLayoutChildClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OverlayLayoutChildClass struct;
        
        private Builder() {
            struct = OverlayLayoutChildClass.allocate();
        }
        
         /**
         * Finish building the {@link OverlayLayoutChildClass} struct.
         * @return A new instance of {@code OverlayLayoutChildClass} with the fields 
         *         that were set in the Builder object.
         */
        public OverlayLayoutChildClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.LayoutChildClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
    }
}
