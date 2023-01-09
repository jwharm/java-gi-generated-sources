package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This policy specifies the parameters for SRTP and SRTCP
 */
public enum MIKEYSecSRTP implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Encryption algorithm
     */
    ENC_ALG(0),
    
    /**
     * Session Encr. key length
     */
    ENC_KEY_LEN(1),
    
    /**
     * Authentication algorithm
     */
    AUTH_ALG(2),
    
    /**
     * Session Auth. key length
     */
    AUTH_KEY_LEN(3),
    
    /**
     * Session Salt key length
     */
    SALT_KEY_LEN(4),
    
    /**
     * SRTP Pseudo Random Function
     */
    PRF(5),
    
    /**
     * Key derivation rate
     */
    KEY_DERIV_RATE(6),
    
    /**
     * SRTP encryption off/on, 0 if off, 1 if on
     */
    SRTP_ENC(7),
    
    /**
     * SRTCP encryption off/on, 0 if off, 1 if on
     */
    SRTCP_ENC(8),
    
    /**
     * sender's FEC order
     */
    FEC_ORDER(9),
    
    /**
     * SRTP authentication off/on, 0 if off, 1 if on
     */
    SRTP_AUTH(10),
    
    /**
     * Authentication tag length
     */
    AUTH_TAG_LEN(11),
    
    /**
     * SRTP prefix length
     */
    SRTP_PREFIX_LEN(12),
    
    /**
     * AEAD authentication tag length (Since: 1.16)
     */
    AEAD_AUTH_TAG_LEN(20);
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYSecSRTP";
    
    private final int value;
    
    /**
     * Create a new MIKEYSecSRTP for the provided value
     * @param numeric value the enum value
     */
    MIKEYSecSRTP(int value) {
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
     * Create a new MIKEYSecSRTP for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MIKEYSecSRTP of(int value) {
        return switch (value) {
            case 0 -> ENC_ALG;
            case 1 -> ENC_KEY_LEN;
            case 2 -> AUTH_ALG;
            case 3 -> AUTH_KEY_LEN;
            case 4 -> SALT_KEY_LEN;
            case 5 -> PRF;
            case 6 -> KEY_DERIV_RATE;
            case 7 -> SRTP_ENC;
            case 8 -> SRTCP_ENC;
            case 9 -> FEC_ORDER;
            case 10 -> SRTP_AUTH;
            case 11 -> AUTH_TAG_LEN;
            case 12 -> SRTP_PREFIX_LEN;
            case 20 -> AEAD_AUTH_TAG_LEN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
