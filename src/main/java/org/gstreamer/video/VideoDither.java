package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstVideoDither provides implementations of several dithering algorithms
 * that can be applied to lines of video pixels to quantize and dither them.
 */
public class VideoDither extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDither";
    
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
     * Allocate a new {@link VideoDither}
     * @return A new, uninitialized @{link VideoDither}
     */
    public static VideoDither allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoDither newInstance = new VideoDither(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoDither proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoDither(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Free {@code dither}
     */
    public void free() {
        try {
            DowncallHandles.gst_video_dither_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Dither {@code width} pixels starting from offset {@code x} in {@code line} using {@code dither}.
     * <p>
     * {@code y} is the line number of {@code line} in the output image.
     * @param line pointer to the pixels of the line
     * @param x x coordinate
     * @param y y coordinate
     * @param width the width
     */
    public void line(@Nullable java.lang.foreign.MemoryAddress line, int x, int y, int width) {
        try {
            DowncallHandles.gst_video_dither_line.invokeExact(
                    handle(),
                    (Addressable) (line == null ? MemoryAddress.NULL : (Addressable) line),
                    x,
                    y,
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make a new dither object for dithering lines of {@code format} using the
     * algorithm described by {@code method}.
     * <p>
     * Each component will be quantized to a multiple of {@code quantizer}. Better
     * performance is achieved when {@code quantizer} is a power of 2.
     * <p>
     * {@code width} is the width of the lines that this ditherer will handle.
     * @param method a {@link VideoDitherMethod}
     * @param flags a {@link VideoDitherFlags}
     * @param format a {@link VideoFormat}
     * @param quantizer quantizer
     * @param width the width of the lines
     * @return a new {@link VideoDither}
     */
    public static @NotNull org.gstreamer.video.VideoDither new_(@NotNull org.gstreamer.video.VideoDitherMethod method, @NotNull org.gstreamer.video.VideoDitherFlags flags, @NotNull org.gstreamer.video.VideoFormat format, PointerInteger quantizer, int width) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(quantizer, "Parameter 'quantizer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_dither_new.invokeExact(
                    method.getValue(),
                    flags.getValue(),
                    format.getValue(),
                    quantizer.handle(),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoDither(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_dither_free = Interop.downcallHandle(
            "gst_video_dither_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_dither_line = Interop.downcallHandle(
            "gst_video_dither_line",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_dither_new = Interop.downcallHandle(
            "gst_video_dither_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
