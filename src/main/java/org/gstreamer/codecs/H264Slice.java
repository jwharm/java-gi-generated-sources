package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H264Slice extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264Slice";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("header"),
            Interop.valueLayout.ADDRESS.withName("nalu")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H264Slice}
     * @return A new, uninitialized @{link H264Slice}
     */
    public static H264Slice allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        H264Slice newInstance = new H264Slice(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code header}
     * @return The value of the field {@code header}
     */
    public java.lang.foreign.MemoryAddress getHeader() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code header}
     * @param header The new value of the field {@code header}
     */
    public void setHeader(java.lang.foreign.MemoryAddress header) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (header == null ? MemoryAddress.NULL : (Addressable) header));
    }
    
    /**
     * Get the value of the field {@code nalu}
     * @return The value of the field {@code nalu}
     */
    public java.lang.foreign.MemoryAddress getNalu() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code nalu}
     * @param nalu The new value of the field {@code nalu}
     */
    public void setNalu(java.lang.foreign.MemoryAddress nalu) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nalu == null ? MemoryAddress.NULL : (Addressable) nalu));
    }
    
    /**
     * Create a H264Slice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected H264Slice(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264Slice> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new H264Slice(input, ownership);
    
    /**
     * A {@link H264Slice.Builder} object constructs a {@link H264Slice} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link H264Slice.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final H264Slice struct;
        
        private Builder() {
            struct = H264Slice.allocate();
        }
        
         /**
         * Finish building the {@link H264Slice} struct.
         * @return A new instance of {@code H264Slice} with the fields 
         *         that were set in the Builder object.
         */
        public H264Slice build() {
            return struct;
        }
        
        public Builder setHeader(java.lang.foreign.MemoryAddress header) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("header"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (header == null ? MemoryAddress.NULL : (Addressable) header));
            return this;
        }
        
        public Builder setNalu(java.lang.foreign.MemoryAddress nalu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nalu == null ? MemoryAddress.NULL : (Addressable) nalu));
            return this;
        }
    }
}
