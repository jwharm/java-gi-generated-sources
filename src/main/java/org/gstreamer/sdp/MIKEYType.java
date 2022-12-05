package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different MIKEY data types.
 */
public enum MIKEYType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Invalid type
     */
    INVALID(-1),
    /**
     * Initiator's pre-shared key message
     */
    PSK_INIT(0),
    /**
     * Verification message of a Pre-shared key message
     */
    PSK_VERIFY(1),
    /**
     * Initiator's public-key transport message
     */
    PK_INIT(2),
    /**
     * Verification message of a public-key message
     */
    PK_VERIFY(3),
    /**
     * Initiator's DH exchange message
     */
    DH_INIT(4),
    /**
     * Responder's DH exchange message
     */
    DH_RESP(5),
    /**
     * Error message
     */
    ERROR(6);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYType";
    
    private final int value;
    MIKEYType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MIKEYType of(int value) {
        return switch (value) {
            case -1 -> INVALID;
            case 0 -> PSK_INIT;
            case 1 -> PSK_VERIFY;
            case 2 -> PK_INIT;
            case 3 -> PK_VERIFY;
            case 4 -> DH_INIT;
            case 5 -> DH_RESP;
            case 6 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
