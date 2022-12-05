package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the authentication algorithm used
 */
public enum MIKEYMacAlg implements io.github.jwharm.javagi.Enumeration {
    /**
     * no authentication
     */
    NULL(0),
    /**
     * HMAC-SHA-1-160
     */
    HMAC_SHA_1_160(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYMacAlg";
    
    private final int value;
    MIKEYMacAlg(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYMacAlg of(int value) {
        return switch (value) {
            case 0 -> NULL;
            case 1 -> HMAC_SHA_1_160;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
