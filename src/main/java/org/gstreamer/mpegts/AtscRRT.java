package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Region Rating Table (A65)
 * @version 1.18
 */
public class AtscRRT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscRRT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("protocol_version"),
            MemoryLayout.paddingLayout(56),
            Interop.valueLayout.ADDRESS.withName("names"),
            Interop.valueLayout.C_BYTE.withName("dimensions_defined"),
            MemoryLayout.paddingLayout(56),
            Interop.valueLayout.ADDRESS.withName("dimensions"),
            Interop.valueLayout.ADDRESS.withName("descriptors")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscRRT}
     * @return A new, uninitialized @{link AtscRRT}
     */
    public static AtscRRT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscRRT newInstance = new AtscRRT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte getProtocolVersion() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void setProtocolVersion(byte protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code names}
     * @return The value of the field {@code names}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscMultString> getNames() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("names"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscMultString>(RESULT, org.gstreamer.mpegts.AtscMultString.fromAddress);
    }
    
    /**
     * Change the value of the field {@code names}
     * @param names The new value of the field {@code names}
     */
    public void setNames(org.gstreamer.mpegts.AtscMultString[] names) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("names"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code dimensions_defined}
     * @return The value of the field {@code dimensions_defined}
     */
    public byte getDimensionsDefined() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dimensions_defined}
     * @param dimensionsDefined The new value of the field {@code dimensions_defined}
     */
    public void setDimensionsDefined(byte dimensionsDefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dimensionsDefined);
    }
    
    /**
     * Get the value of the field {@code dimensions}
     * @return The value of the field {@code dimensions}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscRRTDimension> getDimensions() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscRRTDimension>(RESULT, org.gstreamer.mpegts.AtscRRTDimension.fromAddress);
    }
    
    /**
     * Change the value of the field {@code dimensions}
     * @param dimensions The new value of the field {@code dimensions}
     */
    public void setDimensions(org.gstreamer.mpegts.AtscRRTDimension[] dimensions) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dimensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dimensions, org.gstreamer.mpegts.AtscRRTDimension.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerAddress getDescriptors() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false)));
    }
    
    /**
     * Create a AtscRRT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscRRT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscRRT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscRRT(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_rrt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscRRT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_rrt_new = Interop.downcallHandle(
            "gst_mpegts_atsc_rrt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AtscRRT.Builder} object constructs a {@link AtscRRT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscRRT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscRRT struct;
        
        private Builder() {
            struct = AtscRRT.allocate();
        }
        
         /**
         * Finish building the {@link AtscRRT} struct.
         * @return A new instance of {@code AtscRRT} with the fields 
         *         that were set in the Builder object.
         */
        public AtscRRT build() {
            return struct;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProtocolVersion(byte protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * the names
         * @param names The value for the {@code names} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNames(org.gstreamer.mpegts.AtscMultString[] names) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * the number of dimensions defined for this rating table
         * @param dimensionsDefined The value for the {@code dimensionsDefined} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDimensionsDefined(byte dimensionsDefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dimensionsDefined);
            return this;
        }
        
        /**
         * A set of dimensions
         * @param dimensions The value for the {@code dimensions} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDimensions(org.gstreamer.mpegts.AtscRRTDimension[] dimensions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dimensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dimensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dimensions, org.gstreamer.mpegts.AtscRRTDimension.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false)));
            return this;
        }
    }
}
