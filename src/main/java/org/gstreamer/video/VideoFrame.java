package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A video frame obtained from gst_video_frame_map()
 */
public class VideoFrame extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFrame";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("buffer"),
        Interop.valueLayout.ADDRESS.withName("meta"),
        Interop.valueLayout.C_INT.withName("id"),
        MemoryLayout.paddingLayout(224),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("data"),
        MemoryLayout.sequenceLayout(4, org.gstreamer.gst.MapInfo.getMemoryLayout()).withName("map"),
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
     * Allocate a new {@link VideoFrame}
     * @return A new, uninitialized @{link VideoFrame}
     */
    public static VideoFrame allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoFrame newInstance = new VideoFrame(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.video.VideoInfo info$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return new org.gstreamer.video.VideoInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFrameFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFrameFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.video.VideoFrameFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer buffer$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void buffer$set(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), buffer.handle());
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public java.lang.foreign.MemoryAddress meta$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void meta$set(java.lang.foreign.MemoryAddress meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) meta);
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void id$set(int id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
    }
    
    /**
     * Create a VideoFrame proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoFrame(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Copy the contents from {@code src} to {@code dest}.
     * <p>
     * Note: Since: 1.18, {@code dest} dimensions are allowed to be
     * smaller than {@code src} dimensions.
     * @param src a {@link VideoFrame}
     * @return TRUE if the contents could be copied.
     */
    public boolean copy(@NotNull org.gstreamer.video.VideoFrame src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_copy.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Copy the plane with index {@code plane} from {@code src} to {@code dest}.
     * <p>
     * Note: Since: 1.18, {@code dest} dimensions are allowed to be
     * smaller than {@code src} dimensions.
     * @param src a {@link VideoFrame}
     * @param plane a plane
     * @return TRUE if the contents could be copied.
     */
    public boolean copyPlane(@NotNull org.gstreamer.video.VideoFrame src, int plane) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_copy_plane.invokeExact(
                    handle(),
                    src.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Unmap the memory previously mapped with gst_video_frame_map.
     */
    public void unmap() {
        try {
            DowncallHandles.gst_video_frame_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Use {@code info} and {@code buffer} to fill in the values of {@code frame}. {@code frame} is usually
     * allocated on the stack, and you will pass the address to the {@link VideoFrame}
     * structure allocated on the stack; gst_video_frame_map() will then fill in
     * the structures with the various video-specific information you need to access
     * the pixels of the video buffer. You can then use accessor macros such as
     * GST_VIDEO_FRAME_COMP_DATA(), GST_VIDEO_FRAME_PLANE_DATA(),
     * GST_VIDEO_FRAME_COMP_STRIDE(), GST_VIDEO_FRAME_PLANE_STRIDE() etc.
     * to get to the pixels.
     * <pre>{@code <!-- language="C" -->
     *   GstVideoFrame vframe;
     *   ...
     *   // set RGB pixels to black one at a time
     *   if (gst_video_frame_map (&vframe, video_info, video_buffer, GST_MAP_WRITE)) {
     *     guint8 *pixels = GST_VIDEO_FRAME_PLANE_DATA (vframe, 0);
     *     guint stride = GST_VIDEO_FRAME_PLANE_STRIDE (vframe, 0);
     *     guint pixel_stride = GST_VIDEO_FRAME_COMP_PSTRIDE (vframe, 0);
     * 
     *     for (h = 0; h < height; ++h) {
     *       for (w = 0; w < width; ++w) {
     *         guint8 *pixel = pixels + h * stride + w * pixel_stride;
     * 
     *         memset (pixel, 0, pixel_stride);
     *       }
     *     }
     * 
     *     gst_video_frame_unmap (&vframe);
     *   }
     *   ...
     * }</pre>
     * <p>
     * All video planes of {@code buffer} will be mapped and the pointers will be set in
     * {@code frame}-&gt;data.
     * <p>
     * The purpose of this function is to make it easy for you to get to the video
     * pixels in a generic way, without you having to worry too much about details
     * such as whether the video data is allocated in one contiguous memory chunk
     * or multiple memory chunks (e.g. one for each plane); or if custom strides
     * and custom plane offsets are used or not (as signalled by GstVideoMeta on
     * each buffer). This function will just fill the {@link VideoFrame} structure
     * with the right values and if you use the accessor macros everything will
     * just work and you can access the data easily. It also maps the underlying
     * memory chunks for you.
     * @param frame pointer to {@link VideoFrame}
     * @param info a {@link VideoInfo}
     * @param buffer the buffer to map
     * @param flags {@link org.gstreamer.gst.MapFlags}
     * @return {@code true} on success.
     */
    public static boolean map(@NotNull org.gstreamer.video.VideoFrame frame, @NotNull org.gstreamer.video.VideoInfo info, @NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_map.invokeExact(
                    frame.handle(),
                    info.handle(),
                    buffer.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Use {@code info} and {@code buffer} to fill in the values of {@code frame} with the video frame
     * information of frame {@code id}.
     * <p>
     * When {@code id} is -1, the default frame is mapped. When {@code id} != -1, this function
     * will return {@code false} when there is no GstVideoMeta with that id.
     * <p>
     * All video planes of {@code buffer} will be mapped and the pointers will be set in
     * {@code frame}-&gt;data.
     * @param frame pointer to {@link VideoFrame}
     * @param info a {@link VideoInfo}
     * @param buffer the buffer to map
     * @param id the frame id to map
     * @param flags {@link org.gstreamer.gst.MapFlags}
     * @return {@code true} on success.
     */
    public static boolean mapId(@NotNull org.gstreamer.video.VideoFrame frame, @NotNull org.gstreamer.video.VideoInfo info, @NotNull org.gstreamer.gst.Buffer buffer, int id, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(frame, "Parameter 'frame' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_map_id.invokeExact(
                    frame.handle(),
                    info.handle(),
                    buffer.handle(),
                    id,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_frame_copy = Interop.downcallHandle(
            "gst_video_frame_copy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_frame_copy_plane = Interop.downcallHandle(
            "gst_video_frame_copy_plane",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_frame_unmap = Interop.downcallHandle(
            "gst_video_frame_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_frame_map = Interop.downcallHandle(
            "gst_video_frame_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_frame_map_id = Interop.downcallHandle(
            "gst_video_frame_map_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoFrame struct;
        
         /**
         * A {@link VideoFrame.Build} object constructs a {@link VideoFrame} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoFrame.allocate();
        }
        
         /**
         * Finish building the {@link VideoFrame} struct.
         * @return A new instance of {@code VideoFrame} with the fields 
         *         that were set in the Build object.
         */
        public VideoFrame construct() {
            return struct;
        }
        
        /**
         * the {@link VideoInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gstreamer.video.VideoInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * {@link VideoFrameFlags} for the frame
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.video.VideoFrameFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the mapped buffer
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * pointer to metadata if any
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMeta(java.lang.foreign.MemoryAddress meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : (Addressable) meta));
            return this;
        }
        
        /**
         * id of the mapped frame. the id can for example be used to
         *   identify the frame in case of multiview video.
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setId(int id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
            return this;
        }
        
        /**
         * pointers to the plane data
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(java.lang.foreign.MemoryAddress[] data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
            return this;
        }
        
        /**
         * mappings of the planes
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMap(org.gstreamer.gst.MapInfo[] map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : Interop.allocateNativeArray(map, org.gstreamer.gst.MapInfo.getMemoryLayout(), false)));
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
