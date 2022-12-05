package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An ATSC EIT Event
 */
public class AtscEITEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscEITEvent";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("event_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("start_time"),
        Interop.valueLayout.C_BYTE.withName("etm_location"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("length_in_seconds"),
        Interop.valueLayout.ADDRESS.withName("titles"),
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
     * Allocate a new {@link AtscEITEvent}
     * @return A new, uninitialized @{link AtscEITEvent}
     */
    public static AtscEITEvent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscEITEvent newInstance = new AtscEITEvent(segment.address(), Ownership.NONE);
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
    public int startTime$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start_time}
     * @param startTime The new value of the field {@code start_time}
     */
    public void startTime$set(int startTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), startTime);
    }
    
    /**
     * Get the value of the field {@code etm_location}
     * @return The value of the field {@code etm_location}
     */
    public byte etmLocation$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_location"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code etm_location}
     * @param etmLocation The new value of the field {@code etm_location}
     */
    public void etmLocation$set(byte etmLocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_location"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), etmLocation);
    }
    
    /**
     * Get the value of the field {@code length_in_seconds}
     * @return The value of the field {@code length_in_seconds}
     */
    public int lengthInSeconds$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length_in_seconds"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length_in_seconds}
     * @param lengthInSeconds The new value of the field {@code length_in_seconds}
     */
    public void lengthInSeconds$set(int lengthInSeconds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length_in_seconds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lengthInSeconds);
    }
    
    /**
     * Create a AtscEITEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscEITEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscEITEvent struct;
        
         /**
         * A {@link AtscEITEvent.Build} object constructs a {@link AtscEITEvent} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscEITEvent.allocate();
        }
        
         /**
         * Finish building the {@link AtscEITEvent} struct.
         * @return A new instance of {@code AtscEITEvent} with the fields 
         *         that were set in the Build object.
         */
        public AtscEITEvent construct() {
            return struct;
        }
        
        /**
         * The event id
         * @param eventId The value for the {@code eventId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEventId(short eventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventId);
            return this;
        }
        
        /**
         * The start time
         * @param startTime The value for the {@code startTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStartTime(int startTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), startTime);
            return this;
        }
        
        /**
         * The etm location
         * @param etmLocation The value for the {@code etmLocation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEtmLocation(byte etmLocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("etm_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), etmLocation);
            return this;
        }
        
        /**
         * The length in seconds
         * @param lengthInSeconds The value for the {@code lengthInSeconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLengthInSeconds(int lengthInSeconds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length_in_seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lengthInSeconds);
            return this;
        }
        
        /**
         * the titles
         * @param titles The value for the {@code titles} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitles(org.gstreamer.mpegts.AtscMultString[] titles) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("titles"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (titles == null ? MemoryAddress.NULL : Interop.allocateNativeArray(titles, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * descriptors
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
