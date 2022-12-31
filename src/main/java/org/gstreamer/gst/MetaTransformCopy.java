package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra data passed to a "gst-copy" transform {@link MetaTransformFunction}.
 */
public class MetaTransformCopy extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMetaTransformCopy";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("region"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.C_LONG.withName("size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MetaTransformCopy}
     * @return A new, uninitialized @{link MetaTransformCopy}
     */
    public static MetaTransformCopy allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MetaTransformCopy newInstance = new MetaTransformCopy(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code region}
     * @return The value of the field {@code region}
     */
    public boolean getRegion() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("region"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code region}
     * @param region The new value of the field {@code region}
     */
    public void setRegion(boolean region) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("region"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(region, null).intValue());
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long getOffset() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(long offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long getSize() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Create a MetaTransformCopy proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MetaTransformCopy(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MetaTransformCopy> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MetaTransformCopy(input, ownership);
    
    /**
     * A {@link MetaTransformCopy.Builder} object constructs a {@link MetaTransformCopy} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MetaTransformCopy.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MetaTransformCopy struct;
        
        private Builder() {
            struct = MetaTransformCopy.allocate();
        }
        
         /**
         * Finish building the {@link MetaTransformCopy} struct.
         * @return A new instance of {@code MetaTransformCopy} with the fields 
         *         that were set in the Builder object.
         */
        public MetaTransformCopy build() {
            return struct;
        }
        
        /**
         * {@code true} if only region is copied
         * @param region The value for the {@code region} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRegion(boolean region) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("region"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(region, null).intValue());
            return this;
        }
        
        /**
         * the offset to copy, 0 if {@code region} is {@code false}, otherwise &gt; 0
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
            return this;
        }
        
        /**
         * the size to copy, -1 or the buffer size when {@code region} is {@code false}
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
    }
}
