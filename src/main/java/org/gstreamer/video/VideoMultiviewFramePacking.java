package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoMultiviewFramePacking} represents the subset of {@link VideoMultiviewMode}
 * values that can be applied to any video frame without needing extra metadata.
 * It can be used by elements that provide a property to override the
 * multiview interpretation of a video stream when the video doesn't contain
 * any markers.
 * <p>
 * This enum is used (for example) on playbin, to re-interpret a played
 * video stream as a stereoscopic video. The individual enum values are
 * equivalent to and have the same value as the matching {@link VideoMultiviewMode}.
 */
public enum VideoMultiviewFramePacking implements io.github.jwharm.javagi.Enumeration {
    /**
     * A special value indicating
     * no frame packing info.
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
    CHECKERBOARD(8);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMultiviewFramePacking";
    
    private final int value;
    VideoMultiviewFramePacking(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoMultiviewFramePacking of(int value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
