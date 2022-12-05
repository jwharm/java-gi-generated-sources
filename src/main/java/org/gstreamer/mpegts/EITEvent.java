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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("event_id"),
        MemoryLayout.paddingLayout(48),
        Interop.valueLayout.ADDRESS.withName("start_time"),
        Interop.valueLayout.C_INT.withName("duration"),
        Interop.valueLayout.C_INT.withName("running_status"),
        Interop.valueLayout.C_INT.withName("free_CA_mode"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("descriptors")
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
    public short eventId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code event_id}
     * @param eventId The new value of the field {@code event_id}
     */
    public void eventId$set(short eventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventId);
    }
    
    /**
     * Get the value of the field {@code start_time}
     * @return The value of the field {@code start_time}
     */
    public org.gstreamer.gst.DateTime startTime$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.DateTime(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code start_time}
     * @param startTime The new value of the field {@code start_time}
     */
    public void startTime$set(org.gstreamer.gst.DateTime startTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startTime.handle());
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public int duration$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void duration$set(int duration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
    }
    
    /**
     * Get the value of the field {@code running_status}
     * @return The value of the field {@code running_status}
     */
    public org.gstreamer.mpegts.RunningStatus runningStatus$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.RunningStatus.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code running_status}
     * @param runningStatus The new value of the field {@code running_status}
     */
    public void runningStatus$set(org.gstreamer.mpegts.RunningStatus runningStatus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), runningStatus.getValue());
    }
    
    /**
     * Get the value of the field {@code free_CA_mode}
     * @return The value of the field {@code free_CA_mode}
     */
    public boolean freeCAMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code free_CA_mode}
     * @param freeCAMode The new value of the field {@code free_CA_mode}
     */
    public void freeCAMode$set(boolean freeCAMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), freeCAMode ? 1 : 0);
    }
    
    /**
     * Create a EITEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EITEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private EITEvent struct;
        
         /**
         * A {@link EITEvent.Build} object constructs a {@link EITEvent} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = EITEvent.allocate();
        }
        
         /**
         * Finish building the {@link EITEvent} struct.
         * @return A new instance of {@code EITEvent} with the fields 
         *         that were set in the Build object.
         */
        public EITEvent construct() {
            return struct;
        }
        
        public Build setEventId(short eventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventId);
            return this;
        }
        
        public Build setStartTime(org.gstreamer.gst.DateTime startTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startTime == null ? MemoryAddress.NULL : startTime.handle()));
            return this;
        }
        
        public Build setDuration(int duration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), duration);
            return this;
        }
        
        public Build setRunningStatus(org.gstreamer.mpegts.RunningStatus runningStatus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runningStatus == null ? MemoryAddress.NULL : runningStatus.getValue()));
            return this;
        }
        
        public Build setFreeCAMode(boolean freeCAMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), freeCAMode ? 1 : 0);
            return this;
        }
        
        /**
         * List of descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
    }
}
