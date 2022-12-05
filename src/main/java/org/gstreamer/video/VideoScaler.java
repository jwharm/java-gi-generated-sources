package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoScaler} is a utility object for rescaling and resampling
 * video frames using various interpolation / sampling methods.
 */
public class VideoScaler extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoScaler";
    
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
     * Allocate a new {@link VideoScaler}
     * @return A new, uninitialized @{link VideoScaler}
     */
    public static VideoScaler allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoScaler newInstance = new VideoScaler(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoScaler proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoScaler(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Scale a rectangle of pixels in {@code src} with {@code src_stride} to {@code dest} with
     * {@code dest_stride} using the horizontal scaler {@code hscaler} and the vertical
     * scaler {@code vscale}.
     * <p>
     * One or both of {@code hscale} and {@code vscale} can be NULL to only perform scaling in
     * one dimension or do a copy without scaling.
     * <p>
     * {@code x} and {@code y} are the coordinates in the destination image to process.
     * @param vscale a vertical {@link VideoScaler}
     * @param format a {@link VideoFormat} for {@code srcs} and {@code dest}
     * @param src source pixels
     * @param srcStride source pixels stride
     * @param dest destination pixels
     * @param destStride destination pixels stride
     * @param x the horizontal destination offset
     * @param y the vertical destination offset
     * @param width the number of output pixels to scale
     * @param height the number of output lines to scale
     */
    public void _2d(@NotNull org.gstreamer.video.VideoScaler vscale, @NotNull org.gstreamer.video.VideoFormat format, @Nullable java.lang.foreign.MemoryAddress src, int srcStride, @Nullable java.lang.foreign.MemoryAddress dest, int destStride, int x, int y, int width, int height) {
        java.util.Objects.requireNonNull(vscale, "Parameter 'vscale' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_video_scaler_2d.invokeExact(
                    handle(),
                    vscale.handle(),
                    format.getValue(),
                    (Addressable) (src == null ? MemoryAddress.NULL : (Addressable) src),
                    srcStride,
                    (Addressable) (dest == null ? MemoryAddress.NULL : (Addressable) dest),
                    destStride,
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Combine a scaler for Y and UV into one scaler for the packed {@code format}.
     * @param uvScale a scaler for the U and V components
     * @param inFormat the input video format
     * @param outFormat the output video format
     * @return a new horizontal videoscaler for {@code format}.
     */
    public @NotNull org.gstreamer.video.VideoScaler combinePackedYUV(@NotNull org.gstreamer.video.VideoScaler uvScale, @NotNull org.gstreamer.video.VideoFormat inFormat, @NotNull org.gstreamer.video.VideoFormat outFormat) {
        java.util.Objects.requireNonNull(uvScale, "Parameter 'uvScale' must not be null");
        java.util.Objects.requireNonNull(inFormat, "Parameter 'inFormat' must not be null");
        java.util.Objects.requireNonNull(outFormat, "Parameter 'outFormat' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_scaler_combine_packed_YUV.invokeExact(
                    handle(),
                    uvScale.handle(),
                    inFormat.getValue(),
                    outFormat.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoScaler(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Free a previously allocated {@link VideoScaler} {@code scale}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_scaler_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * For a given pixel at {@code out_offset}, get the first required input pixel at
     * {@code in_offset} and the {@code n_taps} filter coefficients.
     * <p>
     * Note that for interlaced content, {@code in_offset} needs to be incremented with
     * 2 to get the next input line.
     * @param outOffset an output offset
     * @param inOffset result input offset
     * @param nTaps result n_taps
     * @return an array of {@code n_tap} gdouble values with filter coefficients.
     */
    public PointerDouble getCoeff(int outOffset, PointerInteger inOffset, PointerInteger nTaps) {
        java.util.Objects.requireNonNull(inOffset, "Parameter 'inOffset' must not be null");
        java.util.Objects.requireNonNull(nTaps, "Parameter 'nTaps' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_scaler_get_coeff.invokeExact(
                    handle(),
                    outOffset,
                    inOffset.handle(),
                    nTaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerDouble(RESULT);
    }
    
    /**
     * Get the maximum number of taps for {@code scale}.
     * @return the maximum number of taps
     */
    public int getMaxTaps() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_scaler_get_max_taps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Horizontally scale the pixels in {@code src} to {@code dest}, starting from {@code dest_offset}
     * for {@code width} samples.
     * @param format a {@link VideoFormat} for {@code src} and {@code dest}
     * @param src source pixels
     * @param dest destination pixels
     * @param destOffset the horizontal destination offset
     * @param width the number of pixels to scale
     */
    public void horizontal(@NotNull org.gstreamer.video.VideoFormat format, @Nullable java.lang.foreign.MemoryAddress src, @Nullable java.lang.foreign.MemoryAddress dest, int destOffset, int width) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_video_scaler_horizontal.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (src == null ? MemoryAddress.NULL : (Addressable) src),
                    (Addressable) (dest == null ? MemoryAddress.NULL : (Addressable) dest),
                    destOffset,
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Vertically combine {@code width} pixels in the lines in {@code src_lines} to {@code dest}.
     * {@code dest} is the location of the target line at {@code dest_offset} and
     * {@code srcs} are the input lines for {@code dest_offset}.
     * @param format a {@link VideoFormat} for {@code srcs} and {@code dest}
     * @param srcLines source pixels lines
     * @param dest destination pixels
     * @param destOffset the vertical destination offset
     * @param width the number of pixels to scale
     */
    public void vertical(@NotNull org.gstreamer.video.VideoFormat format, @Nullable java.lang.foreign.MemoryAddress srcLines, @Nullable java.lang.foreign.MemoryAddress dest, int destOffset, int width) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_video_scaler_vertical.invokeExact(
                    handle(),
                    format.getValue(),
                    (Addressable) (srcLines == null ? MemoryAddress.NULL : (Addressable) srcLines),
                    (Addressable) (dest == null ? MemoryAddress.NULL : (Addressable) dest),
                    destOffset,
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make a new {@code method} video scaler. {@code in_size} source lines/pixels will
     * be scaled to {@code out_size} destination lines/pixels.
     * <p>
     * {@code n_taps} specifies the amount of pixels to use from the source for one output
     * pixel. If n_taps is 0, this function chooses a good value automatically based
     * on the {@code method} and {@code in_size}/{@code out_size}.
     * @param method a {@link VideoResamplerMethod}
     * @param flags {@link VideoScalerFlags}
     * @param nTaps number of taps to use
     * @param inSize number of source elements
     * @param outSize number of destination elements
     * @param options extra options
     * @return a {@link VideoScaler}
     */
    public static @NotNull org.gstreamer.video.VideoScaler new_(@NotNull org.gstreamer.video.VideoResamplerMethod method, @NotNull org.gstreamer.video.VideoScalerFlags flags, int nTaps, int inSize, int outSize, @Nullable org.gstreamer.gst.Structure options) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_scaler_new.invokeExact(
                    method.getValue(),
                    flags.getValue(),
                    nTaps,
                    inSize,
                    outSize,
                    (Addressable) (options == null ? MemoryAddress.NULL : options.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoScaler(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_scaler_2d = Interop.downcallHandle(
            "gst_video_scaler_2d",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_scaler_combine_packed_YUV = Interop.downcallHandle(
            "gst_video_scaler_combine_packed_YUV",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_scaler_free = Interop.downcallHandle(
            "gst_video_scaler_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_scaler_get_coeff = Interop.downcallHandle(
            "gst_video_scaler_get_coeff",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_scaler_get_max_taps = Interop.downcallHandle(
            "gst_video_scaler_get_max_taps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_scaler_horizontal = Interop.downcallHandle(
            "gst_video_scaler_horizontal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_scaler_vertical = Interop.downcallHandle(
            "gst_video_scaler_vertical",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_scaler_new = Interop.downcallHandle(
            "gst_video_scaler_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
