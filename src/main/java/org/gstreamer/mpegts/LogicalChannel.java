package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LogicalChannel extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsLogicalChannel";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("service_id"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("visible_service"),
            Interop.valueLayout.C_SHORT.withName("logical_channel_number")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LogicalChannel}
     * @return A new, uninitialized @{link LogicalChannel}
     */
    public static LogicalChannel allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LogicalChannel newInstance = new LogicalChannel(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
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
     * Get the value of the field {@code visible_service}
     * @return The value of the field {@code visible_service}
     */
    public boolean getVisibleService() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code visible_service}
     * @param visibleService The new value of the field {@code visible_service}
     */
    public void setVisibleService(boolean visibleService) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(visibleService, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code logical_channel_number}
     * @return The value of the field {@code logical_channel_number}
     */
    public short getLogicalChannelNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code logical_channel_number}
     * @param logicalChannelNumber The new value of the field {@code logical_channel_number}
     */
    public void setLogicalChannelNumber(short logicalChannelNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), logicalChannelNumber);
        }
    }
    
    /**
     * Create a LogicalChannel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LogicalChannel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LogicalChannel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LogicalChannel(input);
    
    /**
     * A {@link LogicalChannel.Builder} object constructs a {@link LogicalChannel} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LogicalChannel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LogicalChannel struct;
        
        private Builder() {
            struct = LogicalChannel.allocate();
        }
        
        /**
         * Finish building the {@link LogicalChannel} struct.
         * @return A new instance of {@code LogicalChannel} with the fields 
         *         that were set in the Builder object.
         */
        public LogicalChannel build() {
            return struct;
        }
        
        public Builder setServiceId(short serviceId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), serviceId);
                return this;
            }
        }
        
        public Builder setVisibleService(boolean visibleService) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(visibleService, null).intValue());
                return this;
            }
        }
        
        public Builder setLogicalChannelNumber(short logicalChannelNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), logicalChannelNumber);
                return this;
            }
        }
    }
}
