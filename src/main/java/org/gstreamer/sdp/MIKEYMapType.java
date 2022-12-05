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
    MIKEYMapType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYMapType of(int value) {
        return switch (value) {
            case 0 -> MIKEY_MAP_TYPE_SRTP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
