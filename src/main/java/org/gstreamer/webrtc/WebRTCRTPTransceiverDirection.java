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
    WebRTCRTPTransceiverDirection(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
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
