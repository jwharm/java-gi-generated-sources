package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for the GstSegment structure. Currently mapped to the corresponding
 * values of the seek flags.
 */
public class SegmentFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstSegmentFlags";
    
    /**
     * no flags
     */
    public static final SegmentFlags NONE = new SegmentFlags(0);
    
    /**
     * reset the pipeline running_time to the segment
     *                          running_time
     */
    public static final SegmentFlags RESET = new SegmentFlags(1);
    
    /**
     * perform skip playback (Since: 1.6)
     */
    public static final SegmentFlags TRICKMODE = new SegmentFlags(16);
    
    /**
     * Deprecated backward compatibility flag, replaced
     *                         by {@code GST_SEGMENT_FLAG_TRICKMODE}
     */
    public static final SegmentFlags SKIP = new SegmentFlags(16);
    
    /**
     * send SEGMENT_DONE instead of EOS
     */
    public static final SegmentFlags SEGMENT = new SegmentFlags(8);
    
    /**
     * Decode only keyframes, where
     *                                        possible (Since: 1.6)
     */
    public static final SegmentFlags TRICKMODE_KEY_UNITS = new SegmentFlags(128);
    
    /**
     * Decode only keyframes or forward
     *                                        predicted frames, where possible (Since: 1.18)
     */
    public static final SegmentFlags TRICKMODE_FORWARD_PREDICTED = new SegmentFlags(512);
    
    /**
     * Do not decode any audio, where
     *                                        possible (Since: 1.6)
     */
    public static final SegmentFlags TRICKMODE_NO_AUDIO = new SegmentFlags(256);
    
    /**
     * Create a new SegmentFlags with the provided value
     */
    public SegmentFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SegmentFlags or(SegmentFlags... masks) {
        int value = this.getValue();
        for (SegmentFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SegmentFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SegmentFlags combined(SegmentFlags mask, SegmentFlags... masks) {
        int value = mask.getValue();
        for (SegmentFlags arg : masks) {
            value |= arg.getValue();
        }
        return new SegmentFlags(value);
    }
}
