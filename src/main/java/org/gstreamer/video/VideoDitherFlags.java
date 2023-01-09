package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra flags that influence the result from gst_video_chroma_resample_new().
 */
public class VideoDitherFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDitherFlags";
    
    /**
     * no flags
     */
    public static final VideoDitherFlags NONE = new VideoDitherFlags(0);
    
    /**
     * the input is interlaced
     */
    public static final VideoDitherFlags INTERLACED = new VideoDitherFlags(1);
    
    /**
     * quantize values in addition to adding dither.
     */
    public static final VideoDitherFlags QUANTIZE = new VideoDitherFlags(2);
    
    /**
     * Create a new VideoDitherFlags with the provided value
     */
    public VideoDitherFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoDitherFlags or(VideoDitherFlags... masks) {
        int value = this.getValue();
        for (VideoDitherFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoDitherFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoDitherFlags combined(VideoDitherFlags mask, VideoDitherFlags... masks) {
        int value = mask.getValue();
        for (VideoDitherFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoDitherFlags(value);
    }
}
