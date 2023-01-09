package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the method of uniquely mapping Crypto Sessions to the security
 * protocol sessions.
 */
public enum MIKEYMapType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * SRTP
     */
    MIKEY_MAP_TYPE_SRTP(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYMapType";
    
    private final int value;
    
    /**
     * Create a new MIKEYMapType for the provided value
     * @param numeric value the enum value
     */
    MIKEYMapType(int value) {
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
     * Create a new MIKEYMapType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYMapType of(int value) {
        return switch (value) {
            case 0 -> MIKEY_MAP_TYPE_SRTP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
