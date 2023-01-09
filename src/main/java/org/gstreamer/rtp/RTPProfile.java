package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The transfer profile to use.
 * @version 1.6
 */
public enum RTPProfile implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * invalid profile
     */
    UNKNOWN(0),
    
    /**
     * the Audio/Visual profile (RFC 3551)
     */
    AVP(1),
    
    /**
     * the secure Audio/Visual profile (RFC 3711)
     */
    SAVP(2),
    
    /**
     * the Audio/Visual profile with feedback (RFC 4585)
     */
    AVPF(3),
    
    /**
     * the secure Audio/Visual profile with feedback (RFC 5124)
     */
    SAVPF(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPProfile";
    
    private final int value;
    
    /**
     * Create a new RTPProfile for the provided value
     * @param numeric value the enum value
     */
    RTPProfile(int value) {
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
     * Create a new RTPProfile for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTPProfile of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> AVP;
            case 2 -> SAVP;
            case 3 -> AVPF;
            case 4 -> SAVPF;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
