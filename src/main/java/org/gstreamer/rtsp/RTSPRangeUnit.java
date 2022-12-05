package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different possible time range units.
 */
public enum RTSPRangeUnit implements io.github.jwharm.javagi.Enumeration {
    /**
     * SMPTE timecode
     */
    SMPTE(0),
    /**
     * 29.97 frames per second
     */
    SMPTE_30_DROP(1),
    /**
     * 25 frames per second
     */
    SMPTE_25(2),
    /**
     * Normal play time
     */
    NPT(3),
    /**
     * Absolute time expressed as ISO 8601 timestamps
     */
    CLOCK(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPRangeUnit";
    
    private final int value;
    RTSPRangeUnit(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTSPRangeUnit of(int value) {
        return switch (value) {
            case 0 -> SMPTE;
            case 1 -> SMPTE_30_DROP;
            case 2 -> SMPTE_25;
            case 3 -> NPT;
            case 4 -> CLOCK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
