package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcicegatheringstate&gt;
 */
public enum WebRTCICEGatheringState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * new
     */
    NEW(0),
    
    /**
     * gathering
     */
    GATHERING(1),
    
    /**
     * complete
     */
    COMPLETE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICEGatheringState";
    
    private final int value;
    
    /**
     * Create a new WebRTCICEGatheringState for the provided value
     * @param numeric value the enum value
     */
    WebRTCICEGatheringState(int value) {
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
     * Create a new WebRTCICEGatheringState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCICEGatheringState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> GATHERING;
            case 2 -> COMPLETE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
