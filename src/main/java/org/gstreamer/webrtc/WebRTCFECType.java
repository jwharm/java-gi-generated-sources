package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCFECType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * none
     */
    NONE(0),
    
    /**
     * ulpfec + red
     */
    ULP_RED(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCFECType";
    
    private final int value;
    
    /**
     * Create a new WebRTCFECType for the provided value
     * @param numeric value the enum value
     */
    WebRTCFECType(int value) {
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
     * Create a new WebRTCFECType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCFECType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ULP_RED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
