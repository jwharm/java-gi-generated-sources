package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCDTLSSetup implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * none
     */
    NONE(0),
    
    /**
     * actpass
     */
    ACTPASS(1),
    
    /**
     * sendonly
     */
    ACTIVE(2),
    
    /**
     * recvonly
     */
    PASSIVE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDTLSSetup";
    
    private final int value;
    
    /**
     * Create a new WebRTCDTLSSetup for the provided value
     * @param numeric value the enum value
     */
    WebRTCDTLSSetup(int value) {
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
     * Create a new WebRTCDTLSSetup for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCDTLSSetup of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ACTPASS;
            case 2 -> ACTIVE;
            case 3 -> PASSIVE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
