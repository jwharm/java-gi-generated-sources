package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The video filter class structure.
 */
public class VideoFilterClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFilterClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("set_info"),
        Interop.valueLayout.ADDRESS.withName("transform_frame"),
        Interop.valueLayout.ADDRESS.withName("transform_frame_ip"),
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
     * Allocate a new {@link VideoFilterClass}
     * @return A new, uninitialized @{link VideoFilterClass}
     */
    public static VideoFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoFilterClass newInstance = new VideoFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseTransformClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.base.BaseTransformClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoFilterClass struct;
        
         /**
         * A {@link VideoFilterClass.Build} object constructs a {@link VideoFilterClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoFilterClass} struct.
         * @return A new instance of {@code VideoFilterClass} with the fields 
         *         that were set in the Build object.
         */
        public VideoFilterClass construct() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setSetInfo(java.lang.foreign.MemoryAddress setInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setInfo == null ? MemoryAddress.NULL : setInfo));
            return this;
        }
        
        public Build setTransformFrame(java.lang.foreign.MemoryAddress transformFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrame == null ? MemoryAddress.NULL : transformFrame));
            return this;
        }
        
        public Build setTransformFrameIp(java.lang.foreign.MemoryAddress transformFrameIp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_frame_ip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrameIp == null ? MemoryAddress.NULL : transformFrameIp));
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
