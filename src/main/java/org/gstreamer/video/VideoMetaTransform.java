package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra data passed to a video transform {@link org.gstreamer.gst.MetaTransformFunction} such as:
 * "gst-video-scale".
 */
public class VideoMetaTransform extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMetaTransform";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("in_info"),
        Interop.valueLayout.ADDRESS.withName("out_info")
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
     * Allocate a new {@link VideoMetaTransform}
     * @return A new, uninitialized @{link VideoMetaTransform}
     */
    public static VideoMetaTransform allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoMetaTransform newInstance = new VideoMetaTransform(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code in_info}
     * @return The value of the field {@code in_info}
     */
    public org.gstreamer.video.VideoInfo inInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code in_info}
     * @param inInfo The new value of the field {@code in_info}
     */
    public void inInfo$set(org.gstreamer.video.VideoInfo inInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), inInfo.handle());
    }
    
    /**
     * Get the value of the field {@code out_info}
     * @return The value of the field {@code out_info}
     */
    public org.gstreamer.video.VideoInfo outInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code out_info}
     * @param outInfo The new value of the field {@code out_info}
     */
    public void outInfo$set(org.gstreamer.video.VideoInfo outInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), outInfo.handle());
    }
    
    /**
     * Create a VideoMetaTransform proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoMetaTransform(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Get the {@link org.gtk.glib.Quark} for the "gst-video-scale" metadata transform operation.
     * @return a {@link org.gtk.glib.Quark}
     */
    public static @NotNull org.gtk.glib.Quark scaleGetQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_transform_scale_get_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_meta_transform_scale_get_quark = Interop.downcallHandle(
            "gst_video_meta_transform_scale_get_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoMetaTransform struct;
        
         /**
         * A {@link VideoMetaTransform.Build} object constructs a {@link VideoMetaTransform} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoMetaTransform.allocate();
        }
        
         /**
         * Finish building the {@link VideoMetaTransform} struct.
         * @return A new instance of {@code VideoMetaTransform} with the fields 
         *         that were set in the Build object.
         */
        public VideoMetaTransform construct() {
            return struct;
        }
        
        /**
         * the input {@link VideoInfo}
         * @param inInfo The value for the {@code inInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInInfo(org.gstreamer.video.VideoInfo inInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (inInfo == null ? MemoryAddress.NULL : inInfo.handle()));
            return this;
        }
        
        /**
         * the output {@link VideoInfo}
         * @param outInfo The value for the {@code outInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOutInfo(org.gstreamer.video.VideoInfo outInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outInfo == null ? MemoryAddress.NULL : outInfo.handle()));
            return this;
        }
    }
}
