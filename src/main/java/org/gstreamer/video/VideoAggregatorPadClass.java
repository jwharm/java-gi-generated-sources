package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorPadClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorPadClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.AggregatorPadClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("update_conversion_info"),
        Interop.valueLayout.ADDRESS.withName("prepare_frame"),
        Interop.valueLayout.ADDRESS.withName("clean_frame"),
        Interop.valueLayout.ADDRESS.withName("prepare_frame_start"),
        Interop.valueLayout.ADDRESS.withName("prepare_frame_finish"),
        MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link VideoAggregatorPadClass}
     * @return A new, uninitialized @{link VideoAggregatorPadClass}
     */
    public static VideoAggregatorPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorPadClass newInstance = new VideoAggregatorPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorPadClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.base.AggregatorPadClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoAggregatorPadClass struct;
        
         /**
         * A {@link VideoAggregatorPadClass.Build} object constructs a {@link VideoAggregatorPadClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoAggregatorPadClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoAggregatorPadClass} struct.
         * @return A new instance of {@code VideoAggregatorPadClass} with the fields 
         *         that were set in the Build object.
         */
        public VideoAggregatorPadClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setUpdateConversionInfo(java.lang.foreign.MemoryAddress updateConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo));
            return this;
        }
        
        public Build setPrepareFrame(java.lang.foreign.MemoryAddress prepareFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrame == null ? MemoryAddress.NULL : prepareFrame));
            return this;
        }
        
        public Build setCleanFrame(java.lang.foreign.MemoryAddress cleanFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clean_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cleanFrame == null ? MemoryAddress.NULL : cleanFrame));
            return this;
        }
        
        public Build setPrepareFrameStart(java.lang.foreign.MemoryAddress prepareFrameStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameStart == null ? MemoryAddress.NULL : prepareFrameStart));
            return this;
        }
        
        public Build setPrepareFrameFinish(java.lang.foreign.MemoryAddress prepareFrameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameFinish == null ? MemoryAddress.NULL : prepareFrameFinish));
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
