package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * All possible stereoscopic 3D and multiview representations.
 * In conjunction with {@link VideoMultiviewFlags}, describes how
 * multiview content is being transported in the stream.
 */
public enum VideoMultiviewMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * A special value indicating
     * no multiview information. Used in GstVideoInfo and other places to
     * indicate that no specific multiview handling has been requested or
     * provided. This value is never carried on caps.
     */
    NONE(-1),
    /**
     * All frames are monoscopic.
     */
    MONO(0),
    /**
     * All frames represent a left-eye view.
     */
    LEFT(1),
    /**
     * All frames represent a right-eye view.
     */
    RIGHT(2),
    /**
     * Left and right eye views are
     * provided in the left and right half of the frame respectively.
     */
    SIDE_BY_SIDE(3),
    /**
     * Left and right eye
     * views are provided in the left and right half of the frame, but
     * have been sampled using quincunx method, with half-pixel offset
     * between the 2 views.
     */
    SIDE_BY_SIDE_QUINCUNX(4),
    /**
     * Alternating vertical
     * columns of pixels represent the left and right eye view respectively.
     */
    COLUMN_INTERLEAVED(5),
    /**
     * Alternating horizontal
     * rows of pixels represent the left and right eye view respectively.
     */
    ROW_INTERLEAVED(6),
    /**
     * The top half of the frame
     * contains the left eye, and the bottom half the right eye.
     */
    TOP_BOTTOM(7),
    /**
     * Pixels are arranged with
     * alternating pixels representing left and right eye views in a
     * checkerboard fashion.
     */
    CHECKERBOARD(8),
    /**
     * Left and right eye views
     * are provided in separate frames alternately.
     */
    FRAME_BY_FRAME(32),
    /**
     * Multiple
     * independent views are provided in separate frames in sequence.
     * This method only applies to raw video buffers at the moment.
     * Specific view identification is via the {@code GstVideoMultiviewMeta}
     * and {@link VideoMeta}(s) on raw video buffers.
     */
    MULTIVIEW_FRAME_BY_FRAME(33),
    /**
     * Multiple views are
     * provided as separate {@link org.gstreamer.gst.Memory} framebuffers attached to each
     * {@link org.gstreamer.gst.Buffer}, described by the {@code GstVideoMultiviewMeta}
     * and {@link VideoMeta}(s)
     */
    SEPARATED(34);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMultiviewMode";
    
    private final int value;
    VideoMultiviewMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoMultiviewMode of(int value) {
        return switch (value) {
            case -1 -> NONE;
            case 0 -> MONO;
            case 1 -> LEFT;
            case 2 -> RIGHT;
            case 3 -> SIDE_BY_SIDE;
            case 4 -> SIDE_BY_SIDE_QUINCUNX;
            case 5 -> COLUMN_INTERLEAVED;
            case 6 -> ROW_INTERLEAVED;
            case 7 -> TOP_BOTTOM;
            case 8 -> CHECKERBOARD;
            case 32 -> FRAME_BY_FRAME;
            case 33 -> MULTIVIEW_FRAME_BY_FRAME;
            case 34 -> SEPARATED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gstreamer.video.VideoMultiviewMode fromCapsString(java.lang.String capsMviewMode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_multiview_mode_from_caps_string.invokeExact(
                    Marshal.stringToAddress.marshal(capsMviewMode, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoMultiviewMode.of(RESULT);
    }
    
    public static java.lang.String toCapsString(org.gstreamer.video.VideoMultiviewMode mviewMode) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_multiview_mode_to_caps_string.invokeExact(
                    mviewMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_multiview_mode_from_caps_string = Interop.downcallHandle(
            "gst_video_multiview_mode_from_caps_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_multiview_mode_to_caps_string = Interop.downcallHandle(
            "gst_video_multiview_mode_to_caps_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
