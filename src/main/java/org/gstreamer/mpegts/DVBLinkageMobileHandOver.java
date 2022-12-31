package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBLinkageMobileHandOver extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageMobileHandOver";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("hand_over_type"),
            Interop.valueLayout.C_INT.withName("origin_type"),
            Interop.valueLayout.C_SHORT.withName("network_id"),
            Interop.valueLayout.C_SHORT.withName("initial_service_id")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DVBLinkageMobileHandOver}
     * @return A new, uninitialized @{link DVBLinkageMobileHandOver}
     */
    public static DVBLinkageMobileHandOver allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DVBLinkageMobileHandOver newInstance = new DVBLinkageMobileHandOver(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code hand_over_type}
     * @return The value of the field {@code hand_over_type}
     */
    public org.gstreamer.mpegts.DVBLinkageHandOverType getHandOverType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hand_over_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBLinkageHandOverType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code hand_over_type}
     * @param handOverType The new value of the field {@code hand_over_type}
     */
    public void setHandOverType(org.gstreamer.mpegts.DVBLinkageHandOverType handOverType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hand_over_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handOverType == null ? MemoryAddress.NULL : handOverType.getValue()));
    }
    
    /**
     * Get the value of the field {@code origin_type}
     * @return The value of the field {@code origin_type}
     */
    public boolean getOriginType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("origin_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code origin_type}
     * @param originType The new value of the field {@code origin_type}
     */
    public void setOriginType(boolean originType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("origin_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(originType, null).intValue());
    }
    
    /**
     * Get the value of the field {@code network_id}
     * @return The value of the field {@code network_id}
     */
    public short getNetworkId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code network_id}
     * @param networkId The new value of the field {@code network_id}
     */
    public void setNetworkId(short networkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkId);
    }
    
    /**
     * Get the value of the field {@code initial_service_id}
     * @return The value of the field {@code initial_service_id}
     */
    public short getInitialServiceId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("initial_service_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code initial_service_id}
     * @param initialServiceId The new value of the field {@code initial_service_id}
     */
    public void setInitialServiceId(short initialServiceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("initial_service_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), initialServiceId);
    }
    
    /**
     * Create a DVBLinkageMobileHandOver proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DVBLinkageMobileHandOver(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DVBLinkageMobileHandOver> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DVBLinkageMobileHandOver(input, ownership);
    
    /**
     * A {@link DVBLinkageMobileHandOver.Builder} object constructs a {@link DVBLinkageMobileHandOver} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DVBLinkageMobileHandOver.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DVBLinkageMobileHandOver struct;
        
        private Builder() {
            struct = DVBLinkageMobileHandOver.allocate();
        }
        
         /**
         * Finish building the {@link DVBLinkageMobileHandOver} struct.
         * @return A new instance of {@code DVBLinkageMobileHandOver} with the fields 
         *         that were set in the Builder object.
         */
        public DVBLinkageMobileHandOver build() {
            return struct;
        }
        
        public Builder setHandOverType(org.gstreamer.mpegts.DVBLinkageHandOverType handOverType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hand_over_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handOverType == null ? MemoryAddress.NULL : handOverType.getValue()));
            return this;
        }
        
        public Builder setOriginType(boolean originType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(originType, null).intValue());
            return this;
        }
        
        public Builder setNetworkId(short networkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkId);
            return this;
        }
        
        public Builder setInitialServiceId(short initialServiceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("initial_service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), initialServiceId);
            return this;
        }
    }
}
