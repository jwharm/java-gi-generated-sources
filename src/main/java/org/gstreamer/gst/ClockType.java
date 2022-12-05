package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different kind of clocks.
 */
public enum ClockType implements io.github.jwharm.javagi.Enumeration {
    /**
     * time since Epoch
     */
    REALTIME(0),
    /**
     * monotonic time since some unspecified starting
     *                            point
     */
    MONOTONIC(1),
    /**
     * some other time source is used (Since: 1.0.5)
     */
    OTHER(2),
    /**
     * time since Epoch, but using International Atomic Time
     *                      as reference (Since: 1.18)
     */
    TAI(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstClockType";
    
    private final int value;
    ClockType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ClockType of(int value) {
        return switch (value) {
            case 0 -> REALTIME;
            case 1 -> MONOTONIC;
            case 2 -> OTHER;
            case 3 -> TAI;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
