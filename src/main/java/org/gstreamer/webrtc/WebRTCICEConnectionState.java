package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtciceconnectionstate&gt;
 */
public enum WebRTCICEConnectionState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * new
     */
    NEW(0),
    
    /**
     * checking
     */
    CHECKING(1),
    
    /**
     * connected
     */
    CONNECTED(2),
    
    /**
     * completed
     */
    COMPLETED(3),
    
    /**
     * failed
     */
    FAILED(4),
    
    /**
     * disconnected
     */
    DISCONNECTED(5),
    
    /**
     * closed
     */
    CLOSED(6);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICEConnectionState";
    
    private final int value;
    
    /**
     * Create a new WebRTCICEConnectionState for the provided value
     * @param numeric value the enum value
     */
    WebRTCICEConnectionState(int value) {
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
     * Create a new WebRTCICEConnectionState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCICEConnectionState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> CHECKING;
            case 2 -> CONNECTED;
            case 3 -> COMPLETED;
            case 4 -> FAILED;
            case 5 -> DISCONNECTED;
            case 6 -> CLOSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
