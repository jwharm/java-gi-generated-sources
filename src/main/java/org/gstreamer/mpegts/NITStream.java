package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NITStream extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsNITStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
        Interop.valueLayout.C_SHORT.withName("original_network_id"),
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
     * Allocate a new {@link NITStream}
     * @return A new, uninitialized @{link NITStream}
     */
    public static NITStream allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NITStream newInstance = new NITStream(segment.address(), Ownership.NONE);
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
     * Create a NITStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NITStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_nit_stream_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link NITStream}
     */
    public NITStream() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_nit_stream_new = Interop.downcallHandle(
            "gst_mpegts_nit_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private NITStream struct;
        
         /**
         * A {@link NITStream.Build} object constructs a {@link NITStream} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = NITStream.allocate();
        }
        
         /**
         * Finish building the {@link NITStream} struct.
         * @return A new instance of {@code NITStream} with the fields 
         *         that were set in the Build object.
         */
        public NITStream construct() {
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
        
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
    }
}
