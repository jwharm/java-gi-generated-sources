package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcsignalingstate&gt;
 */
public enum WebRTCSignalingState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * stable
     */
    STABLE(0),
    
    /**
     * closed
     */
    CLOSED(1),
    
    /**
     * have-local-offer
     */
    HAVE_LOCAL_OFFER(2),
    
    /**
     * have-remote-offer
     */
    HAVE_REMOTE_OFFER(3),
    
    /**
     * have-local-pranswer
     */
    HAVE_LOCAL_PRANSWER(4),
    
    /**
     * have-remote-pranswer
     */
    HAVE_REMOTE_PRANSWER(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSignalingState";
    
    private final int value;
    
    /**
     * Create a new WebRTCSignalingState for the provided value
     * @param numeric value the enum value
     */
    WebRTCSignalingState(int value) {
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
     * Create a new WebRTCSignalingState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCSignalingState of(int value) {
        return switch (value) {
            case 0 -> STABLE;
            case 1 -> CLOSED;
            case 2 -> HAVE_LOCAL_OFFER;
            case 3 -> HAVE_REMOTE_OFFER;
            case 4 -> HAVE_LOCAL_PRANSWER;
            case 5 -> HAVE_REMOTE_PRANSWER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
