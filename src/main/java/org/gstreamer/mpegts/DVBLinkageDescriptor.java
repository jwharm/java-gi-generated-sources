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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link DVBLinkageDescriptor}
     * @return A new, uninitialized @{link DVBLinkageDescriptor}
     */
    public static DVBLinkageDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DVBLinkageDescriptor newInstance = new DVBLinkageDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code transport_stream_id}
     * @return The value of the field {@code transport_stream_id}
     */
    public short transportStreamId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code transport_stream_id}
     * @param transportStreamId The new value of the field {@code transport_stream_id}
     */
    public void transportStreamId$set(short transportStreamId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
    }
    
    /**
     * Get the value of the field {@code original_network_id}
     * @return The value of the field {@code original_network_id}
     */
    public short originalNetworkId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code original_network_id}
     * @param originalNetworkId The new value of the field {@code original_network_id}
     */
    public void originalNetworkId$set(short originalNetworkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkId);
    }
    
    /**
     * Get the value of the field {@code service_id}
     * @return The value of the field {@code service_id}
     */
    public short serviceId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code service_id}
     * @param serviceId The new value of the field {@code service_id}
     */
    public void serviceId$set(short serviceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceId);
    }
    
    /**
     * Get the value of the field {@code linkage_type}
     * @return The value of the field {@code linkage_type}
     */
    public org.gstreamer.mpegts.DVBLinkageType linkageType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBLinkageType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code linkage_type}
     * @param linkageType The new value of the field {@code linkage_type}
     */
    public void linkageType$set(org.gstreamer.mpegts.DVBLinkageType linkageType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), linkageType.getValue());
    }
    
    /**
     * Get the value of the field {@code private_data_length}
     * @return The value of the field {@code private_data_length}
     */
    public byte privateDataLength$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code private_data_length}
     * @param privateDataLength The new value of the field {@code private_data_length}
     */
    public void privateDataLength$set(byte privateDataLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), privateDataLength);
    }
    
    /**
     * Get the value of the field {@code private_data_bytes}
     * @return The value of the field {@code private_data_bytes}
     */
    public PointerByte privateDataBytes$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code private_data_bytes}
     * @param privateDataBytes The new value of the field {@code private_data_bytes}
     */
    public void privateDataBytes$set(PointerByte privateDataBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), privateDataBytes.handle());
    }
    
    /**
     * Create a DVBLinkageDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DVBLinkageDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_dvb_linkage_descriptor_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.mpegts.DVBLinkageEvent getEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.DVBLinkageEvent(RESULT, Ownership.NONE);
    }
    
    public @NotNull PointerProxy<org.gstreamer.mpegts.DVBLinkageExtendedEvent> getExtendedEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_extended_event.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.mpegts.DVBLinkageExtendedEvent>(RESULT, org.gstreamer.mpegts.DVBLinkageExtendedEvent.class);
    }
    
    public @NotNull org.gstreamer.mpegts.DVBLinkageMobileHandOver getMobileHandOver() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_dvb_linkage_descriptor_get_mobile_hand_over.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.mpegts.DVBLinkageMobileHandOver(RESULT, Ownership.NONE);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DVBLinkageDescriptor struct;
        
         /**
         * A {@link DVBLinkageDescriptor.Build} object constructs a {@link DVBLinkageDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DVBLinkageDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link DVBLinkageDescriptor} struct.
         * @return A new instance of {@code DVBLinkageDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public DVBLinkageDescriptor construct() {
            return struct;
        }
        
        /**
         * the transport id
         * @param transportStreamId The value for the {@code transportStreamId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransportStreamId(short transportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
            return this;
        }
        
        /**
         * the original network id
         * @param originalNetworkId The value for the {@code originalNetworkId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOriginalNetworkId(short originalNetworkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkId);
            return this;
        }
        
        /**
         * the service id
         * @param serviceId The value for the {@code serviceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setServiceId(short serviceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceId);
            return this;
        }
        
        /**
         * the type which {@code linkage_data} has
         * @param linkageType The value for the {@code linkageType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLinkageType(org.gstreamer.mpegts.DVBLinkageType linkageType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("linkage_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (linkageType == null ? MemoryAddress.NULL : linkageType.getValue()));
            return this;
        }
        
        public Build setLinkageData(java.lang.foreign.MemoryAddress linkageData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("linkage_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (linkageData == null ? MemoryAddress.NULL : (Addressable) linkageData));
            return this;
        }
        
        /**
         * the length for {@code private_data_bytes}
         * @param privateDataLength The value for the {@code privateDataLength} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrivateDataLength(byte privateDataLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), privateDataLength);
            return this;
        }
        
        /**
         * additional data bytes
         * @param privateDataBytes The value for the {@code privateDataBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrivateDataBytes(PointerByte privateDataBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("private_data_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (privateDataBytes == null ? MemoryAddress.NULL : privateDataBytes.handle()));
            return this;
        }
    }
}
