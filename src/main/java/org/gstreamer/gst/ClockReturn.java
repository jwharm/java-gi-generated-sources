package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The return value of a clock operation.
 */
public enum ClockReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The operation succeeded.
     */
    OK(0),
    
    /**
     * The operation was scheduled too late.
     */
    EARLY(1),
    
    /**
     * The clockID was unscheduled
     */
    UNSCHEDULED(2),
    
    /**
     * The ClockID is busy
     */
    BUSY(3),
    
    /**
     * A bad time was provided to a function.
     */
    BADTIME(4),
    
    /**
     * An error occurred
     */
    ERROR(5),
    
    /**
     * Operation is not supported
     */
    UNSUPPORTED(6),
    
    /**
     * The ClockID is done waiting
     */
    DONE(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstClockReturn";
    
    private final int value;
    
    /**
     * Create a new ClockReturn for the provided value
     * @param numeric value the enum value
     */
    ClockReturn(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new ClockReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ClockReturn of(int value) {
        return switch (value) {
            case 0 -> OK;
            case 1 -> EARLY;
            case 2 -> UNSCHEDULED;
            case 3 -> BUSY;
            case 4 -> BADTIME;
            case 5 -> ERROR;
            case 6 -> UNSUPPORTED;
            case 7 -> DONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
