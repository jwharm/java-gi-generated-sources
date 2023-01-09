package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Additional mapping flags for gst_video_frame_map().
 * @version 1.6
 */
public class VideoFrameMapFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFrameMapFlags";
    
    /**
     * Don't take another reference of the buffer and store it in
     *                                    the GstVideoFrame. This makes sure that the buffer stays
     *                                    writable while the frame is mapped, but requires that the
     *                                    buffer reference stays valid until the frame is unmapped again.
     */
    public static final VideoFrameMapFlags NO_REF = new VideoFrameMapFlags(65536);
    
    /**
     * Offset to define more flags
     */
    public static final VideoFrameMapFlags LAST = new VideoFrameMapFlags(16777216);
    
    /**
     * Create a new VideoFrameMapFlags with the provided value
     */
    public VideoFrameMapFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoFrameMapFlags or(VideoFrameMapFlags... masks) {
        int value = this.getValue();
        for (VideoFrameMapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFrameMapFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoFrameMapFlags combined(VideoFrameMapFlags mask, VideoFrameMapFlags... masks) {
        int value = mask.getValue();
        for (VideoFrameMapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFrameMapFlags(value);
    }
}
