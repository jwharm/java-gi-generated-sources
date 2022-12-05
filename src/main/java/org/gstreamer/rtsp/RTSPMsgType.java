package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a message.
 */
public enum RTSPMsgType implements io.github.jwharm.javagi.Enumeration {
    /**
     * invalid message type
     */
    INVALID(0),
    /**
     * RTSP request message
     */
    REQUEST(1),
    /**
     * RTSP response message
     */
    RESPONSE(2),
    /**
     * HTTP request message.
     */
    HTTP_REQUEST(3),
    /**
     * HTTP response message.
     */
    HTTP_RESPONSE(4),
    /**
     * data message
     */
    DATA(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPMsgType";
    
    private final int value;
    RTSPMsgType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTSPMsgType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> REQUEST;
            case 2 -> RESPONSE;
            case 3 -> HTTP_REQUEST;
            case 4 -> HTTP_RESPONSE;
            case 5 -> DATA;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
