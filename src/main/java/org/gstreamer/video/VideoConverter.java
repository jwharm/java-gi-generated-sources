package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoConverter extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoConverter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoConverter}
     * @return A new, uninitialized @{link VideoConverter}
     */
    public static VideoConverter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoConverter newInstance = new VideoConverter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoConverter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoConverter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoConverter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoConverter(input, ownership);
    
    /**
     * Convert the pixels of {@code src} into {@code dest} using {@code convert}.
     * <p>
     * If {@code GST_VIDEO_CONVERTER_OPT_ASYNC_TASKS} is {@code true} then this function will
     * return immediately and needs to be followed by a call to
     * gst_video_converter_frame_finish().
     * @param src a {@link VideoFrame}
     * @param dest a {@link VideoFrame}
     */
    public void frame(org.gstreamer.video.VideoFrame src, org.gstreamer.video.VideoFrame dest) {
        try {
            DowncallHandles.gst_video_converter_frame.invokeExact(
                    handle(),
                    src.handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wait for a previous async conversion performed using
     * gst_video_converter_frame() to complete.
     */
    public void frameFinish() {
        try {
            DowncallHandles.gst_video_converter_frame_finish.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free {@code convert}
     */
    public void free() {
        try {
            DowncallHandles.gst_video_converter_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the current configuration of {@code convert}.
     * @return a {@link org.gstreamer.gst.Structure} that remains valid for as long as {@code convert} is valid
     *   or until gst_video_converter_set_config() is called.
     */
    public org.gstreamer.gst.Structure getConfig() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_converter_get_config.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Set {@code config} as extra configuration for {@code convert}.
     * <p>
     * If the parameters in {@code config} can not be set exactly, this function returns
     * {@code false} and will try to update as much state as possible. The new state can
     * then be retrieved and refined with gst_video_converter_get_config().
     * <p>
     * Look at the {@code GST_VIDEO_CONVERTER_OPT_*} fields to check valid configuration
     * option and values.
     * @param config a {@link org.gstreamer.gst.Structure}
     * @return {@code true} when {@code config} could be set.
     */
    public boolean setConfig(org.gstreamer.gst.Structure config) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_converter_set_config.invokeExact(
                    handle(),
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create a new converter object to convert between {@code in_info} and {@code out_info}
     * with {@code config}.
     * @param inInfo a {@link VideoInfo}
     * @param outInfo a {@link VideoInfo}
     * @param config a {@link org.gstreamer.gst.Structure} with configuration options
     * @return a {@link VideoConverter} or {@code null} if conversion is not possible.
     */
    public static org.gstreamer.video.VideoConverter new_(org.gstreamer.video.VideoInfo inInfo, org.gstreamer.video.VideoInfo outInfo, org.gstreamer.gst.Structure config) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_converter_new.invokeExact(
                    inInfo.handle(),
                    outInfo.handle(),
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return org.gstreamer.video.VideoConverter.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Create a new converter object to convert between {@code in_info} and {@code out_info}
     * with {@code config}.
     * <p>
     * The optional {@code pool} can be used to spawn threads, this is useful when
     * creating new converters rapidly, for example when updating cropping.
     * @param inInfo a {@link VideoInfo}
     * @param outInfo a {@link VideoInfo}
     * @param config a {@link org.gstreamer.gst.Structure} with configuration options
     * @param pool a {@link org.gstreamer.gst.TaskPool} to spawn threads from
     * @return a {@link VideoConverter} or {@code null} if conversion is not possible.
     */
    public static org.gstreamer.video.VideoConverter newWithPool(org.gstreamer.video.VideoInfo inInfo, org.gstreamer.video.VideoInfo outInfo, org.gstreamer.gst.Structure config, @Nullable org.gstreamer.gst.TaskPool pool) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_converter_new_with_pool.invokeExact(
                    inInfo.handle(),
                    outInfo.handle(),
                    config.handle(),
                    (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return org.gstreamer.video.VideoConverter.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_converter_frame = Interop.downcallHandle(
            "gst_video_converter_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_frame_finish = Interop.downcallHandle(
            "gst_video_converter_frame_finish",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_free = Interop.downcallHandle(
            "gst_video_converter_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_get_config = Interop.downcallHandle(
            "gst_video_converter_get_config",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_set_config = Interop.downcallHandle(
            "gst_video_converter_set_config",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_new = Interop.downcallHandle(
            "gst_video_converter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_converter_new_with_pool = Interop.downcallHandle(
            "gst_video_converter_new_with_pool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
