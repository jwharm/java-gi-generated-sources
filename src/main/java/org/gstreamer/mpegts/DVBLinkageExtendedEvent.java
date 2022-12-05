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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public short targetEventId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_event_id}
     * @param targetEventId The new value of the field {@code target_event_id}
     */
    public void targetEventId$set(short targetEventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
    }
    
    /**
     * Get the value of the field {@code target_listed}
     * @return The value of the field {@code target_listed}
     */
    public boolean targetListed$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code target_listed}
     * @param targetListed The new value of the field {@code target_listed}
     */
    public void targetListed$set(boolean targetListed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetListed ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code event_simulcast}
     * @return The value of the field {@code event_simulcast}
     */
    public boolean eventSimulcast$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code event_simulcast}
     * @param eventSimulcast The new value of the field {@code event_simulcast}
     */
    public void eventSimulcast$set(boolean eventSimulcast) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventSimulcast ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code link_type}
     * @return The value of the field {@code link_type}
     */
    public byte linkType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code link_type}
     * @param linkType The new value of the field {@code link_type}
     */
    public void linkType$set(byte linkType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), linkType);
    }
    
    /**
     * Get the value of the field {@code target_id_type}
     * @return The value of the field {@code target_id_type}
     */
    public byte targetIdType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_id_type}
     * @param targetIdType The new value of the field {@code target_id_type}
     */
    public void targetIdType$set(byte targetIdType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetIdType);
    }
    
    /**
     * Get the value of the field {@code original_network_id_flag}
     * @return The value of the field {@code original_network_id_flag}
     */
    public boolean originalNetworkIdFlag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code original_network_id_flag}
     * @param originalNetworkIdFlag The new value of the field {@code original_network_id_flag}
     */
    public void originalNetworkIdFlag$set(boolean originalNetworkIdFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkIdFlag ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code service_id_flag}
     * @return The value of the field {@code service_id_flag}
     */
    public boolean serviceIdFlag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code service_id_flag}
     * @param serviceIdFlag The new value of the field {@code service_id_flag}
     */
    public void serviceIdFlag$set(boolean serviceIdFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceIdFlag ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code user_defined_id}
     * @return The value of the field {@code user_defined_id}
     */
    public short userDefinedId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_defined_id}
     * @param userDefinedId The new value of the field {@code user_defined_id}
     */
    public void userDefinedId$set(short userDefinedId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), userDefinedId);
    }
    
    /**
     * Get the value of the field {@code target_transport_stream_id}
     * @return The value of the field {@code target_transport_stream_id}
     */
    public short targetTransportStreamId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_transport_stream_id}
     * @param targetTransportStreamId The new value of the field {@code target_transport_stream_id}
     */
    public void targetTransportStreamId$set(short targetTransportStreamId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetTransportStreamId);
    }
    
    /**
     * Get the value of the field {@code target_original_network_id}
     * @return The value of the field {@code target_original_network_id}
     */
    public short targetOriginalNetworkId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_original_network_id}
     * @param targetOriginalNetworkId The new value of the field {@code target_original_network_id}
     */
    public void targetOriginalNetworkId$set(short targetOriginalNetworkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetOriginalNetworkId);
    }
    
    /**
     * Get the value of the field {@code target_service_id}
     * @return The value of the field {@code target_service_id}
     */
    public short targetServiceId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_service_id}
     * @param targetServiceId The new value of the field {@code target_service_id}
     */
    public void targetServiceId$set(short targetServiceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetServiceId);
    }
    
    /**
     * Create a DVBLinkageExtendedEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DVBLinkageExtendedEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DVBLinkageExtendedEvent struct;
        
         /**
         * A {@link DVBLinkageExtendedEvent.Build} object constructs a {@link DVBLinkageExtendedEvent} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DVBLinkageExtendedEvent.allocate();
        }
        
         /**
         * Finish building the {@link DVBLinkageExtendedEvent} struct.
         * @return A new instance of {@code DVBLinkageExtendedEvent} with the fields 
         *         that were set in the Build object.
         */
        public DVBLinkageExtendedEvent construct() {
            return struct;
        }
        
        public Build setTargetEventId(short targetEventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
            return this;
        }
        
        public Build setTargetListed(boolean targetListed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetListed ? 1 : 0);
            return this;
        }
        
        public Build setEventSimulcast(boolean eventSimulcast) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventSimulcast ? 1 : 0);
            return this;
        }
        
        public Build setLinkType(byte linkType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("link_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), linkType);
            return this;
        }
        
        public Build setTargetIdType(byte targetIdType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_id_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetIdType);
            return this;
        }
        
        public Build setOriginalNetworkIdFlag(boolean originalNetworkIdFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkIdFlag ? 1 : 0);
            return this;
        }
        
        public Build setServiceIdFlag(boolean serviceIdFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceIdFlag ? 1 : 0);
            return this;
        }
        
        public Build setUserDefinedId(short userDefinedId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_defined_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), userDefinedId);
            return this;
        }
        
        public Build setTargetTransportStreamId(short targetTransportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetTransportStreamId);
            return this;
        }
        
        public Build setTargetOriginalNetworkId(short targetOriginalNetworkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetOriginalNetworkId);
            return this;
        }
        
        public Build setTargetServiceId(short targetServiceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetServiceId);
            return this;
        }
    }
}
