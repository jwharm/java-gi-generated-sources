package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different types of SDES content.
 */
public enum RTCPSDESType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Invalid SDES entry
     */
    INVALID(-1),
    
    /**
     * End of SDES list
     */
    END(0),
    
    /**
     * Canonical name
     */
    CNAME(1),
    
    /**
     * User name
     */
    NAME(2),
    
    /**
     * User's electronic mail address
     */
    EMAIL(3),
    
    /**
     * User's phone number
     */
    PHONE(4),
    
    /**
     * Geographic user location
     */
    LOC(5),
    
    /**
     * Name of application or tool
     */
    TOOL(6),
    
    /**
     * Notice about the source
     */
    NOTE(7),
    
    /**
     * Private extensions
     */
    PRIV(8),
    
    /**
     * H.323 callable address
     */
    H323_CADDR(9),
    
    /**
     * Application Specific Identifier (RFC6776)
     */
    APSI(10),
    
    /**
     * Reporting Group Identifier (RFC8861)
     */
    RGRP(11),
    
    /**
     * RtpStreamId SDES item (RFC8852).
     */
    RTP_STREAM_ID(12),
    
    /**
     * RepairedRtpStreamId SDES item (RFC8852).
     */
    REPAIRED_RTP_STREAM_ID(13),
    
    /**
     * CLUE CaptId (RFC8849)
     */
    CCID(14),
    
    /**
     * MID SDES item (RFC8843).
     */
    MID(15);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPSDESType";
    
    private final int value;
    
    /**
     * Create a new RTCPSDESType for the provided value
     * @param numeric value the enum value
     */
    RTCPSDESType(int value) {
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
     * Create a new RTCPSDESType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTCPSDESType of(int value) {
        return switch (value) {
            case -1 -> INVALID;
            case 0 -> END;
            case 1 -> CNAME;
            case 2 -> NAME;
            case 3 -> EMAIL;
            case 4 -> PHONE;
            case 5 -> LOC;
            case 6 -> TOOL;
            case 7 -> NOTE;
            case 8 -> PRIV;
            case 9 -> H323_CADDR;
            case 10 -> APSI;
            case 11 -> RGRP;
            case 12 -> RTP_STREAM_ID;
            case 13 -> REPAIRED_RTP_STREAM_ID;
            case 14 -> CCID;
            case 15 -> MID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
