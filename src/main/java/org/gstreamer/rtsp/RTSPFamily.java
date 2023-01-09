package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible network families.
 */
public enum RTSPFamily implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * unknown network family
     */
    NONE(0),
    
    /**
     * internet
     */
    INET(1),
    
    /**
     * internet V6
     */
    INET6(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPFamily";
    
    private final int value;
    
    /**
     * Create a new RTSPFamily for the provided value
     * @param numeric value the enum value
     */
    RTSPFamily(int value) {
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
     * Create a new RTSPFamily for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPFamily of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> INET;
            case 2 -> INET6;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
