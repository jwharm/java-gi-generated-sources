package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different MIKEY Payload types.
 */
public enum MIKEYPayloadType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Last payload
     */
    LAST(0),
    
    /**
     * Key data transport payload
     */
    KEMAC(1),
    
    /**
     * Envelope data payload
     */
    PKE(2),
    
    /**
     * DH data payload
     */
    DH(3),
    
    /**
     * Signature payload
     */
    SIGN(4),
    
    /**
     * Timestamp payload
     */
    T(5),
    
    /**
     * ID payload
     */
    ID(6),
    
    /**
     * Certificate Payload
     */
    CERT(7),
    
    /**
     * Cert hash payload
     */
    CHASH(8),
    
    /**
     * Verification message payload
     */
    V(9),
    
    /**
     * Security Policy payload
     */
    SP(10),
    
    /**
     * RAND payload
     */
    RAND(11),
    
    /**
     * Error payload
     */
    ERR(12),
    
    /**
     * Key data sub-payload
     */
    KEY_DATA(20),
    
    /**
     * General Extension Payload
     */
    GEN_EXT(21);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadType";
    
    private final int value;
    
    /**
     * Create a new MIKEYPayloadType for the provided value
     * @param numeric value the enum value
     */
    MIKEYPayloadType(int value) {
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
     * Create a new MIKEYPayloadType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYPayloadType of(int value) {
        return switch (value) {
            case 0 -> LAST;
            case 1 -> KEMAC;
            case 2 -> PKE;
            case 3 -> DH;
            case 4 -> SIGN;
            case 5 -> T;
            case 6 -> ID;
            case 7 -> CERT;
            case 8 -> CHASH;
            case 9 -> V;
            case 10 -> SP;
            case 11 -> RAND;
            case 12 -> ERR;
            case 20 -> KEY_DATA;
            case 21 -> GEN_EXT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
