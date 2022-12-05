package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Types of RTCP Extended Reports, those are defined in RFC 3611 and other RFCs
 * according to the <a href="https://www.iana.org/assignments/rtcp-xr-block-types/rtcp-xr-block-types.xhtml">IANA registry</a>.
 * @version 1.16
 */
public enum RTCPXRType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Invalid XR Report Block
     */
    INVALID(-1),
    /**
     * Loss RLE Report Block
     */
    LRLE(1),
    /**
     * Duplicate RLE Report Block
     */
    DRLE(2),
    /**
     * Packet Receipt Times Report Block
     */
    PRT(3),
    /**
     * Receiver Reference Time Report Block
     */
    RRT(4),
    /**
     * Delay since the last Receiver Report
     */
    DLRR(5),
    /**
     * Statistics Summary Report Block
     */
    SSUMM(6),
    /**
     * VoIP Metrics Report Block
     */
    VOIP_METRICS(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPXRType";
    
    private final int value;
    RTCPXRType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTCPXRType of(int value) {
        return switch (value) {
            case -1 -> INVALID;
            case 1 -> LRLE;
            case 2 -> DRLE;
            case 3 -> PRT;
            case 4 -> RRT;
            case 5 -> DLRR;
            case 6 -> SSUMM;
            case 7 -> VOIP_METRICS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
