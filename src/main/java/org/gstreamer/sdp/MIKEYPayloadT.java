package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The timestamp payload carries the timestamp information
 */
public class MIKEYPayloadT extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("ts_value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadT}
     * @return A new, uninitialized @{link MIKEYPayloadT}
     */
    public static MIKEYPayloadT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadT newInstance = new MIKEYPayloadT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload getPt() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pt}
     * @param pt The new value of the field {@code pt}
     */
    public void setPt(org.gstreamer.sdp.MIKEYPayload pt) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pt"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.sdp.MIKEYTSType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYTSType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.sdp.MIKEYTSType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    /**
     * Get the value of the field {@code ts_value}
     * @return The value of the field {@code ts_value}
     */
    public PointerByte getTsValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ts_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code ts_value}
     * @param tsValue The new value of the field {@code ts_value}
     */
    public void setTsValue(PointerByte tsValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ts_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tsValue == null ? MemoryAddress.NULL : tsValue.handle()));
    }
    
    /**
     * Create a MIKEYPayloadT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYPayloadT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadT(input, ownership);
    
    /**
     * A {@link MIKEYPayloadT.Builder} object constructs a {@link MIKEYPayloadT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadT struct;
        
        private Builder() {
            struct = MIKEYPayloadT.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadT} struct.
         * @return A new instance of {@code MIKEYPayloadT} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadT build() {
            return struct;
        }
        
        /**
         * the payload header
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPt(org.gstreamer.sdp.MIKEYPayload pt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
            return this;
        }
        
        /**
         * a {@link MIKEYTSType}
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.sdp.MIKEYTSType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the timestamp value
         * @param tsValue The value for the {@code tsValue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTsValue(PointerByte tsValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ts_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tsValue == null ? MemoryAddress.NULL : tsValue.handle()));
            return this;
        }
    }
}
