package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different resampler flags.
 * @version 1.6
 */
public class VideoResamplerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoResamplerFlags";
    
    /**
     * no flags
     */
    public static final VideoResamplerFlags NONE = new VideoResamplerFlags(0);
    
    /**
     * when no taps are given, half the
     *              number of calculated taps. This can be used when making scalers
     *              for the different fields of an interlaced picture. Since: 1.10
     */
    public static final VideoResamplerFlags HALF_TAPS = new VideoResamplerFlags(1);
    
    /**
     * Create a new VideoResamplerFlags with the provided value
     */
    public VideoResamplerFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoResamplerFlags or(VideoResamplerFlags... masks) {
        int value = this.getValue();
        for (VideoResamplerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoResamplerFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoResamplerFlags combined(VideoResamplerFlags mask, VideoResamplerFlags... masks) {
        int value = mask.getValue();
        for (VideoResamplerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoResamplerFlags(value);
    }
}
