package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different kind of clocks.
 */
public class ClockType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstClockType";
    
    /**
     * time since Epoch
     */
    public static final ClockType REALTIME = new ClockType(0);
    
    /**
     * monotonic time since some unspecified starting
     *                            point
     */
    public static final ClockType MONOTONIC = new ClockType(1);
    
    /**
     * some other time source is used (Since: 1.0.5)
     */
    public static final ClockType OTHER = new ClockType(2);
    
    /**
     * time since Epoch, but using International Atomic Time
     *                      as reference (Since: 1.18)
     */
    public static final ClockType TAI = new ClockType(3);
    
    public ClockType(int value) {
        super(value);
    }
}
