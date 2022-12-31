package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class StreamFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamFlags";
    
    /**
     * This stream has no special attributes
     */
    public static final StreamFlags NONE = new StreamFlags(0);
    
    /**
     * This stream is a sparse stream (e.g. a subtitle
     *    stream), data may flow only in irregular intervals with large gaps in
     *    between.
     */
    public static final StreamFlags SPARSE = new StreamFlags(1);
    
    /**
     * This stream should be selected by default. This
     *    flag may be used by demuxers to signal that a stream should be selected
     *    by default in a playback scenario.
     */
    public static final StreamFlags SELECT = new StreamFlags(2);
    
    /**
     * This stream should not be selected by default.
     *    This flag may be used by demuxers to signal that a stream should not
     *    be selected by default in a playback scenario, but only if explicitly
     *    selected by the user (e.g. an audio track for the hard of hearing or
     *    a director's commentary track).
     */
    public static final StreamFlags UNSELECT = new StreamFlags(4);
    
    public StreamFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public StreamFlags or(StreamFlags... masks) {
        int value = this.getValue();
        for (StreamFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StreamFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static StreamFlags combined(StreamFlags mask, StreamFlags... masks) {
        int value = mask.getValue();
        for (StreamFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StreamFlags(value);
    }
}
