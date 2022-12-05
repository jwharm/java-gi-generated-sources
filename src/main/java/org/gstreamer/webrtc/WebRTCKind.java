package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * https://w3c.github.io/mediacapture-main/{@code dom}-mediastreamtrack-kind
 * @version 1.20
 */
public enum WebRTCKind implements io.github.jwharm.javagi.Enumeration {
    /**
     * Kind has not yet been set
     */
    UNKNOWN(0),
    /**
     * Kind is audio
     */
    AUDIO(1),
    /**
     * Kind is audio
     */
    VIDEO(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCKind";
    
    private final int value;
    WebRTCKind(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCKind of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> AUDIO;
            case 2 -> VIDEO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
