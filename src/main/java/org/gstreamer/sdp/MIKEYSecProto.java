package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the security protocol
 */
public enum MIKEYSecProto implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * SRTP
     */
    MIKEY_SEC_PROTO_SRTP(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYSecProto";
    
    private final int value;
    
    /**
     * Create a new MIKEYSecProto for the provided value
     * @param numeric value the enum value
     */
    MIKEYSecProto(int value) {
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
     * Create a new MIKEYSecProto for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYSecProto of(int value) {
        return switch (value) {
            case 0 -> MIKEY_SEC_PROTO_SRTP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
