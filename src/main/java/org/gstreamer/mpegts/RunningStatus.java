package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Running status of a service.
 * <p>
 * Corresponds to table 6 of ETSI EN 300 468 (v1.13.0)
 */
public enum RunningStatus implements io.github.jwharm.javagi.Enumeration {
    
    UNDEFINED(0),
    
    NOT_RUNNING(1),
    
    STARTS_IN_FEW_SECONDS(2),
    
    PAUSING(3),
    
    RUNNING(4),
    
    OFF_AIR(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsRunningStatus";
    
    private final int value;
    
    /**
     * Create a new RunningStatus for the provided value
     * @param numeric value the enum value
     */
    RunningStatus(int value) {
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
     * Create a new RunningStatus for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RunningStatus of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 1 -> NOT_RUNNING;
            case 2 -> STARTS_IN_FEW_SECONDS;
            case 3 -> PAUSING;
            case 4 -> RUNNING;
            case 5 -> OFF_AIR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
