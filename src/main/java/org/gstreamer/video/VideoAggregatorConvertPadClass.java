package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorConvertPadClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorConvertPadClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoAggregatorPadClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("create_conversion_info"),
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
     * Allocate a new {@link VideoAggregatorConvertPadClass}
     * @return A new, uninitialized @{link VideoAggregatorConvertPadClass}
     */
    public static VideoAggregatorConvertPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorConvertPadClass newInstance = new VideoAggregatorConvertPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.video.VideoAggregatorPadClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.video.VideoAggregatorPadClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoAggregatorConvertPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorConvertPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoAggregatorConvertPadClass struct;
        
         /**
         * A {@link VideoAggregatorConvertPadClass.Build} object constructs a {@link VideoAggregatorConvertPadClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoAggregatorConvertPadClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoAggregatorConvertPadClass} struct.
         * @return A new instance of {@code VideoAggregatorConvertPadClass} with the fields 
         *         that were set in the Build object.
         */
        public VideoAggregatorConvertPadClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.video.VideoAggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setCreateConversionInfo(java.lang.foreign.MemoryAddress createConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createConversionInfo == null ? MemoryAddress.NULL : createConversionInfo));
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
