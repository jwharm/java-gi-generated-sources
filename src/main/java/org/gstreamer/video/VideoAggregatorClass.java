package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.AggregatorClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("update_caps"),
        Interop.valueLayout.ADDRESS.withName("aggregate_frames"),
        Interop.valueLayout.ADDRESS.withName("create_output_buffer"),
        Interop.valueLayout.ADDRESS.withName("find_best_format"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link VideoAggregatorClass}
     * @return A new, uninitialized @{link VideoAggregatorClass}
     */
    public static VideoAggregatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorClass newInstance = new VideoAggregatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoAggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoAggregatorClass struct;
        
         /**
         * A {@link VideoAggregatorClass.Build} object constructs a {@link VideoAggregatorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoAggregatorClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoAggregatorClass} struct.
         * @return A new instance of {@code VideoAggregatorClass} with the fields 
         *         that were set in the Build object.
         */
        public VideoAggregatorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.base.AggregatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setUpdateCaps(java.lang.foreign.MemoryAddress updateCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCaps == null ? MemoryAddress.NULL : updateCaps));
            return this;
        }
        
        public Build setAggregateFrames(java.lang.foreign.MemoryAddress aggregateFrames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate_frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregateFrames == null ? MemoryAddress.NULL : aggregateFrames));
            return this;
        }
        
        public Build setCreateOutputBuffer(java.lang.foreign.MemoryAddress createOutputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer));
            return this;
        }
        
        public Build setFindBestFormat(java.lang.foreign.MemoryAddress findBestFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_best_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findBestFormat == null ? MemoryAddress.NULL : findBestFormat));
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
