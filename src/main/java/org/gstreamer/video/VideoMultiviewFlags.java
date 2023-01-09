package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstVideoMultiviewFlags are used to indicate extra properties of a
 * stereo/multiview stream beyond the frame layout and buffer mapping
 * that is conveyed in the {@link VideoMultiviewMode}.
 */
public class VideoMultiviewFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMultiviewFlags";
    
    /**
     * No flags
     */
    public static final VideoMultiviewFlags NONE = new VideoMultiviewFlags(0);
    
    /**
     * For stereo streams, the
     *     normal arrangement of left and right views is reversed.
     */
    public static final VideoMultiviewFlags RIGHT_VIEW_FIRST = new VideoMultiviewFlags(1);
    
    /**
     * The left view is vertically
     *     mirrored.
     */
    public static final VideoMultiviewFlags LEFT_FLIPPED = new VideoMultiviewFlags(2);
    
    /**
     * The left view is horizontally
     *     mirrored.
     */
    public static final VideoMultiviewFlags LEFT_FLOPPED = new VideoMultiviewFlags(4);
    
    /**
     * The right view is
     *     vertically mirrored.
     */
    public static final VideoMultiviewFlags RIGHT_FLIPPED = new VideoMultiviewFlags(8);
    
    /**
     * The right view is
     *     horizontally mirrored.
     */
    public static final VideoMultiviewFlags RIGHT_FLOPPED = new VideoMultiviewFlags(16);
    
    /**
     * For frame-packed
     *     multiview modes, indicates that the individual
     *     views have been encoded with half the true width or height
     *     and should be scaled back up for display. This flag
     *     is used for overriding input layout interpretation
     *     by adjusting pixel-aspect-ratio.
     *     For side-by-side, column interleaved or checkerboard packings, the
     *     pixel width will be doubled. For row interleaved and top-bottom
     *     encodings, pixel height will be doubled.
     */
    public static final VideoMultiviewFlags HALF_ASPECT = new VideoMultiviewFlags(16384);
    
    /**
     * The video stream contains both
     *     mono and multiview portions, signalled on each buffer by the
     *     absence or presence of the {@code GST_VIDEO_BUFFER_FLAG_MULTIPLE_VIEW}
     *     buffer flag.
     */
    public static final VideoMultiviewFlags MIXED_MONO = new VideoMultiviewFlags(32768);
    
    /**
     * Create a new VideoMultiviewFlags with the provided value
     */
    public VideoMultiviewFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoMultiviewFlags or(VideoMultiviewFlags... masks) {
        int value = this.getValue();
        for (VideoMultiviewFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoMultiviewFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoMultiviewFlags combined(VideoMultiviewFlags mask, VideoMultiviewFlags... masks) {
        int value = mask.getValue();
        for (VideoMultiviewFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoMultiviewFlags(value);
    }
}
