package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra video frame flags
 */
public class VideoFrameFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFrameFlags";
    
    /**
     * no flags
     */
    public static final VideoFrameFlags NONE = new VideoFrameFlags(0);
    
    /**
     * The video frame is interlaced. In mixed
     *           interlace-mode, this flag specifies if the frame is interlaced or
     *           progressive.
     */
    public static final VideoFrameFlags INTERLACED = new VideoFrameFlags(1);
    
    /**
     * The video frame has the top field first
     */
    public static final VideoFrameFlags TFF = new VideoFrameFlags(2);
    
    /**
     * The video frame has the repeat flag
     */
    public static final VideoFrameFlags RFF = new VideoFrameFlags(4);
    
    /**
     * The video frame has one field
     */
    public static final VideoFrameFlags ONEFIELD = new VideoFrameFlags(8);
    
    /**
     * The video contains one or
     *     more non-mono views
     */
    public static final VideoFrameFlags MULTIPLE_VIEW = new VideoFrameFlags(16);
    
    /**
     * The video frame is the first
     *     in a set of corresponding views provided as sequential frames.
     */
    public static final VideoFrameFlags FIRST_IN_BUNDLE = new VideoFrameFlags(32);
    
    /**
     * The video frame has the top field only. This
     *     is the same as GST_VIDEO_FRAME_FLAG_TFF | GST_VIDEO_FRAME_FLAG_ONEFIELD
     *     (Since: 1.16).
     */
    public static final VideoFrameFlags TOP_FIELD = new VideoFrameFlags(10);
    
    /**
     * The video frame has the bottom field
     *     only. This is the same as GST_VIDEO_FRAME_FLAG_ONEFIELD
     *     (GST_VIDEO_FRAME_FLAG_TFF flag unset) (Since: 1.16).
     */
    public static final VideoFrameFlags BOTTOM_FIELD = new VideoFrameFlags(8);
    
    public VideoFrameFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoFrameFlags or(VideoFrameFlags... masks) {
        int value = this.getValue();
        for (VideoFrameFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFrameFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoFrameFlags combined(VideoFrameFlags mask, VideoFrameFlags... masks) {
        int value = mask.getValue();
        for (VideoFrameFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFrameFlags(value);
    }
}
