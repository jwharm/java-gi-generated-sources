package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to be used in combination with gst_video_decoder_request_sync_point().
 * See the function documentation for more details.
 * @version 1.20
 */
public class VideoDecoderRequestSyncPointFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDecoderRequestSyncPointFlags";
    
    /**
     * discard all following
     *     input until the next sync point.
     */
    public static final VideoDecoderRequestSyncPointFlags DISCARD_INPUT = new VideoDecoderRequestSyncPointFlags(1);
    
    /**
     * discard all following
     *     output until the next sync point.
     */
    public static final VideoDecoderRequestSyncPointFlags CORRUPT_OUTPUT = new VideoDecoderRequestSyncPointFlags(2);
    
    public VideoDecoderRequestSyncPointFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoDecoderRequestSyncPointFlags or(VideoDecoderRequestSyncPointFlags mask) {
        return new VideoDecoderRequestSyncPointFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoDecoderRequestSyncPointFlags combined(VideoDecoderRequestSyncPointFlags mask, VideoDecoderRequestSyncPointFlags... masks) {
        int value = mask.getValue();        for (VideoDecoderRequestSyncPointFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoDecoderRequestSyncPointFlags(value);
    }
}
