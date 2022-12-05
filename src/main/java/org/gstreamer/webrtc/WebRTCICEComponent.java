package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCICEComponent implements io.github.jwharm.javagi.Enumeration {
    /**
     * RTP component
     */
    RTP(0),
    /**
     * RTCP component
     */
    RTCP(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICEComponent";
    
    private final int value;
    WebRTCICEComponent(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCICEComponent of(int value) {
        return switch (value) {
            case 0 -> RTP;
            case 1 -> RTCP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
