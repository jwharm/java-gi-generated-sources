package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The return value of a clock operation.
 */
public class ClockReturn extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstClockReturn";
    
    /**
     * The operation succeeded.
     */
    public static final ClockReturn OK = new ClockReturn(0);
    
    /**
     * The operation was scheduled too late.
     */
    public static final ClockReturn EARLY = new ClockReturn(1);
    
    /**
     * The clockID was unscheduled
     */
    public static final ClockReturn UNSCHEDULED = new ClockReturn(2);
    
    /**
     * The ClockID is busy
     */
    public static final ClockReturn BUSY = new ClockReturn(3);
    
    /**
     * A bad time was provided to a function.
     */
    public static final ClockReturn BADTIME = new ClockReturn(4);
    
    /**
     * An error occurred
     */
    public static final ClockReturn ERROR = new ClockReturn(5);
    
    /**
     * Operation is not supported
     */
    public static final ClockReturn UNSUPPORTED = new ClockReturn(6);
    
    /**
     * The ClockID is done waiting
     */
    public static final ClockReturn DONE = new ClockReturn(7);
    
    public ClockReturn(int value) {
        super(value);
    }
}
