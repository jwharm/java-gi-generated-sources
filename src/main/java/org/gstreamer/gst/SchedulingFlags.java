package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different scheduling flags.
 */
public class SchedulingFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstSchedulingFlags";
    
    /**
     * if seeking is possible
     */
    public static final SchedulingFlags SEEKABLE = new SchedulingFlags(1);
    
    /**
     * if sequential access is recommended
     */
    public static final SchedulingFlags SEQUENTIAL = new SchedulingFlags(2);
    
    /**
     * if bandwidth is limited and buffering possible (since 1.2)
     */
    public static final SchedulingFlags BANDWIDTH_LIMITED = new SchedulingFlags(4);
    
    public SchedulingFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SchedulingFlags combined(SchedulingFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SchedulingFlags combined(SchedulingFlags mask, SchedulingFlags... masks) {
        for (SchedulingFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
