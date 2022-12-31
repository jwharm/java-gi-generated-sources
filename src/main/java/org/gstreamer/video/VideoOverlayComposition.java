package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functions to create and handle overlay compositions on video buffers.
 * <p>
 * An overlay composition describes one or more overlay rectangles to be
 * blended on top of a video buffer.
 * <p>
 * This API serves two main purposes:
 * <p>
 * * it can be used to attach overlay information (subtitles or logos)
 *   to non-raw video buffers such as GL/VAAPI/VDPAU surfaces. The actual
 *   blending of the overlay can then be done by e.g. the video sink that
 *   processes these non-raw buffers.
 * <p>
 * * it can also be used to blend overlay rectangles on top of raw video
 *   buffers, thus consolidating blending functionality for raw video in
 *   one place.
 * <p>
 * Together, this allows existing overlay elements to easily handle raw
 * and non-raw video as input in without major changes (once the overlays
 * have been put into a {@link VideoOverlayComposition} object anyway) - for raw
 * video the overlay can just use the blending function to blend the data
 * on top of the video, and for surface buffers it can just attach them to
 * the buffer and let the sink render the overlays.
 */
public class VideoOverlayComposition extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOverlayComposition";
    
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
     * Allocate a new {@link VideoOverlayComposition}
     * @return A new, uninitialized @{link VideoOverlayComposition}
     */
    public static VideoOverlayComposition allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoOverlayComposition newInstance = new VideoOverlayComposition(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoOverlayComposition proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoOverlayComposition(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoOverlayComposition> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoOverlayComposition(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gstreamer.video.VideoOverlayRectangle rectangle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_new.invokeExact(
                    (Addressable) (rectangle == null ? MemoryAddress.NULL : rectangle.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new video overlay composition object to hold one or more
     * overlay rectangles.
     * <p>
     * Note that since 1.20 this allows to pass {@code null} for {@code rectangle}.
     * @param rectangle a {@link VideoOverlayRectangle} to add to the
     *     composition
     */
    public VideoOverlayComposition(@Nullable org.gstreamer.video.VideoOverlayRectangle rectangle) {
        super(constructNew(rectangle), Ownership.FULL);
    }
    
    /**
     * Adds an overlay rectangle to an existing overlay composition object. This
     * must be done right after creating the overlay composition.
     * @param rectangle a {@link VideoOverlayRectangle} to add to the
     *     composition
     */
    public void addRectangle(org.gstreamer.video.VideoOverlayRectangle rectangle) {
        try {
            DowncallHandles.gst_video_overlay_composition_add_rectangle.invokeExact(
                    handle(),
                    rectangle.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Blends the overlay rectangles in {@code comp} on top of the raw video data
     * contained in {@code video_buf}. The data in {@code video_buf} must be writable and
     * mapped appropriately.
     * <p>
     * Since {@code video_buf} data is read and will be modified, it ought be
     * mapped with flag GST_MAP_READWRITE.
     * @param videoBuf a {@link VideoFrame} containing raw video data in a
     *             supported format. It should be mapped using GST_MAP_READWRITE
     */
    public boolean blend(org.gstreamer.video.VideoFrame videoBuf) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_composition_blend.invokeExact(
                    handle(),
                    videoBuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Makes a copy of {@code comp} and all contained rectangles, so that it is possible
     * to modify the composition and contained rectangles (e.g. add additional
     * rectangles or change the render co-ordinates or render dimension). The
     * actual overlay pixel data buffers contained in the rectangles are not
     * copied.
     * @return a new {@link VideoOverlayComposition} equivalent
     *     to {@code comp}.
     */
    public org.gstreamer.video.VideoOverlayComposition copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoOverlayComposition.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@code n}-th {@link VideoOverlayRectangle} contained in {@code comp}.
     * @param n number of the rectangle to get
     * @return the {@code n}-th rectangle, or NULL if {@code n} is out of
     *     bounds. Will not return a new reference, the caller will need to
     *     obtain her own reference using gst_video_overlay_rectangle_ref()
     *     if needed.
     */
    public org.gstreamer.video.VideoOverlayRectangle getRectangle(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_get_rectangle.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoOverlayRectangle.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the sequence number of this composition. Sequence numbers are
     * monotonically increasing and unique for overlay compositions and rectangles
     * (meaning there will never be a rectangle with the same sequence number as
     * a composition).
     * @return the sequence number of {@code comp}
     */
    public int getSeqnum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_composition_get_seqnum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Takes ownership of {@code comp} and returns a version of {@code comp} that is writable
     * (i.e. can be modified). Will either return {@code comp} right away, or create a
     * new writable copy of {@code comp} and unref {@code comp} itself. All the contained
     * rectangles will also be copied, but the actual overlay pixel data buffers
     * contained in the rectangles are not copied.
     * @return a writable {@link VideoOverlayComposition}
     *     equivalent to {@code comp}.
     */
    public org.gstreamer.video.VideoOverlayComposition makeWritable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_make_writable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gstreamer.video.VideoOverlayComposition.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the number of {@link VideoOverlayRectangle}&lt;!-- --&gt;s contained in {@code comp}.
     * @return the number of rectangles
     */
    public int nRectangles() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_overlay_composition_n_rectangles.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_overlay_composition_new = Interop.downcallHandle(
            "gst_video_overlay_composition_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_add_rectangle = Interop.downcallHandle(
            "gst_video_overlay_composition_add_rectangle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_blend = Interop.downcallHandle(
            "gst_video_overlay_composition_blend",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_copy = Interop.downcallHandle(
            "gst_video_overlay_composition_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_get_rectangle = Interop.downcallHandle(
            "gst_video_overlay_composition_get_rectangle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_get_seqnum = Interop.downcallHandle(
            "gst_video_overlay_composition_get_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_make_writable = Interop.downcallHandle(
            "gst_video_overlay_composition_make_writable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_overlay_composition_n_rectangles = Interop.downcallHandle(
            "gst_video_overlay_composition_n_rectangles",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
