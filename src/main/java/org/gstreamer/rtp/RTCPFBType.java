package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different types of feedback messages.
 */
public enum RTCPFBType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Invalid type
     */
    FB_TYPE_INVALID(0),
    /**
     * Generic NACK
     */
    RTPFB_TYPE_NACK(1),
    /**
     * Temporary Maximum Media Stream Bit Rate Request
     */
    RTPFB_TYPE_TMMBR(3),
    /**
     * Temporary Maximum Media Stream Bit Rate
     *    Notification
     */
    RTPFB_TYPE_TMMBN(4),
    /**
     * Request an SR packet for early
     *    synchronization
     */
    RTPFB_TYPE_RTCP_SR_REQ(5),
    RTPFB_TYPE_TWCC(15),
    /**
     * Slice Loss Indication
     */
    PSFB_TYPE_SLI(2),
    /**
     * Temporal-Spatial Trade-off Notification
     */
    PSFB_TYPE_TSTN(6),
    /**
     * Video Back Channel Message
     */
    PSFB_TYPE_VBCN(7);
    public static final RTCPFBType PSFB_TYPE_PLI = RTPFB_TYPE_NACK;
    public static final RTCPFBType PSFB_TYPE_RPSI = RTPFB_TYPE_TMMBR;
    public static final RTCPFBType PSFB_TYPE_AFB = RTPFB_TYPE_TWCC;
    public static final RTCPFBType PSFB_TYPE_FIR = RTPFB_TYPE_TMMBN;
    public static final RTCPFBType PSFB_TYPE_TSTR = RTPFB_TYPE_RTCP_SR_REQ;
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPFBType";
    
    private final int value;
    RTCPFBType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTCPFBType of(int value) {
        return switch (value) {
            case 0 -> FB_TYPE_INVALID;
            case 1 -> RTPFB_TYPE_NACK;
            case 3 -> RTPFB_TYPE_TMMBR;
            case 4 -> RTPFB_TYPE_TMMBN;
            case 5 -> RTPFB_TYPE_RTCP_SR_REQ;
            case 15 -> RTPFB_TYPE_TWCC;
            case 2 -> PSFB_TYPE_SLI;
            case 6 -> PSFB_TYPE_TSTN;
            case 7 -> PSFB_TYPE_VBCN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
