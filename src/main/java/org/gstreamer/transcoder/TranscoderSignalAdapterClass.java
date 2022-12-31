package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TranscoderSignalAdapterClass extends Struct {
    
    static {
        GstTranscoder.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoderSignalAdapterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TranscoderSignalAdapterClass}
     * @return A new, uninitialized @{link TranscoderSignalAdapterClass}
     */
    public static TranscoderSignalAdapterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TranscoderSignalAdapterClass newInstance = new TranscoderSignalAdapterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Create a TranscoderSignalAdapterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TranscoderSignalAdapterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TranscoderSignalAdapterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TranscoderSignalAdapterClass(input, ownership);
    
    /**
     * A {@link TranscoderSignalAdapterClass.Builder} object constructs a {@link TranscoderSignalAdapterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TranscoderSignalAdapterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TranscoderSignalAdapterClass struct;
        
        private Builder() {
            struct = TranscoderSignalAdapterClass.allocate();
        }
        
         /**
         * Finish building the {@link TranscoderSignalAdapterClass} struct.
         * @return A new instance of {@code TranscoderSignalAdapterClass} with the fields 
         *         that were set in the Builder object.
         */
        public TranscoderSignalAdapterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
    }
}
