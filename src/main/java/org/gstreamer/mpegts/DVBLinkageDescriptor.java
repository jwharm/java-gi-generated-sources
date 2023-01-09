package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBLinkageDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
            Interop.valueLayout.C_SHORT.withName("original_network_id"),
            Interop.valueLayout.C_SHORT.withName("service_id"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("linkage_type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("linkage_data"),
            Interop.valueLayout.C_BYTE.withName("private_data_length"),
            MemoryLayout.paddingLayout(56),
            Interop.valueLayout.ADDRESS.withName("private_data_bytes")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DVBLinkageDescriptor}
     * @return A new, uninitialized @{link DVBLinkageDescriptor}
     */
    public static DVBLinkageDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DVBLinkageDescriptor newInstance = new DVBLinkageDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code transport_stream_id}
     * @return The value of the field {@code transport_stream_id}
     */
    public short getTransportStreamId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code transport_stream_id}
     * @param transportStreamId The new value of the field {@code transport_stream_id}
     */
    public void setTransportStreamId(short transportStreamId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), transportStreamId);
        }
    }
    
    /**
     * Get the value of the field {@code original_network_id}
     * @return The value of the field {@code original_network_id}
     */
    public short getOriginalNetworkId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code original_network_id}
     * @param originalNetworkId The new value of the field {@code original_network_id}
     */
    public void setOriginalNetworkId(short originalNetworkId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), originalNetworkId);
        }
    }
    
    /**
     * Get the value of the field {@code service_id}
     * @return The value of the field {@code service_id}
     */
    public short getServiceId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code service_id}
     * @param serviceId The new value of the field {@code service_id}
     */
    public void setServiceId(short serviceId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), serviceId);
        }
    }
    
    /**
     * Get the value of the field {@code linkage_type}
     * @return The value of the field {@code linkage_type}
     */
    public org.gstreamer.mpegts.DVBLinkageType getLinkageType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.DVBLinkageType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code linkage_type}
     * @param linkageType The new value of the field {@code linkage_type}
     */
    public void setLinkageType(org.gstreamer.mpegts.DVBLinkageType linkageType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (linkageType == null ? MemoryAddress.NULL : linkageType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code private_data_length}
     * @return The value of the field {@code private_data_length}
     */
    public byte getPrivateDataLength() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code private_data_length}
     * @param privateDataLength The new value of the field {@code private_data_length}
     */
    public void setPrivateDataLength(byte privateDataLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), privateDataLength);
        }
    }
    
    /**
     * Get the value of the field {@code private_data_bytes}
     * @return The value of the field {@code private_data_bytes}
     */
    public PointerByte getPrivateDataBytes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code private_data_bytes}
     * @param privateDataBytes The new value of the field {@code private_data_bytes}
     */
    public void setPrivateDataBytes(PointerByte privateDataBytes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (privateDataBytes == null ? MemoryAddress.NULL : privateDataBytes.handle()));
        }
    }
    
    /**
     * Create a DVBLinkageDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DVBLinkageDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DVBLinkageDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DVBLinkageDescriptor(input);
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_dvb_linkage_descriptor_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.mpegts.DVBLinkageEvent getEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_event.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.DVBLinkageEvent.fromAddress.marshal(RESULT, null);
    }
    
    public PointerProxy<org.gstreamer.mpegts.DVBLinkageExtendedEvent> getExtendedEvent() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_extended_event.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gstreamer.mpegts.DVBLinkageExtendedEvent>(RESULT, org.gstreamer.mpegts.DVBLinkageExtendedEvent.fromAddress);
        }
    }
    
    public org.gstreamer.mpegts.DVBLinkageMobileHandOver getMobileHandOver() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_mobile_hand_over.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.mpegts.DVBLinkageMobileHandOver.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_dvb_linkage_descriptor_free = Interop.downcallHandle(
                "gst_mpegts_dvb_linkage_descriptor_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_dvb_linkage_descriptor_get_event = Interop.downcallHandle(
                "gst_mpegts_dvb_linkage_descriptor_get_event",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_dvb_linkage_descriptor_get_extended_event = Interop.downcallHandle(
                "gst_mpegts_dvb_linkage_descriptor_get_extended_event",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_mpegts_dvb_linkage_descriptor_get_mobile_hand_over = Interop.downcallHandle(
                "gst_mpegts_dvb_linkage_descriptor_get_mobile_hand_over",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link DVBLinkageDescriptor.Builder} object constructs a {@link DVBLinkageDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DVBLinkageDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DVBLinkageDescriptor struct;
        
        private Builder() {
            struct = DVBLinkageDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link DVBLinkageDescriptor} struct.
         * @return A new instance of {@code DVBLinkageDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public DVBLinkageDescriptor build() {
            return struct;
        }
        
        /**
         * the transport id
         * @param transportStreamId The value for the {@code transportStreamId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransportStreamId(short transportStreamId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), transportStreamId);
                return this;
            }
        }
        
        /**
         * the original network id
         * @param originalNetworkId The value for the {@code originalNetworkId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOriginalNetworkId(short originalNetworkId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), originalNetworkId);
                return this;
            }
        }
        
        /**
         * the service id
         * @param serviceId The value for the {@code serviceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setServiceId(short serviceId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), serviceId);
                return this;
            }
        }
        
        /**
         * the type which {@code linkage_data} has
         * @param linkageType The value for the {@code linkageType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLinkageType(org.gstreamer.mpegts.DVBLinkageType linkageType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (linkageType == null ? MemoryAddress.NULL : linkageType.getValue()));
                return this;
            }
        }
        
        public Builder setLinkageData(java.lang.foreign.MemoryAddress linkageData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("linkage_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (linkageData == null ? MemoryAddress.NULL : (Addressable) linkageData));
                return this;
            }
        }
        
        /**
         * the length for {@code private_data_bytes}
         * @param privateDataLength The value for the {@code privateDataLength} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrivateDataLength(byte privateDataLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), privateDataLength);
                return this;
            }
        }
        
        /**
         * additional data bytes
         * @param privateDataBytes The value for the {@code privateDataBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrivateDataBytes(PointerByte privateDataBytes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (privateDataBytes == null ? MemoryAddress.NULL : privateDataBytes.handle()));
                return this;
            }
        }
    }
}
