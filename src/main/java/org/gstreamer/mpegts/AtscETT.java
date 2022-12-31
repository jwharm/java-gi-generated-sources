package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extended Text Table (ATSC)
 */
public class AtscETT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscETT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("ett_table_id_extension"),
            Interop.valueLayout.C_SHORT.withName("protocol_version"),
            Interop.valueLayout.C_INT.withName("etm_id"),
            Interop.valueLayout.ADDRESS.withName("messages")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscETT}
     * @return A new, uninitialized @{link AtscETT}
     */
    public static AtscETT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscETT newInstance = new AtscETT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ett_table_id_extension}
     * @return The value of the field {@code ett_table_id_extension}
     */
    public short getEttTableIdExtension() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ett_table_id_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ett_table_id_extension}
     * @param ettTableIdExtension The new value of the field {@code ett_table_id_extension}
     */
    public void setEttTableIdExtension(short ettTableIdExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ett_table_id_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ettTableIdExtension);
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public short getProtocolVersion() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void setProtocolVersion(short protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code etm_id}
     * @return The value of the field {@code etm_id}
     */
    public int getEtmId() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code etm_id}
     * @param etmId The new value of the field {@code etm_id}
     */
    public void setEtmId(int etmId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), etmId);
    }
    
    /**
     * Get the value of the field {@code messages}
     * @return The value of the field {@code messages}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscMultString> getMessages() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("messages"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.AtscMultString>(RESULT, org.gstreamer.mpegts.AtscMultString.fromAddress);
    }
    
    /**
     * Change the value of the field {@code messages}
     * @param messages The new value of the field {@code messages}
     */
    public void setMessages(org.gstreamer.mpegts.AtscMultString[] messages) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("messages"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(messages, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
    }
    
    /**
     * Create a AtscETT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscETT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscETT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscETT(input, ownership);
    
    /**
     * A {@link AtscETT.Builder} object constructs a {@link AtscETT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscETT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscETT struct;
        
        private Builder() {
            struct = AtscETT.allocate();
        }
        
         /**
         * Finish building the {@link AtscETT} struct.
         * @return A new instance of {@code AtscETT} with the fields 
         *         that were set in the Builder object.
         */
        public AtscETT build() {
            return struct;
        }
        
        public Builder setEttTableIdExtension(short ettTableIdExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ett_table_id_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ettTableIdExtension);
            return this;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProtocolVersion(short protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * The etm id
         * @param etmId The value for the {@code etmId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEtmId(int etmId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("etm_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), etmId);
            return this;
        }
        
        /**
         * List of texts
         * @param messages The value for the {@code messages} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessages(org.gstreamer.mpegts.AtscMultString[] messages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(messages, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
    }
}
