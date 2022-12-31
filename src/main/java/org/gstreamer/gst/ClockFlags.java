package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The capabilities of this clock
 */
public class ClockFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstClockFlags";
    
    /**
     * clock can do a single sync timeout request
     */
    public static final ClockFlags CAN_DO_SINGLE_SYNC = new ClockFlags(16);
    
    /**
     * clock can do a single async timeout request
     */
    public static final ClockFlags CAN_DO_SINGLE_ASYNC = new ClockFlags(32);
    
    /**
     * clock can do sync periodic timeout requests
     */
    public static final ClockFlags CAN_DO_PERIODIC_SYNC = new ClockFlags(64);
    
    /**
     * clock can do async periodic timeout callbacks
     */
    public static final ClockFlags CAN_DO_PERIODIC_ASYNC = new ClockFlags(128);
    
    /**
     * clock's resolution can be changed
     */
    public static final ClockFlags CAN_SET_RESOLUTION = new ClockFlags(256);
    
    /**
     * clock can be slaved to a master clock
     */
    public static final ClockFlags CAN_SET_MASTER = new ClockFlags(512);
    
    /**
     * clock needs to be synced before it can be used
     */
    public static final ClockFlags NEEDS_STARTUP_SYNC = new ClockFlags(1024);
    
    /**
     * subclasses can add additional flags starting from this flag
     */
    public static final ClockFlags LAST = new ClockFlags(4096);
    
    public ClockFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ClockFlags or(ClockFlags... masks) {
        int value = this.getValue();
        for (ClockFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ClockFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ClockFlags combined(ClockFlags mask, ClockFlags... masks) {
        int value = mask.getValue();
        for (ClockFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ClockFlags(value);
    }
}
