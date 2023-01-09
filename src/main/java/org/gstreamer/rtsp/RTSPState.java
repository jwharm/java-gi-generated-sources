package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different RTSP states.
 */
public enum RTSPState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * invalid state
     */
    INVALID(0),
    
    /**
     * initializing
     */
    INIT(1),
    
    /**
     * ready for operation
     */
    READY(2),
    
    /**
     * seeking in progress
     */
    SEEKING(3),
    
    /**
     * playing
     */
    PLAYING(4),
    
    /**
     * recording
     */
    RECORDING(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPState";
    
    private final int value;
    
    /**
     * Create a new RTSPState for the provided value
     * @param numeric value the enum value
     */
    RTSPState(int value) {
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
     * Create a new RTSPState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPState of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> INIT;
            case 2 -> READY;
            case 3 -> SEEKING;
            case 4 -> PLAYING;
            case 5 -> RECORDING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
