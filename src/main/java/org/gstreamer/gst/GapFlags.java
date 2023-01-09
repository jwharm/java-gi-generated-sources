package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different flags that can be set on {@code GST_EVENT_GAP} events. See
 * gst_event_set_gap_flags() for details.
 * @version 1.20
 */
public class GapFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGapFlags";
    
    /**
     * The {@code GST_EVENT_GAP} signals missing data,
     *    for example because of packet loss.
     */
    public static final GapFlags DATA = new GapFlags(1);
    
    /**
     * Create a new GapFlags with the provided value
     */
    public GapFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GapFlags or(GapFlags... masks) {
        int value = this.getValue();
        for (GapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new GapFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GapFlags combined(GapFlags mask, GapFlags... masks) {
        int value = mask.getValue();
        for (GapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new GapFlags(value);
    }
}
