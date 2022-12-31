package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;http://w3c.github.io/webrtc-pc/{@code rtcsdptype}&gt;
 */
public enum WebRTCSDPType implements io.github.jwharm.javagi.Enumeration {
    /**
     * offer
     */
    OFFER(1),
    /**
     * pranswer
     */
    PRANSWER(2),
    /**
     * answer
     */
    ANSWER(3),
    /**
     * rollback
     */
    ROLLBACK(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSDPType";
    
    private final int value;
    WebRTCSDPType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCSDPType of(int value) {
        return switch (value) {
            case 1 -> OFFER;
            case 2 -> PRANSWER;
            case 3 -> ANSWER;
            case 4 -> ROLLBACK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static java.lang.String toString(org.gstreamer.webrtc.WebRTCSDPType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_sdp_type_to_string.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_sdp_type_to_string = Interop.downcallHandle(
            "gst_webrtc_sdp_type_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
