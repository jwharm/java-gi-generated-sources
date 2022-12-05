package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstWebRTC namespace.
 */
public final class GstWebRTC {
    
    static {
        System.loadLibrary("gstwebrtc-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static @NotNull org.gtk.glib.Quark webrtcErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_webrtc_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static @NotNull java.lang.String webrtcSdpTypeToString(@NotNull org.gstreamer.webrtc.WebRTCSDPType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_sdp_type_to_string.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_error_quark = Interop.downcallHandle(
            "gst_webrtc_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_webrtc_sdp_type_to_string = Interop.downcallHandle(
            "gst_webrtc_sdp_type_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
