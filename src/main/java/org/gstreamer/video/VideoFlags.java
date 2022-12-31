package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra video flags
 */
public class VideoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFlags";
    
    /**
     * no flags
     */
    public static final VideoFlags NONE = new VideoFlags(0);
    
    /**
     * a variable fps is selected, fps_n and fps_d
     *     denote the maximum fps of the video
     */
    public static final VideoFlags VARIABLE_FPS = new VideoFlags(1);
    
    /**
     * Each color has been scaled by the alpha
     *     value.
     */
    public static final VideoFlags PREMULTIPLIED_ALPHA = new VideoFlags(2);
    
    public VideoFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoFlags or(VideoFlags... masks) {
        int value = this.getValue();
        for (VideoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoFlags combined(VideoFlags mask, VideoFlags... masks) {
        int value = mask.getValue();
        for (VideoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFlags(value);
    }
}
