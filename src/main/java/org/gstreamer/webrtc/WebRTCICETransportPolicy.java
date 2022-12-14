package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See https://tools.ietf.org/html/draft-ietf-rtcweb-jsep-24{@code section}-4.1.1
 * for more information.
 * @version 1.16
 */
public enum WebRTCICETransportPolicy implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * all
     */
    ALL(0),
    
    /**
     * relay
     */
    RELAY(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICETransportPolicy";
    
    private final int value;
    
    /**
     * Create a new WebRTCICETransportPolicy for the provided value
     * @param numeric value the enum value
     */
    WebRTCICETransportPolicy(int value) {
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
     * Create a new WebRTCICETransportPolicy for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCICETransportPolicy of(int value) {
        return switch (value) {
            case 0 -> ALL;
            case 1 -> RELAY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
