package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBLinkageExtendedEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageExtendedEvent";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("target_event_id"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("target_listed"),
            Interop.valueLayout.C_INT.withName("event_simulcast"),
            Interop.valueLayout.C_BYTE.withName("link_type"),
            Interop.valueLayout.C_BYTE.withName("target_id_type"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("original_network_id_flag"),
            Interop.valueLayout.C_INT.withName("service_id_flag"),
            Interop.valueLayout.C_SHORT.withName("user_defined_id"),
            Interop.valueLayout.C_SHORT.withName("target_transport_stream_id"),
            Interop.valueLayout.C_SHORT.withName("target_original_network_id"),
            Interop.valueLayout.C_SHORT.withName("target_service_id")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DVBLinkageExtendedEvent}
     * @return A new, uninitialized @{link DVBLinkageExtendedEvent}
     */
    public static DVBLinkageExtendedEvent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DVBLinkageExtendedEvent newInstance = new DVBLinkageExtendedEvent(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code target_event_id}
     * @return The value of the field {@code target_event_id}
     */
    public short getTargetEventId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_event_id}
     * @param targetEventId The new value of the field {@code target_event_id}
     */
    public void setTargetEventId(short targetEventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
    }
    
    /**
     * Get the value of the field {@code target_listed}
     * @return The value of the field {@code target_listed}
     */
    public boolean getTargetListed() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code target_listed}
     * @param targetListed The new value of the field {@code target_listed}
     */
    public void setTargetListed(boolean targetListed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(targetListed, null).intValue());
    }
    
    /**
     * Get the value of the field {@code event_simulcast}
     * @return The value of the field {@code event_simulcast}
     */
    public boolean getEventSimulcast() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code event_simulcast}
     * @param eventSimulcast The new value of the field {@code event_simulcast}
     */
    public void setEventSimulcast(boolean eventSimulcast) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(eventSimulcast, null).intValue());
    }
    
    /**
     * Get the value of the field {@code link_type}
     * @return The value of the field {@code link_type}
     */
    public byte getLinkType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code link_type}
     * @param linkType The new value of the field {@code link_type}
     */
    public void setLinkType(byte linkType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), linkType);
    }
    
    /**
     * Get the value of the field {@code target_id_type}
     * @return The value of the field {@code target_id_type}
     */
    public byte getTargetIdType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_id_type}
     * @param targetIdType The new value of the field {@code target_id_type}
     */
    public void setTargetIdType(byte targetIdType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetIdType);
    }
    
    /**
     * Get the value of the field {@code original_network_id_flag}
     * @return The value of the field {@code original_network_id_flag}
     */
    public boolean getOriginalNetworkIdFlag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code original_network_id_flag}
     * @param originalNetworkIdFlag The new value of the field {@code original_network_id_flag}
     */
    public void setOriginalNetworkIdFlag(boolean originalNetworkIdFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(originalNetworkIdFlag, null).intValue());
    }
    
    /**
     * Get the value of the field {@code service_id_flag}
     * @return The value of the field {@code service_id_flag}
     */
    public boolean getServiceIdFlag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code service_id_flag}
     * @param serviceIdFlag The new value of the field {@code service_id_flag}
     */
    public void setServiceIdFlag(boolean serviceIdFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(serviceIdFlag, null).intValue());
    }
    
    /**
     * Get the value of the field {@code user_defined_id}
     * @return The value of the field {@code user_defined_id}
     */
    public short getUserDefinedId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_defined_id}
     * @param userDefinedId The new value of the field {@code user_defined_id}
     */
    public void setUserDefinedId(short userDefinedId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), userDefinedId);
    }
    
    /**
     * Get the value of the field {@code target_transport_stream_id}
     * @return The value of the field {@code target_transport_stream_id}
     */
    public short getTargetTransportStreamId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_transport_stream_id}
     * @param targetTransportStreamId The new value of the field {@code target_transport_stream_id}
     */
    public void setTargetTransportStreamId(short targetTransportStreamId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetTransportStreamId);
    }
    
    /**
     * Get the value of the field {@code target_original_network_id}
     * @return The value of the field {@code target_original_network_id}
     */
    public short getTargetOriginalNetworkId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_original_network_id}
     * @param targetOriginalNetworkId The new value of the field {@code target_original_network_id}
     */
    public void setTargetOriginalNetworkId(short targetOriginalNetworkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetOriginalNetworkId);
    }
    
    /**
     * Get the value of the field {@code target_service_id}
     * @return The value of the field {@code target_service_id}
     */
    public short getTargetServiceId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_service_id}
     * @param targetServiceId The new value of the field {@code target_service_id}
     */
    public void setTargetServiceId(short targetServiceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetServiceId);
    }
    
    /**
     * Create a DVBLinkageExtendedEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DVBLinkageExtendedEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DVBLinkageExtendedEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DVBLinkageExtendedEvent(input, ownership);
    
    /**
     * A {@link DVBLinkageExtendedEvent.Builder} object constructs a {@link DVBLinkageExtendedEvent} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DVBLinkageExtendedEvent.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DVBLinkageExtendedEvent struct;
        
        private Builder() {
            struct = DVBLinkageExtendedEvent.allocate();
        }
        
         /**
         * Finish building the {@link DVBLinkageExtendedEvent} struct.
         * @return A new instance of {@code DVBLinkageExtendedEvent} with the fields 
         *         that were set in the Builder object.
         */
        public DVBLinkageExtendedEvent build() {
            return struct;
        }
        
        public Builder setTargetEventId(short targetEventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
            return this;
        }
        
        public Builder setTargetListed(boolean targetListed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(targetListed, null).intValue());
            return this;
        }
        
        public Builder setEventSimulcast(boolean eventSimulcast) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(eventSimulcast, null).intValue());
            return this;
        }
        
        public Builder setLinkType(byte linkType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), linkType);
            return this;
        }
        
        public Builder setTargetIdType(byte targetIdType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetIdType);
            return this;
        }
        
        public Builder setOriginalNetworkIdFlag(boolean originalNetworkIdFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(originalNetworkIdFlag, null).intValue());
            return this;
        }
        
        public Builder setServiceIdFlag(boolean serviceIdFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(serviceIdFlag, null).intValue());
            return this;
        }
        
        public Builder setUserDefinedId(short userDefinedId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), userDefinedId);
            return this;
        }
        
        public Builder setTargetTransportStreamId(short targetTransportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetTransportStreamId);
            return this;
        }
        
        public Builder setTargetOriginalNetworkId(short targetOriginalNetworkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetOriginalNetworkId);
            return this;
        }
        
        public Builder setTargetServiceId(short targetServiceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetServiceId);
            return this;
        }
    }
}
