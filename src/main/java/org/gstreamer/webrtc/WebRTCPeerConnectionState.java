package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code dom}-rtcpeerconnectionstate&gt;
 */
public enum WebRTCPeerConnectionState implements io.github.jwharm.javagi.Enumeration {
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
     * disconnected
     */
    DISCONNECTED(3),
    /**
     * failed
     */
    FAILED(4),
    /**
     * closed
     */
    CLOSED(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCPeerConnectionState";
    
    private final int value;
    WebRTCPeerConnectionState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCPeerConnectionState of(int value) {
        return switch (value) {
            case 0 -> NEW;
            case 1 -> CONNECTING;
            case 2 -> CONNECTED;
            case 3 -> DISCONNECTED;
            case 4 -> FAILED;
            case 5 -> CLOSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
