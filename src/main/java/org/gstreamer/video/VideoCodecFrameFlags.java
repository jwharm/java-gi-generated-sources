package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for {@link VideoCodecFrame}
 */
public class VideoCodecFrameFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoCodecFrameFlags";
    
    /**
     * is the frame only meant to be decoded
     */
    public static final VideoCodecFrameFlags DECODE_ONLY = new VideoCodecFrameFlags(1);
    
    /**
     * is the frame a synchronization point (keyframe)
     */
    public static final VideoCodecFrameFlags SYNC_POINT = new VideoCodecFrameFlags(2);
    
    /**
     * should the output frame be made a keyframe
     */
    public static final VideoCodecFrameFlags FORCE_KEYFRAME = new VideoCodecFrameFlags(4);
    
    /**
     * should the encoder output stream headers
     */
    public static final VideoCodecFrameFlags FORCE_KEYFRAME_HEADERS = new VideoCodecFrameFlags(8);
    
    /**
     * The buffer data is corrupted.
     */
    public static final VideoCodecFrameFlags CORRUPTED = new VideoCodecFrameFlags(16);
    
    /**
     * Create a new VideoCodecFrameFlags with the provided value
     */
    public VideoCodecFrameFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoCodecFrameFlags or(VideoCodecFrameFlags... masks) {
        int value = this.getValue();
        for (VideoCodecFrameFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoCodecFrameFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoCodecFrameFlags combined(VideoCodecFrameFlags mask, VideoCodecFrameFlags... masks) {
        int value = mask.getValue();
        for (VideoCodecFrameFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoCodecFrameFlags(value);
    }
}
