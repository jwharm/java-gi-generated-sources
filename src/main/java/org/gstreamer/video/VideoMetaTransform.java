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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("in_info"),
            Interop.valueLayout.ADDRESS.withName("out_info")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoMetaTransform}
     * @return A new, uninitialized @{link VideoMetaTransform}
     */
    public static VideoMetaTransform allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoMetaTransform newInstance = new VideoMetaTransform(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code in_info}
     * @return The value of the field {@code in_info}
     */
    public org.gstreamer.video.VideoInfo getInInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code in_info}
     * @param inInfo The new value of the field {@code in_info}
     */
    public void setInInfo(org.gstreamer.video.VideoInfo inInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (inInfo == null ? MemoryAddress.NULL : inInfo.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code out_info}
     * @return The value of the field {@code out_info}
     */
    public org.gstreamer.video.VideoInfo getOutInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code out_info}
     * @param outInfo The new value of the field {@code out_info}
     */
    public void setOutInfo(org.gstreamer.video.VideoInfo outInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (outInfo == null ? MemoryAddress.NULL : outInfo.handle()));
        }
    }
    
    /**
     * Create a VideoMetaTransform proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoMetaTransform(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoMetaTransform> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoMetaTransform(input);
    
    /**
     * Get the {@link org.gtk.glib.Quark} for the "gst-video-scale" metadata transform operation.
     * @return a {@link org.gtk.glib.Quark}
     */
    public static org.gtk.glib.Quark scaleGetQuark() {
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
     * A {@link VideoMetaTransform.Builder} object constructs a {@link VideoMetaTransform} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoMetaTransform.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoMetaTransform struct;
        
        private Builder() {
            struct = VideoMetaTransform.allocate();
        }
        
        /**
         * Finish building the {@link VideoMetaTransform} struct.
         * @return A new instance of {@code VideoMetaTransform} with the fields 
         *         that were set in the Builder object.
         */
        public VideoMetaTransform build() {
            return struct;
        }
        
        /**
         * the input {@link VideoInfo}
         * @param inInfo The value for the {@code inInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInInfo(org.gstreamer.video.VideoInfo inInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("in_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (inInfo == null ? MemoryAddress.NULL : inInfo.handle()));
                return this;
            }
        }
        
        /**
         * the output {@link VideoInfo}
         * @param outInfo The value for the {@code outInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOutInfo(org.gstreamer.video.VideoInfo outInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("out_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (outInfo == null ? MemoryAddress.NULL : outInfo.handle()));
                return this;
            }
        }
    }
}
