package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different RTCP packet types.
 */
public enum RTCPType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Invalid type
     */
    INVALID(0),
    
    /**
     * Sender report
     */
    SR(200),
    
    /**
     * Receiver report
     */
    RR(201),
    
    /**
     * Source description
     */
    SDES(202),
    
    /**
     * Goodbye
     */
    BYE(203),
    
    /**
     * Application defined
     */
    APP(204),
    
    /**
     * Transport layer feedback.
     */
    RTPFB(205),
    
    /**
     * Payload-specific feedback.
     */
    PSFB(206),
    
    /**
     * Extended report.
     */
    XR(207);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPType";
    
    private final int value;
    
    /**
     * Create a new RTCPType for the provided value
     * @param numeric value the enum value
     */
    RTCPType(int value) {
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
     * Create a new RTCPType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTCPType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 200 -> SR;
            case 201 -> RR;
            case 202 -> SDES;
            case 203 -> BYE;
            case 204 -> APP;
            case 205 -> RTPFB;
            case 206 -> PSFB;
            case 207 -> XR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
