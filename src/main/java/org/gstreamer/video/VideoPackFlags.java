package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different flags that can be used when packing and unpacking.
 */
public class VideoPackFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoPackFlags";
    
    /**
     * No flag
     */
    public static final VideoPackFlags NONE = new VideoPackFlags(0);
    
    /**
     * When the source has a smaller depth
     *   than the target format, set the least significant bits of the target
     *   to 0. This is likely slightly faster but less accurate. When this flag
     *   is not specified, the most significant bits of the source are duplicated
     *   in the least significant bits of the destination.
     */
    public static final VideoPackFlags TRUNCATE_RANGE = new VideoPackFlags(1);
    
    /**
     * The source is interlaced. The unpacked
     *   format will be interlaced as well with each line containing
     *   information from alternating fields. (Since: 1.2)
     */
    public static final VideoPackFlags INTERLACED = new VideoPackFlags(2);
    
    public VideoPackFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoPackFlags or(VideoPackFlags mask) {
        return new VideoPackFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoPackFlags combined(VideoPackFlags mask, VideoPackFlags... masks) {
        int value = mask.getValue();        for (VideoPackFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoPackFlags(value);
    }
}
