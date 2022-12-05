package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for audio RTP payloader.
 */
public class RTPBasePayloadClass extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBasePayloadClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_caps"),
        Interop.valueLayout.ADDRESS.withName("set_caps"),
        Interop.valueLayout.ADDRESS.withName("handle_buffer"),
        Interop.valueLayout.ADDRESS.withName("sink_event"),
        Interop.valueLayout.ADDRESS.withName("src_event"),
        Interop.valueLayout.ADDRESS.withName("query"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link RTPBasePayloadClass}
     * @return A new, uninitialized @{link RTPBasePayloadClass}
     */
    public static RTPBasePayloadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPBasePayloadClass newInstance = new RTPBasePayloadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTPBasePayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTPBasePayloadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTPBasePayloadClass struct;
        
         /**
         * A {@link RTPBasePayloadClass.Build} object constructs a {@link RTPBasePayloadClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTPBasePayloadClass.allocate();
        }
        
         /**
         * Finish building the {@link RTPBasePayloadClass} struct.
         * @return A new instance of {@code RTPBasePayloadClass} with the fields 
         *         that were set in the Build object.
         */
        public RTPBasePayloadClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetCaps(java.lang.foreign.MemoryAddress getCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps));
            return this;
        }
        
        public Build setSetCaps(java.lang.foreign.MemoryAddress setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps));
            return this;
        }
        
        public Build setHandleBuffer(java.lang.foreign.MemoryAddress handleBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleBuffer == null ? MemoryAddress.NULL : handleBuffer));
            return this;
        }
        
        public Build setSinkEvent(java.lang.foreign.MemoryAddress sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent));
            return this;
        }
        
        public Build setSrcEvent(java.lang.foreign.MemoryAddress srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent));
            return this;
        }
        
        public Build setQuery(java.lang.foreign.MemoryAddress query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
