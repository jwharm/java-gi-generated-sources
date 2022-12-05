package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to be used in a {@link BaseParseFrame}.
 */
public class BaseParseFrameFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseParseFrameFlags";
    
    /**
     * no flag
     */
    public static final BaseParseFrameFlags NONE = new BaseParseFrameFlags(0);
    
    /**
     * set by baseclass if current frame
     *   is passed for processing to the subclass for the first time
     *   (and not set on subsequent calls with same data).
     */
    public static final BaseParseFrameFlags NEW_FRAME = new BaseParseFrameFlags(1);
    
    /**
     * set to indicate this buffer should not be
     *   counted as frame, e.g. if this frame is dependent on a previous one.
     *   As it is not counted as a frame, bitrate increases but frame to time
     *   conversions are maintained.
     */
    public static final BaseParseFrameFlags NO_FRAME = new BaseParseFrameFlags(2);
    
    /**
     * {@code pre_push_frame} can set this to indicate
     *    that regular segment clipping can still be performed (as opposed to
     *    any custom one having been done).
     */
    public static final BaseParseFrameFlags CLIP = new BaseParseFrameFlags(4);
    
    /**
     * indicates to {@code finish_frame} that the
     *    the frame should be dropped (and might be handled internally by subclass)
     */
    public static final BaseParseFrameFlags DROP = new BaseParseFrameFlags(8);
    
    /**
     * indicates to {@code finish_frame} that the
     *    the frame should be queued for now and processed fully later
     *    when the first non-queued frame is finished
     */
    public static final BaseParseFrameFlags QUEUE = new BaseParseFrameFlags(16);
    
    public BaseParseFrameFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BaseParseFrameFlags or(BaseParseFrameFlags mask) {
        return new BaseParseFrameFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BaseParseFrameFlags combined(BaseParseFrameFlags mask, BaseParseFrameFlags... masks) {
        int value = mask.getValue();        for (BaseParseFrameFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BaseParseFrameFlags(value);
    }
}
