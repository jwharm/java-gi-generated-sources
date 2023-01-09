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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("source_id"),
            Interop.valueLayout.C_BYTE.withName("protocol_version"),
            MemoryLayout.paddingLayout(40),
            Interop.valueLayout.ADDRESS.withName("events")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscEIT}
     * @return A new, uninitialized @{link AtscEIT}
     */
    public static AtscEIT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AtscEIT newInstance = new AtscEIT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code source_id}
     * @return The value of the field {@code source_id}
     */
    public short getSourceId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code source_id}
     * @param sourceId The new value of the field {@code source_id}
     */
    public void setSourceId(short sourceId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), sourceId);
        }
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte getProtocolVersion() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void setProtocolVersion(byte protocolVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), protocolVersion);
        }
    }
    
    /**
     * Get the value of the field {@code events}
     * @return The value of the field {@code events}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscEITEvent> getEvents() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.AtscEITEvent>(RESULT, org.gstreamer.mpegts.AtscEITEvent.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code events}
     * @param events The new value of the field {@code events}
     */
    public void setEvents(org.gstreamer.mpegts.AtscEITEvent[] events) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (events == null ? MemoryAddress.NULL : Interop.allocateNativeArray(events, org.gstreamer.mpegts.AtscEITEvent.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a AtscEIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AtscEIT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscEIT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AtscEIT(input);
    
    /**
     * A {@link AtscEIT.Builder} object constructs a {@link AtscEIT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscEIT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscEIT struct;
        
        private Builder() {
            struct = AtscEIT.allocate();
        }
        
        /**
         * Finish building the {@link AtscEIT} struct.
         * @return A new instance of {@code AtscEIT} with the fields 
         *         that were set in the Builder object.
         */
        public AtscEIT build() {
            return struct;
        }
        
        /**
         * The source id
         * @param sourceId The value for the {@code sourceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSourceId(short sourceId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sourceId);
                return this;
            }
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProtocolVersion(byte protocolVersion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), protocolVersion);
                return this;
            }
        }
        
        /**
         * Events
         * @param events The value for the {@code events} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEvents(org.gstreamer.mpegts.AtscEITEvent[] events) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("events"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (events == null ? MemoryAddress.NULL : Interop.allocateNativeArray(events, org.gstreamer.mpegts.AtscEITEvent.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
