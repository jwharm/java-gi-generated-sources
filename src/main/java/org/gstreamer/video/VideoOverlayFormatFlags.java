package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Overlay format flags.
 */
public class VideoOverlayFormatFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOverlayFormatFlags";
    
    /**
     * no flags
     */
    public static final VideoOverlayFormatFlags NONE = new VideoOverlayFormatFlags(0);
    
    /**
     * RGB are premultiplied by A/255.
     */
    public static final VideoOverlayFormatFlags PREMULTIPLIED_ALPHA = new VideoOverlayFormatFlags(1);
    
    /**
     * a global-alpha value != 1 is set.
     */
    public static final VideoOverlayFormatFlags GLOBAL_ALPHA = new VideoOverlayFormatFlags(2);
    
    /**
     * Create a new VideoOverlayFormatFlags with the provided value
     */
    public VideoOverlayFormatFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoOverlayFormatFlags or(VideoOverlayFormatFlags... masks) {
        int value = this.getValue();
        for (VideoOverlayFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoOverlayFormatFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoOverlayFormatFlags combined(VideoOverlayFormatFlags mask, VideoOverlayFormatFlags... masks) {
        int value = mask.getValue();
        for (VideoOverlayFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoOverlayFormatFlags(value);
    }
}
