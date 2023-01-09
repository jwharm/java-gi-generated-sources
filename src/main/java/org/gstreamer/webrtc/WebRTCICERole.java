package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCICERole implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * controlled
     */
    CONTROLLED(0),
    
    /**
     * controlling
     */
    CONTROLLING(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICERole";
    
    private final int value;
    
    /**
     * Create a new WebRTCICERole for the provided value
     * @param numeric value the enum value
     */
    WebRTCICERole(int value) {
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
     * Create a new WebRTCICERole for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCICERole of(int value) {
        return switch (value) {
            case 0 -> CONTROLLED;
            case 1 -> CONTROLLING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
