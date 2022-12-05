package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Disambiguates a given time in two ways.
 * <p>
 * First, specifies if the given time is in universal or local time.
 * <p>
 * Second, if the time is in local time, specifies if it is local
 * standard time or local daylight time.  This is important for the case
 * where the same local time occurs twice (during daylight savings time
 * transitions, for example).
 */
public enum TimeType implements io.github.jwharm.javagi.Enumeration {
    /**
     * the time is in local standard time
     */
    STANDARD(0),
    /**
     * the time is in local daylight time
     */
    DAYLIGHT(1),
    /**
     * the time is in UTC
     */
    UNIVERSAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GTimeType";
    
    private final int value;
    TimeType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TimeType of(int value) {
        return switch (value) {
            case 0 -> STANDARD;
            case 1 -> DAYLIGHT;
            case 2 -> UNIVERSAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
