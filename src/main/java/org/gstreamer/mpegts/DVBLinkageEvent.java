package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBLinkageEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageEvent";
    
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
            Interop.valueLayout.C_INT.withName("event_simulcast")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DVBLinkageEvent}
     * @return A new, uninitialized @{link DVBLinkageEvent}
     */
    public static DVBLinkageEvent allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DVBLinkageEvent newInstance = new DVBLinkageEvent(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code target_event_id}
     * @return The value of the field {@code target_event_id}
     */
    public short getTargetEventId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code target_event_id}
     * @param targetEventId The new value of the field {@code target_event_id}
     */
    public void setTargetEventId(short targetEventId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), targetEventId);
        }
    }
    
    /**
     * Get the value of the field {@code target_listed}
     * @return The value of the field {@code target_listed}
     */
    public boolean getTargetListed() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code target_listed}
     * @param targetListed The new value of the field {@code target_listed}
     */
    public void setTargetListed(boolean targetListed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(targetListed, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code event_simulcast}
     * @return The value of the field {@code event_simulcast}
     */
    public boolean getEventSimulcast() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code event_simulcast}
     * @param eventSimulcast The new value of the field {@code event_simulcast}
     */
    public void setEventSimulcast(boolean eventSimulcast) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(eventSimulcast, null).intValue());
        }
    }
    
    /**
     * Create a DVBLinkageEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DVBLinkageEvent(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DVBLinkageEvent> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DVBLinkageEvent(input);
    
    /**
     * A {@link DVBLinkageEvent.Builder} object constructs a {@link DVBLinkageEvent} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DVBLinkageEvent.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DVBLinkageEvent struct;
        
        private Builder() {
            struct = DVBLinkageEvent.allocate();
        }
        
        /**
         * Finish building the {@link DVBLinkageEvent} struct.
         * @return A new instance of {@code DVBLinkageEvent} with the fields 
         *         that were set in the Builder object.
         */
        public DVBLinkageEvent build() {
            return struct;
        }
        
        public Builder setTargetEventId(short targetEventId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), targetEventId);
                return this;
            }
        }
        
        public Builder setTargetListed(boolean targetListed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(targetListed, null).intValue());
                return this;
            }
        }
        
        public Builder setEventSimulcast(boolean eventSimulcast) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(eventSimulcast, null).intValue());
                return this;
            }
        }
    }
}
