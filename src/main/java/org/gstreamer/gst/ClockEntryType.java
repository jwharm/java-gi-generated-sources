package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the clock entry
 */
public enum ClockEntryType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a single shot timeout
     */
    SINGLE(0),
    
    /**
     * a periodic timeout request
     */
    PERIODIC(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstClockEntryType";
    
    private final int value;
    
    /**
     * Create a new ClockEntryType for the provided value
     * @param numeric value the enum value
     */
    ClockEntryType(int value) {
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
     * Create a new ClockEntryType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ClockEntryType of(int value) {
        return switch (value) {
            case 0 -> SINGLE;
            case 1 -> PERIODIC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
