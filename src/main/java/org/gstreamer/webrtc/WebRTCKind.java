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
    
    /**
     * Create a new WebRTCKind for the provided value
     * @param numeric value the enum value
     */
    WebRTCKind(int value) {
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
     * Create a new WebRTCKind for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCKind of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> AUDIO;
            case 2 -> VIDEO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
