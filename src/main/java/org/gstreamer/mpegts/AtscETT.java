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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("ett_table_id_extension"),
        Interop.valueLayout.C_SHORT.withName("protocol_version"),
        Interop.valueLayout.C_INT.withName("etm_id"),
        Interop.valueLayout.ADDRESS.withName("messages")
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
    public short ettTableIdExtension$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ett_table_id_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ett_table_id_extension}
     * @param ettTableIdExtension The new value of the field {@code ett_table_id_extension}
     */
    public void ettTableIdExtension$set(short ettTableIdExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ett_table_id_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ettTableIdExtension);
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public short protocolVersion$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void protocolVersion$set(short protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code etm_id}
     * @return The value of the field {@code etm_id}
     */
    public int etmId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code etm_id}
     * @param etmId The new value of the field {@code etm_id}
     */
    public void etmId$set(int etmId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("etm_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), etmId);
    }
    
    /**
     * Create a AtscETT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscETT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscETT struct;
        
         /**
         * A {@link AtscETT.Build} object constructs a {@link AtscETT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscETT.allocate();
        }
        
         /**
         * Finish building the {@link AtscETT} struct.
         * @return A new instance of {@code AtscETT} with the fields 
         *         that were set in the Build object.
         */
        public AtscETT construct() {
            return struct;
        }
        
        public Build setEttTableIdExtension(short ettTableIdExtension) {
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
        public Build setProtocolVersion(short protocolVersion) {
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
        public Build setEtmId(int etmId) {
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
        public Build setMessages(org.gstreamer.mpegts.AtscMultString[] messages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(messages, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
    }
}
