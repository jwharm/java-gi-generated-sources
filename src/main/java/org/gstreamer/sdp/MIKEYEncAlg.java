package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The encryption algorithm used to encrypt the Encr data field
 */
public enum MIKEYEncAlg implements io.github.jwharm.javagi.Enumeration {
    /**
     * no encryption
     */
    NULL(0),
    /**
     * AES-CM using a 128-bit key
     */
    AES_CM_128(1),
    /**
     * AES Key Wrap using a 128-bit key
     */
    AES_KW_128(2),
    /**
     * AES-GCM using a 128-bit key (Since: 1.16)
     */
    AES_GCM_128(6);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYEncAlg";
    
    private final int value;
    MIKEYEncAlg(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYEncAlg of(int value) {
        return switch (value) {
            case 0 -> NULL;
            case 1 -> AES_CM_128;
            case 2 -> AES_KW_128;
            case 6 -> AES_GCM_128;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
