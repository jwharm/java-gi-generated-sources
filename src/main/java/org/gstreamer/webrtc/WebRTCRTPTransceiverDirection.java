package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCRTPTransceiverDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * none
     */
    NONE(0),
    
    /**
     * inactive
     */
    INACTIVE(1),
    
    /**
     * sendonly
     */
    SENDONLY(2),
    
    /**
     * recvonly
     */
    RECVONLY(3),
    
    /**
     * sendrecv
     */
    SENDRECV(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPTransceiverDirection";
    
    private final int value;
    
    /**
     * Create a new WebRTCRTPTransceiverDirection for the provided value
     * @param numeric value the enum value
     */
    WebRTCRTPTransceiverDirection(int value) {
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
     * Create a new WebRTCRTPTransceiverDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCRTPTransceiverDirection of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> INACTIVE;
            case 2 -> SENDONLY;
            case 3 -> RECVONLY;
            case 4 -> SENDRECV;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
