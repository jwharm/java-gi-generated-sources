package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Authentication methods, ordered by strength
 */
public enum RTSPAuthMethod implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no authentication
     */
    NONE(0),
    
    /**
     * basic authentication
     */
    BASIC(1),
    
    /**
     * digest authentication
     */
    DIGEST(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPAuthMethod";
    
    private final int value;
    
    /**
     * Create a new RTSPAuthMethod for the provided value
     * @param numeric value the enum value
     */
    RTSPAuthMethod(int value) {
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
     * Create a new RTSPAuthMethod for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPAuthMethod of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> BASIC;
            case 2 -> DIGEST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
