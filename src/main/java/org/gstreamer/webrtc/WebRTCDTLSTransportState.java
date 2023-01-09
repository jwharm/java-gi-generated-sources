package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCDTLSTransportState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * new
     */
    NEW(0),
    
    /**
     * closed
     */
    CLOSED(1),
    
    /**
     * failed
     */
    FAILED(2),
    
    /**
     * connecting
     */
    CONNECTING(3),
    
    /**
     * connected
     */
    CONNECTED(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDTLSTransportState";
    
    private final int value;
    
    /**
     * Create a new WebRTCDTLSTransportState for the provided value
     * @param numeric value the enum value
     */
    WebRTCDTLSTransportState(int value) {
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
     * Create a new WebRTCDTLSTransportState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCDTLSTransportState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> CLOSED;
            case 2 -> FAILED;
            case 3 -> CONNECTING;
            case 4 -> CONNECTED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
