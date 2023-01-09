package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra flags that influence the result from gst_video_chroma_resample_new().
 */
public class VideoChromaFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoChromaFlags";
    
    /**
     * no flags
     */
    public static final VideoChromaFlags NONE = new VideoChromaFlags(0);
    
    /**
     * the input is interlaced
     */
    public static final VideoChromaFlags INTERLACED = new VideoChromaFlags(1);
    
    /**
     * Create a new VideoChromaFlags with the provided value
     */
    public VideoChromaFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoChromaFlags or(VideoChromaFlags... masks) {
        int value = this.getValue();
        for (VideoChromaFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoChromaFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoChromaFlags combined(VideoChromaFlags mask, VideoChromaFlags... masks) {
        int value = mask.getValue();
        for (VideoChromaFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoChromaFlags(value);
    }
}
