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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoFrame}
     * @return A new, uninitialized @{link VideoFrame}
     */
    public static VideoFrame allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoFrame newInstance = new VideoFrame(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.video.VideoInfo getInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return org.gstreamer.video.VideoInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void setInfo(org.gstreamer.video.VideoInfo info) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFrameFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.video.VideoFrameFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.video.VideoFrameFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public java.lang.foreign.MemoryAddress getMeta() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(java.lang.foreign.MemoryAddress meta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : (Addressable) meta));
        }
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int getId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void setId(int id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), id);
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress[] getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Interop.getAddressArrayFrom(RESULT, 4);
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress[] data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gst.MapInfo[] getMap() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.gst.MapInfo>(RESULT, org.gstreamer.gst.MapInfo.fromAddress).toArray((int) 4, org.gstreamer.gst.MapInfo.class);
        }
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(org.gstreamer.gst.MapInfo[] map) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : Interop.allocateNativeArray(map, org.gstreamer.gst.MapInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a VideoFrame proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoFrame(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoFrame> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoFrame(input);
    
    /**
     * Copy the contents from {@code src} to {@code dest}.
     * <p>
     * Note: Since: 1.18, {@code dest} dimensions are allowed to be
     * smaller than {@code src} dimensions.
     * @param src a {@link VideoFrame}
     * @return TRUE if the contents could be copied.
     */
    public boolean copy(org.gstreamer.video.VideoFrame src) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_copy.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean copyPlane(org.gstreamer.video.VideoFrame src, int plane) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_frame_copy_plane.invokeExact(
                    handle(),
                    src.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unmap the memory previously mapped with gst_video_frame_map.
     */
    public void unmap() {
        try {
            DowncallHandles.gst_video_frame_unmap.invokeExact(handle());
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
    public static boolean map(org.gstreamer.video.VideoFrame frame, org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.MapFlags flags) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static boolean mapId(org.gstreamer.video.VideoFrame frame, org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Buffer buffer, int id, org.gstreamer.gst.MapFlags flags) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * A {@link VideoFrame.Builder} object constructs a {@link VideoFrame} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoFrame.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoFrame struct;
        
        private Builder() {
            struct = VideoFrame.allocate();
        }
        
        /**
         * Finish building the {@link VideoFrame} struct.
         * @return A new instance of {@code VideoFrame} with the fields 
         *         that were set in the Builder object.
         */
        public VideoFrame build() {
            return struct;
        }
        
        /**
         * the {@link VideoInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfo(org.gstreamer.video.VideoInfo info) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
                return this;
            }
        }
        
        /**
         * {@link VideoFrameFlags} for the frame
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.video.VideoFrameFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * the mapped buffer
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
                return this;
            }
        }
        
        /**
         * pointer to metadata if any
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(java.lang.foreign.MemoryAddress meta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : (Addressable) meta));
                return this;
            }
        }
        
        /**
         * id of the mapped frame. the id can for example be used to
         *   identify the frame in case of multiview video.
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setId(int id) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), id);
                return this;
            }
        }
        
        /**
         * pointers to the plane data
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress[] data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * mappings of the planes
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMap(org.gstreamer.gst.MapInfo[] map) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : Interop.allocateNativeArray(map, org.gstreamer.gst.MapInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
