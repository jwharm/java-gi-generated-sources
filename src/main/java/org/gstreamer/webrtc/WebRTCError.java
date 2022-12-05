package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;https://www.w3.org/TR/webrtc/{@code dom}-rtcerrordetailtype&gt; for more information.
 * @version 1.20
 */
public enum WebRTCError implements io.github.jwharm.javagi.Enumeration {
    /**
     * data-channel-failure
     */
    DATA_CHANNEL_FAILURE(0),
    /**
     * dtls-failure
     */
    DTLS_FAILURE(1),
    /**
     * fingerprint-failure
     */
    FINGERPRINT_FAILURE(2),
    /**
     * sctp-failure
     */
    SCTP_FAILURE(3),
    /**
     * sdp-syntax-error
     */
    SDP_SYNTAX_ERROR(4),
    /**
     * hardware-encoder-not-available
     */
    HARDWARE_ENCODER_NOT_AVAILABLE(5),
    /**
     * encoder-error
     */
    ENCODER_ERROR(6),
    /**
     * invalid-state (part of WebIDL specification)
     */
    INVALID_STATE(7),
    /**
     * GStreamer-specific failure, not matching any other value from the specification
     */
    INTERNAL_FAILURE(8);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCError";
    
    private final int value;
    WebRTCError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCError of(int value) {
        return switch (value) {
            case 0 -> DATA_CHANNEL_FAILURE;
            case 1 -> DTLS_FAILURE;
            case 2 -> FINGERPRINT_FAILURE;
            case 3 -> SCTP_FAILURE;
            case 4 -> SDP_SYNTAX_ERROR;
            case 5 -> HARDWARE_ENCODER_NOT_AVAILABLE;
            case 6 -> ENCODER_ERROR;
            case 7 -> INVALID_STATE;
            case 8 -> INTERNAL_FAILURE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_webrtc_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_error_quark = Interop.downcallHandle(
            "gst_webrtc_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
