package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MediaControlsClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaControlsClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MediaControlsClass}
     * @return A new, uninitialized @{link MediaControlsClass}
     */
    public static MediaControlsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MediaControlsClass newInstance = new MediaControlsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Create a MediaControlsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MediaControlsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MediaControlsClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MediaControlsClass(input, ownership);
    
    /**
     * A {@link MediaControlsClass.Builder} object constructs a {@link MediaControlsClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MediaControlsClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MediaControlsClass struct;
        
        private Builder() {
            struct = MediaControlsClass.allocate();
        }
        
         /**
         * Finish building the {@link MediaControlsClass} struct.
         * @return A new instance of {@code MediaControlsClass} with the fields 
         *         that were set in the Builder object.
         */
        public MediaControlsClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
    }
}
