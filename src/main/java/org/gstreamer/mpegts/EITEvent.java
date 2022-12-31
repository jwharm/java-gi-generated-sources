package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Event from a {@code GstMpegtsEIT}
 */
public class EITEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsEITEvent";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("event_id"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("start_time"),
            Interop.valueLayout.C_INT.withName("duration"),
            Interop.valueLayout.C_INT.withName("running_status"),
            Interop.valueLayout.C_INT.withName("free_CA_mode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("descriptors")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link EITEvent}
     * @return A new, uninitialized @{link EITEvent}
     */
    public static EITEvent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EITEvent newInstance = new EITEvent(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code event_id}
     * @return The value of the field {@code event_id}
     */
    public short getEventId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code event_id}
     * @param eventId The new value of the field {@code event_id}
     */
    public void setEventId(short eventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventId);
    }
    
    /**
     * Get the value of the field {@code start_time}
     * @return The value of the field {@code start_time}
     */
    public org.gstreamer.gst.DateTime getStartTime() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code start_time}
     * @param startTime The new value of the field {@code start_time}
     */
    public void setStartTime(org.gstreamer.gst.DateTime startTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startTime == null ? MemoryAddress.NULL : startTime.handle()));
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public int getDuration() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void setDuration(int duration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
    }
    
    /**
     * Get the value of the field {@code running_status}
     * @return The value of the field {@code running_status}
     */
    public org.gstreamer.mpegts.RunningStatus getRunningStatus() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.RunningStatus.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code running_status}
     * @param runningStatus The new value of the field {@code running_status}
     */
    public void setRunningStatus(org.gstreamer.mpegts.RunningStatus runningStatus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runningStatus == null ? MemoryAddress.NULL : runningStatus.getValue()));
    }
    
    /**
     * Get the value of the field {@code free_CA_mode}
     * @return The value of the field {@code free_CA_mode}
     */
    public boolean getFreeCAMode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code free_CA_mode}
     * @param freeCAMode The new value of the field {@code free_CA_mode}
     */
    public void setFreeCAMode(boolean freeCAMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(freeCAMode, null).intValue());
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
     * Create a EITEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EITEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EITEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EITEvent(input, ownership);
    
    /**
     * A {@link EITEvent.Builder} object constructs a {@link EITEvent} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link EITEvent.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final EITEvent struct;
        
        private Builder() {
            struct = EITEvent.allocate();
        }
        
         /**
         * Finish building the {@link EITEvent} struct.
         * @return A new instance of {@code EITEvent} with the fields 
         *         that were set in the Builder object.
         */
        public EITEvent build() {
            return struct;
        }
        
        public Builder setEventId(short eventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventId);
            return this;
        }
        
        public Builder setStartTime(org.gstreamer.gst.DateTime startTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startTime == null ? MemoryAddress.NULL : startTime.handle()));
            return this;
        }
        
        public Builder setDuration(int duration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
            return this;
        }
        
        public Builder setRunningStatus(org.gstreamer.mpegts.RunningStatus runningStatus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runningStatus == null ? MemoryAddress.NULL : runningStatus.getValue()));
            return this;
        }
        
        public Builder setFreeCAMode(boolean freeCAMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(freeCAMode, null).intValue());
            return this;
        }
        
        /**
         * List of descriptors
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
