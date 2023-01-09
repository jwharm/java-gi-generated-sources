package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoChromaResample extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoChromaResample";
    
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
     * Allocate a new {@link VideoChromaResample}
     * @return A new, uninitialized @{link VideoChromaResample}
     */
    public static VideoChromaResample allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoChromaResample newInstance = new VideoChromaResample(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoChromaResample proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoChromaResample(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoChromaResample> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoChromaResample(input);
    
    /**
     * Perform resampling of {@code width} chroma pixels in {@code lines}.
     * @param lines pixel lines
     * @param width the number of pixels on one line
     */
    public void gstVideoChromaResample(@Nullable java.lang.foreign.MemoryAddress lines, int width) {
        try {
            DowncallHandles.gst_video_chroma_resample.invokeExact(
                    handle(),
                    (Addressable) (lines == null ? MemoryAddress.NULL : (Addressable) lines),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free {@code resample}
     */
    public void free() {
        try {
            DowncallHandles.gst_video_chroma_resample_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The resampler must be fed {@code n_lines} at a time. The first line should be
     * at {@code offset}.
     * @param nLines the number of input lines
     * @param offset the first line
     */
    public void getInfo(PointerInteger nLines, PointerInteger offset) {
        try {
            DowncallHandles.gst_video_chroma_resample_get_info.invokeExact(
                    handle(),
                    nLines.handle(),
                    offset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new resampler object for the given parameters. When {@code h_factor} or
     * {@code v_factor} is &gt; 0, upsampling will be used, otherwise subsampling is
     * performed.
     * @param method a {@link VideoChromaMethod}
     * @param site a {@link VideoChromaSite}
     * @param flags {@link VideoChromaFlags}
     * @param format the {@link VideoFormat}
     * @param hFactor horizontal resampling factor
     * @param vFactor vertical resampling factor
     * @return a new {@link VideoChromaResample} that should be freed with
     *     gst_video_chroma_resample_free() after usage.
     */
    public static org.gstreamer.video.VideoChromaResample new_(org.gstreamer.video.VideoChromaMethod method, org.gstreamer.video.VideoChromaSite site, org.gstreamer.video.VideoChromaFlags flags, org.gstreamer.video.VideoFormat format, int hFactor, int vFactor) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_chroma_resample_new.invokeExact(
                    method.getValue(),
                    site.getValue(),
                    flags.getValue(),
                    format.getValue(),
                    hFactor,
                    vFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoChromaResample.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_chroma_resample = Interop.downcallHandle(
                "gst_video_chroma_resample",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_chroma_resample_free = Interop.downcallHandle(
                "gst_video_chroma_resample_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_chroma_resample_get_info = Interop.downcallHandle(
                "gst_video_chroma_resample_get_info",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_chroma_resample_new = Interop.downcallHandle(
                "gst_video_chroma_resample_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
}
