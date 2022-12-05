package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An individual stream definition of a {@link PMT}.
 */
public class PMTStream extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsPMTStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("stream_type"),
        MemoryLayout.paddingLayout(8),
        Interop.valueLayout.C_SHORT.withName("pid"),
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
     * Allocate a new {@link PMTStream}
     * @return A new, uninitialized @{link PMTStream}
     */
    public static PMTStream allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PMTStream newInstance = new PMTStream(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code stream_type}
     * @return The value of the field {@code stream_type}
     */
    public byte streamType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code stream_type}
     * @param streamType The new value of the field {@code stream_type}
     */
    public void streamType$set(byte streamType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamType);
    }
    
    /**
     * Get the value of the field {@code pid}
     * @return The value of the field {@code pid}
     */
    public short pid$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pid}
     * @param pid The new value of the field {@code pid}
     */
    public void pid$set(short pid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
    }
    
    /**
     * Create a PMTStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PMTStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_pmt_stream_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a new {@link PMTStream}.
     */
    public PMTStream() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_pmt_stream_new = Interop.downcallHandle(
            "gst_mpegts_pmt_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PMTStream struct;
        
         /**
         * A {@link PMTStream.Build} object constructs a {@link PMTStream} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PMTStream.allocate();
        }
        
         /**
         * Finish building the {@link PMTStream} struct.
         * @return A new instance of {@code PMTStream} with the fields 
         *         that were set in the Build object.
         */
        public PMTStream construct() {
            return struct;
        }
        
        /**
         * the type of stream. See {@link StreamType}
         * @param streamType The value for the {@code streamType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStreamType(byte streamType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), streamType);
            return this;
        }
        
        /**
         * the PID of the stream
         * @param pid The value for the {@code pid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPid(short pid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
            return this;
        }
        
        /**
         * the descriptors of the
         * stream
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
