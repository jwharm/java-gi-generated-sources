package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum H264DpbBumpMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * No latency requirement for DBP bumping.
     */
    NORMAL_LATENCY(0),
    /**
     * Low-latency requirement for DBP bumping.
     */
    LOW_LATENCY(1),
    /**
     * Very low-latency requirement for DBP bumping.
     */
    VERY_LOW_LATENCY(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstH264DpbBumpMode";
    
    private final int value;
    H264DpbBumpMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static H264DpbBumpMode of(int value) {
        return switch (value) {
            case 0 -> NORMAL_LATENCY;
            case 1 -> LOW_LATENCY;
            case 2 -> VERY_LOW_LATENCY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
