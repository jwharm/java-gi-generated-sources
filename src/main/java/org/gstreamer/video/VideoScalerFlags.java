package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different scale flags.
 */
public class VideoScalerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoScalerFlags";
    
    /**
     * no flags
     */
    public static final VideoScalerFlags NONE = new VideoScalerFlags(0);
    
    /**
     * Set up a scaler for interlaced content
     */
    public static final VideoScalerFlags INTERLACED = new VideoScalerFlags(1);
    
    public VideoScalerFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoScalerFlags or(VideoScalerFlags... masks) {
        int value = this.getValue();
        for (VideoScalerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoScalerFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoScalerFlags combined(VideoScalerFlags mask, VideoScalerFlags... masks) {
        int value = mask.getValue();
        for (VideoScalerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoScalerFlags(value);
    }
}
