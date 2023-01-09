package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcdatachannelstate&gt;
 * @version 1.16
 */
public enum WebRTCDataChannelState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * new
     */
    NEW(0),
    
    /**
     * connection
     */
    CONNECTING(1),
    
    /**
     * open
     */
    OPEN(2),
    
    /**
     * closing
     */
    CLOSING(3),
    
    /**
     * closed
     */
    CLOSED(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDataChannelState";
    
    private final int value;
    
    /**
     * Create a new WebRTCDataChannelState for the provided value
     * @param numeric value the enum value
     */
    WebRTCDataChannelState(int value) {
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
     * Create a new WebRTCDataChannelState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCDataChannelState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> CONNECTING;
            case 2 -> OPEN;
            case 3 -> CLOSING;
            case 4 -> CLOSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
