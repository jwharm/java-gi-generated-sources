package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags related to the time code information.
 * For drop frame, only 30000/1001 and 60000/1001 frame rates are supported.
 * @version 1.10
 */
public class VideoTimeCodeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTimeCodeFlags";
    
    /**
     * No flags
     */
    public static final VideoTimeCodeFlags NONE = new VideoTimeCodeFlags(0);
    
    /**
     * Whether we have drop frame rate
     */
    public static final VideoTimeCodeFlags DROP_FRAME = new VideoTimeCodeFlags(1);
    
    /**
     * Whether we have interlaced video
     */
    public static final VideoTimeCodeFlags INTERLACED = new VideoTimeCodeFlags(2);
    
    /**
     * Create a new VideoTimeCodeFlags with the provided value
     */
    public VideoTimeCodeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoTimeCodeFlags or(VideoTimeCodeFlags... masks) {
        int value = this.getValue();
        for (VideoTimeCodeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoTimeCodeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoTimeCodeFlags combined(VideoTimeCodeFlags mask, VideoTimeCodeFlags... masks) {
        int value = mask.getValue();
        for (VideoTimeCodeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoTimeCodeFlags(value);
    }
}
