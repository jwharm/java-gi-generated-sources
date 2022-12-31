package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents both:
 *   Terrestrial Virtual Channel Table (A65)
 *   Cable Virtual Channel Table (A65)
 */
public class AtscVCT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscVCT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
            Interop.valueLayout.C_BYTE.withName("protocol_version"),
            MemoryLayout.paddingLayout(40),
            Interop.valueLayout.ADDRESS.withName("sources"),
            Interop.valueLayout.ADDRESS.withName("descriptors")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscVCT}
     * @return A new, uninitialized @{link AtscVCT}
     */
    public static AtscVCT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscVCT newInstance = new AtscVCT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code transport_stream_id}
     * @return The value of the field {@code transport_stream_id}
     */
    public short getTransportStreamId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code transport_stream_id}
     * @param transportStreamId The new value of the field {@code transport_stream_id}
     */
    public void setTransportStreamId(short transportStreamId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
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
     * Get the value of the field {@code sources}
     * @return The value of the field {@code sources}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscVCTSource> getSources() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sources"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscVCTSource>(RESULT, org.gstreamer.mpegts.AtscVCTSource.fromAddress);
    }
    
    /**
     * Change the value of the field {@code sources}
     * @param sources The new value of the field {@code sources}
     */
    public void setSources(org.gstreamer.mpegts.AtscVCTSource[] sources) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sources"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sources == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sources, org.gstreamer.mpegts.AtscVCTSource.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getDescriptors() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
    }
    
    /**
     * Create a AtscVCT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscVCT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscVCT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscVCT(input, ownership);
    
    /**
     * A {@link AtscVCT.Builder} object constructs a {@link AtscVCT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscVCT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscVCT struct;
        
        private Builder() {
            struct = AtscVCT.allocate();
        }
        
         /**
         * Finish building the {@link AtscVCT} struct.
         * @return A new instance of {@code AtscVCT} with the fields 
         *         that were set in the Builder object.
         */
        public AtscVCT build() {
            return struct;
        }
        
        /**
         * The transport stream
         * @param transportStreamId The value for the {@code transportStreamId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransportStreamId(short transportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
            return this;
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
         * sources
         * @param sources The value for the {@code sources} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSources(org.gstreamer.mpegts.AtscVCTSource[] sources) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sources"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sources == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sources, org.gstreamer.mpegts.AtscVCTSource.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
    }
}
