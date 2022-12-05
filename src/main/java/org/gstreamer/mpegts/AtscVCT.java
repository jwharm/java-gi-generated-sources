package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents both:
 *   Terrestrial Virtual Channel Table (A65)
 *   Cable Virtual Channel Table (A65)
 */
public class AtscVCT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscVCT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
        Interop.valueLayout.C_BYTE.withName("protocol_version"),
        MemoryLayout.paddingLayout(40),
        Interop.valueLayout.ADDRESS.withName("sources"),
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
     * Allocate a new {@link AtscVCT}
     * @return A new, uninitialized @{link AtscVCT}
     */
    public static AtscVCT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscVCT newInstance = new AtscVCT(segment.address(), Ownership.NONE);
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
     * Create a AtscVCT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscVCT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscVCT struct;
        
         /**
         * A {@link AtscVCT.Build} object constructs a {@link AtscVCT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscVCT.allocate();
        }
        
         /**
         * Finish building the {@link AtscVCT} struct.
         * @return A new instance of {@code AtscVCT} with the fields 
         *         that were set in the Build object.
         */
        public AtscVCT construct() {
            return struct;
        }
        
        /**
         * The transport stream
         * @param transportStreamId The value for the {@code transportStreamId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransportStreamId(short transportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
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
         * sources
         * @param sources The value for the {@code sources} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSources(org.gstreamer.mpegts.AtscVCTSource[] sources) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sources"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sources == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sources, org.gstreamer.mpegts.AtscVCTSource.getMemoryLayout(), false)));
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
