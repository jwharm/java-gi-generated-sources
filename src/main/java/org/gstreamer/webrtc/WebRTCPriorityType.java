package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcprioritytype&gt;
 * @version 1.16
 */
public enum WebRTCPriorityType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * very-low
     */
    VERY_LOW(1),
    
    /**
     * low
     */
    LOW(2),
    
    /**
     * medium
     */
    MEDIUM(3),
    
    /**
     * high
     */
    HIGH(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCPriorityType";
    
    private final int value;
    
    /**
     * Create a new WebRTCPriorityType for the provided value
     * @param numeric value the enum value
     */
    WebRTCPriorityType(int value) {
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
     * Create a new WebRTCPriorityType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCPriorityType of(int value) {
        return switch (value) {
            case 1 -> VERY_LOW;
            case 2 -> LOW;
            case 3 -> MEDIUM;
            case 4 -> HIGH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
