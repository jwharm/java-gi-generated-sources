package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Event Information Table (ATSC)
 */
public class AtscEIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscEIT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("source_id"),
        Interop.valueLayout.C_BYTE.withName("protocol_version"),
        MemoryLayout.paddingLayout(40),
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
     * Allocate a new {@link AtscEIT}
     * @return A new, uninitialized @{link AtscEIT}
     */
    public static AtscEIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscEIT newInstance = new AtscEIT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code source_id}
     * @return The value of the field {@code source_id}
     */
    public short sourceId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code source_id}
     * @param sourceId The new value of the field {@code source_id}
     */
    public void sourceId$set(short sourceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceId);
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte protocolVersion$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void protocolVersion$set(byte protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Create a AtscEIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscEIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscEIT struct;
        
         /**
         * A {@link AtscEIT.Build} object constructs a {@link AtscEIT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscEIT.allocate();
        }
        
         /**
         * Finish building the {@link AtscEIT} struct.
         * @return A new instance of {@code AtscEIT} with the fields 
         *         that were set in the Build object.
         */
        public AtscEIT construct() {
            return struct;
        }
        
        /**
         * The source id
         * @param sourceId The value for the {@code sourceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSourceId(short sourceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceId);
            return this;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProtocolVersion(byte protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * Events
         * @param events The value for the {@code events} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEvents(org.gstreamer.mpegts.AtscEITEvent[] events) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (events == null ? MemoryAddress.NULL : Interop.allocateNativeArray(events, org.gstreamer.mpegts.AtscEITEvent.getMemoryLayout(), false)));
            return this;
        }
    }
}
