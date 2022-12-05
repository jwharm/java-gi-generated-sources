package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Event Information Table (EN 300 468)
 */
public class EIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsEIT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
        Interop.valueLayout.C_SHORT.withName("original_network_id"),
        Interop.valueLayout.C_BYTE.withName("segment_last_section_number"),
        Interop.valueLayout.C_BYTE.withName("last_table_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("actual_stream"),
        Interop.valueLayout.C_INT.withName("present_following"),
        Interop.valueLayout.ADDRESS.withName("events")
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
     * Allocate a new {@link EIT}
     * @return A new, uninitialized @{link EIT}
     */
    public static EIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EIT newInstance = new EIT(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code segment_last_section_number}
     * @return The value of the field {@code segment_last_section_number}
     */
    public byte segmentLastSectionNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segment_last_section_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segment_last_section_number}
     * @param segmentLastSectionNumber The new value of the field {@code segment_last_section_number}
     */
    public void segmentLastSectionNumber$set(byte segmentLastSectionNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segment_last_section_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentLastSectionNumber);
    }
    
    /**
     * Get the value of the field {@code last_table_id}
     * @return The value of the field {@code last_table_id}
     */
    public byte lastTableId$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_table_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code last_table_id}
     * @param lastTableId The new value of the field {@code last_table_id}
     */
    public void lastTableId$set(byte lastTableId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("last_table_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastTableId);
    }
    
    /**
     * Get the value of the field {@code actual_stream}
     * @return The value of the field {@code actual_stream}
     */
    public boolean actualStream$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_stream"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code actual_stream}
     * @param actualStream The new value of the field {@code actual_stream}
     */
    public void actualStream$set(boolean actualStream) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_stream"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), actualStream ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code present_following}
     * @return The value of the field {@code present_following}
     */
    public boolean presentFollowing$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("present_following"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code present_following}
     * @param presentFollowing The new value of the field {@code present_following}
     */
    public void presentFollowing$set(boolean presentFollowing) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("present_following"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), presentFollowing ? 1 : 0);
    }
    
    /**
     * Create a EIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private EIT struct;
        
         /**
         * A {@link EIT.Build} object constructs a {@link EIT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = EIT.allocate();
        }
        
         /**
         * Finish building the {@link EIT} struct.
         * @return A new instance of {@code EIT} with the fields 
         *         that were set in the Build object.
         */
        public EIT construct() {
            return struct;
        }
        
        public Build setTransportStreamId(short transportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
            return this;
        }
        
        public Build setOriginalNetworkId(short originalNetworkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkId);
            return this;
        }
        
        public Build setSegmentLastSectionNumber(byte segmentLastSectionNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segment_last_section_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentLastSectionNumber);
            return this;
        }
        
        public Build setLastTableId(byte lastTableId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("last_table_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lastTableId);
            return this;
        }
        
        public Build setActualStream(boolean actualStream) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("actual_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), actualStream ? 1 : 0);
            return this;
        }
        
        public Build setPresentFollowing(boolean presentFollowing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("present_following"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), presentFollowing ? 1 : 0);
            return this;
        }
        
        /**
         * List of events
         * @param events The value for the {@code events} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEvents(org.gstreamer.mpegts.EITEvent[] events) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (events == null ? MemoryAddress.NULL : Interop.allocateNativeArray(events, org.gstreamer.mpegts.EITEvent.getMemoryLayout(), false)));
            return this;
        }
    }
}
