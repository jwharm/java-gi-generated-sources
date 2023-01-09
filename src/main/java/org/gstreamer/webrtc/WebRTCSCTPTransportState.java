package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcsctptransportstate&gt;
 * @version 1.16
 */
public enum WebRTCSCTPTransportState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * new
     */
    NEW(0),
    
    /**
     * connecting
     */
    CONNECTING(1),
    
    /**
     * connected
     */
    CONNECTED(2),
    
    /**
     * closed
     */
    CLOSED(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSCTPTransportState";
    
    private final int value;
    
    /**
     * Create a new WebRTCSCTPTransportState for the provided value
     * @param numeric value the enum value
     */
    WebRTCSCTPTransportState(int value) {
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
     * Create a new WebRTCSCTPTransportState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCSCTPTransportState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> CONNECTING;
            case 2 -> CONNECTED;
            case 3 -> CLOSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
