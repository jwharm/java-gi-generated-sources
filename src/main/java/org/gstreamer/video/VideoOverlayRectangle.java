package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque video overlay rectangle object. A rectangle contains a single
 * overlay rectangle which can be added to a composition.
 */
public class VideoOverlayRectangle extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOverlayRectangle";
    
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
     * Allocate a new {@link VideoOverlayRectangle}
     * @return A new, uninitialized @{link VideoOverlayRectangle}
     */
    public static VideoOverlayRectangle allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoOverlayRectangle newInstance = new VideoOverlayRectangle(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoOverlayRectangle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoOverlayRectangle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewRaw(@NotNull org.gstreamer.gst.Buffer pixels, int renderX, int renderY, int renderWidth, int renderHeight, @NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(pixels, "Parameter 'pixels' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_new_raw.invokeExact(
                    pixels.handle(),
                    renderX,
                    renderY,
                    renderWidth,
                    renderHeight,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new video overlay rectangle with ARGB or AYUV pixel data.
     * The layout in case of ARGB of the components in memory is B-G-R-A
     * on little-endian platforms
     * (corresponding to {@code GST_VIDEO_FORMAT_BGRA}) and A-R-G-B on big-endian
     * platforms (corresponding to {@code GST_VIDEO_FORMAT_ARGB}). In other words,
     * pixels are treated as 32-bit words and the lowest 8 bits then contain
     * the blue component value and the highest 8 bits contain the alpha
     * component value. Unless specified in the flags, the RGB values are
     * non-premultiplied. This is the format that is used by most hardware,
     * and also many rendering libraries such as Cairo, for example.
     * The pixel data buffer must have {@link VideoMeta} set.
     * @param pixels a {@link org.gstreamer.gst.Buffer} pointing to the pixel memory
     * @param renderX the X co-ordinate on the video where the top-left corner of this
     *     overlay rectangle should be rendered to
     * @param renderY the Y co-ordinate on the video where the top-left corner of this
     *     overlay rectangle should be rendered to
     * @param renderWidth the render width of this rectangle on the video
     * @param renderHeight the render height of this rectangle on the video
     * @param flags flags
     * @return a new {@link VideoOverlayRectangle}. Unref with
     *     gst_video_overlay_rectangle_unref() when no longer needed.
     */
    public static VideoOverlayRectangle newRaw(@NotNull org.gstreamer.gst.Buffer pixels, int renderX, int renderY, int renderWidth, int renderHeight, @NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        return new VideoOverlayRectangle(constructNewRaw(pixels, renderX, renderY, renderWidth, renderHeight, flags), Ownership.FULL);
    }
    
    /**
     * Makes a copy of {@code rectangle}, so that it is possible to modify it
     * (e.g. to change the render co-ordinates or render dimension). The
     * actual overlay pixel data buffers contained in the rectangle are not
     * copied.
     * @return a new {@link VideoOverlayRectangle} equivalent
     *     to {@code rectangle}.
     */
    public @NotNull org.gstreamer.video.VideoOverlayRectangle copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoOverlayRectangle(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the flags associated with a {@link VideoOverlayRectangle}.
     * This is useful if the caller can handle both premultiplied alpha and
     * non premultiplied alpha, for example. By knowing whether the rectangle
     * uses premultiplied or not, it can request the pixel data in the format
     * it is stored in, to avoid unnecessary conversion.
     * @return the {@link VideoOverlayFormatFlags} associated with the rectangle.
     */
    public @NotNull org.gstreamer.video.VideoOverlayFormatFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_rectangle_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoOverlayFormatFlags(RESULT);
    }
    
    /**
     * Retrieves the global-alpha value associated with a {@link VideoOverlayRectangle}.
     * @return the global-alpha value associated with the rectangle.
     */
    public float getGlobalAlpha() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gst_video_overlay_rectangle_get_global_alpha.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.gst.Buffer getPixelsArgb(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_argb.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.gst.Buffer getPixelsAyuv(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_ayuv.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.gst.Buffer getPixelsRaw(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_raw.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the pixel data as it is. This is useful if the caller can
     * do the scaling itself when handling the overlaying. The rectangle will
     * need to be scaled to the render dimensions, which can be retrieved using
     * gst_video_overlay_rectangle_get_render_rectangle().
     * @param flags flags.
     *    If a global_alpha value != 1 is set for the rectangle, the caller
     *    should set the {@code GST_VIDEO_OVERLAY_FORMAT_FLAG_GLOBAL_ALPHA} flag
     *    if he wants to apply global-alpha himself. If the flag is not set
     *    global_alpha is applied internally before returning the pixel-data.
     * @return a {@link org.gstreamer.gst.Buffer} holding the ARGB pixel data with
     *    {@link VideoMeta} set. This function does not return a reference, the caller
     *    should obtain a reference of her own with gst_buffer_ref() if needed.
     */
    public @NotNull org.gstreamer.gst.Buffer getPixelsUnscaledArgb(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_unscaled_argb.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the pixel data as it is. This is useful if the caller can
     * do the scaling itself when handling the overlaying. The rectangle will
     * need to be scaled to the render dimensions, which can be retrieved using
     * gst_video_overlay_rectangle_get_render_rectangle().
     * @param flags flags.
     *    If a global_alpha value != 1 is set for the rectangle, the caller
     *    should set the {@code GST_VIDEO_OVERLAY_FORMAT_FLAG_GLOBAL_ALPHA} flag
     *    if he wants to apply global-alpha himself. If the flag is not set
     *    global_alpha is applied internally before returning the pixel-data.
     * @return a {@link org.gstreamer.gst.Buffer} holding the AYUV pixel data with
     *    {@link VideoMeta} set. This function does not return a reference, the caller
     *    should obtain a reference of her own with gst_buffer_ref() if needed.
     */
    public @NotNull org.gstreamer.gst.Buffer getPixelsUnscaledAyuv(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_unscaled_ayuv.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the pixel data as it is. This is useful if the caller can
     * do the scaling itself when handling the overlaying. The rectangle will
     * need to be scaled to the render dimensions, which can be retrieved using
     * gst_video_overlay_rectangle_get_render_rectangle().
     * @param flags flags.
     *    If a global_alpha value != 1 is set for the rectangle, the caller
     *    should set the {@code GST_VIDEO_OVERLAY_FORMAT_FLAG_GLOBAL_ALPHA} flag
     *    if he wants to apply global-alpha himself. If the flag is not set
     *    global_alpha is applied internally before returning the pixel-data.
     * @return a {@link org.gstreamer.gst.Buffer} holding the pixel data with
     *    {@link VideoMeta} set. This function does not return a reference, the caller
     *    should obtain a reference of her own with gst_buffer_ref() if needed.
     */
    public @NotNull org.gstreamer.gst.Buffer getPixelsUnscaledRaw(@NotNull org.gstreamer.video.VideoOverlayFormatFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_rectangle_get_pixels_unscaled_raw.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the render position and render dimension of the overlay
     * rectangle on the video.
     * @param renderX address where to store the X render offset
     * @param renderY address where to store the Y render offset
     * @param renderWidth address where to store the render width
     * @param renderHeight address where to store the render height
     * @return TRUE if valid render dimensions were retrieved.
     */
    public boolean getRenderRectangle(Out<Integer> renderX, Out<Integer> renderY, Out<Integer> renderWidth, Out<Integer> renderHeight) {
        java.util.Objects.requireNonNull(renderX, "Parameter 'renderX' must not be null");
        MemorySegment renderXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(renderY, "Parameter 'renderY' must not be null");
        MemorySegment renderYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(renderWidth, "Parameter 'renderWidth' must not be null");
        MemorySegment renderWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(renderHeight, "Parameter 'renderHeight' must not be null");
        MemorySegment renderHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_rectangle_get_render_rectangle.invokeExact(
                    handle(),
                    (Addressable) renderXPOINTER.address(),
                    (Addressable) renderYPOINTER.address(),
                    (Addressable) renderWidthPOINTER.address(),
                    (Addressable) renderHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        renderX.set(renderXPOINTER.get(Interop.valueLayout.C_INT, 0));
        renderY.set(renderYPOINTER.get(Interop.valueLayout.C_INT, 0));
        renderWidth.set(renderWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        renderHeight.set(renderHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the sequence number of this rectangle. Sequence numbers are
     * monotonically increasing and unique for overlay compositions and rectangles
     * (meaning there will never be a rectangle with the same sequence number as
     * a composition).
     * <p>
     * Using the sequence number of a rectangle as an indicator for changed
     * pixel-data of a rectangle is dangereous. Some API calls, like e.g.
     * gst_video_overlay_rectangle_set_global_alpha(), automatically update
     * the per rectangle sequence number, which is misleading for renderers/
     * consumers, that handle global-alpha themselves. For them  the
     * pixel-data returned by gst_video_overlay_rectangle_get_pixels_*()
     * won't be different for different global-alpha values. In this case a
     * renderer could also use the GstBuffer pointers as a hint for changed
     * pixel-data.
     * @return the sequence number of {@code rectangle}
     */
    public int getSeqnum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_rectangle_get_seqnum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the global alpha value associated with a {@link VideoOverlayRectangle}. Per-
     * pixel alpha values are multiplied with this value. Valid
     * values: 0 &lt;= global_alpha &lt;= 1; 1 to deactivate.
     * <p>
     * {@code rectangle} must be writable, meaning its refcount must be 1. You can
     * make the rectangles inside a {@link VideoOverlayComposition} writable using
     * gst_video_overlay_composition_make_writable() or
     * gst_video_overlay_composition_copy().
     * @param globalAlpha Global alpha value (0 to 1.0)
     */
    public void setGlobalAlpha(float globalAlpha) {
        try {
            DowncallHandles.gst_video_overlay_rectangle_set_global_alpha.invokeExact(
                    handle(),
                    globalAlpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the render position and dimensions of the rectangle on the video.
     * This function is mainly for elements that modify the size of the video
     * in some way (e.g. through scaling or cropping) and need to adjust the
     * details of any overlays to match the operation that changed the size.
     * <p>
     * {@code rectangle} must be writable, meaning its refcount must be 1. You can
     * make the rectangles inside a {@link VideoOverlayComposition} writable using
     * gst_video_overlay_composition_make_writable() or
     * gst_video_overlay_composition_copy().
     * @param renderX render X position of rectangle on video
     * @param renderY render Y position of rectangle on video
     * @param renderWidth render width of rectangle
     * @param renderHeight render height of rectangle
     */
    public void setRenderRectangle(int renderX, int renderY, int renderWidth, int renderHeight) {
        try {
            DowncallHandles.gst_video_overlay_rectangle_set_render_rectangle.invokeExact(
                    handle(),
                    renderX,
                    renderY,
                    renderWidth,
                    renderHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_overlay_rectangle_new_raw = Interop.downcallHandle(
            "gst_video_overlay_rectangle_new_raw",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_copy = Interop.downcallHandle(
            "gst_video_overlay_rectangle_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_flags = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_global_alpha = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_global_alpha",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_argb = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_argb",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_ayuv = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_ayuv",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_raw = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_raw",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_unscaled_argb = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_unscaled_argb",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_unscaled_ayuv = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_unscaled_ayuv",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_pixels_unscaled_raw = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_pixels_unscaled_raw",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_render_rectangle = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_render_rectangle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_get_seqnum = Interop.downcallHandle(
            "gst_video_overlay_rectangle_get_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_set_global_alpha = Interop.downcallHandle(
            "gst_video_overlay_rectangle_set_global_alpha",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_rectangle_set_render_rectangle = Interop.downcallHandle(
            "gst_video_overlay_rectangle_set_render_rectangle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
