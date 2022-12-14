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
        LibLoad.loadLibrary("gstwebrtc-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

public static org.gtk.glib.Quark webrtcErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_webrtc_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static java.lang.String webrtcSdpTypeToString(org.gstreamer.webrtc.WebRTCSDPType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_sdp_type_to_string.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
    
    private static void registerTypes() {
        if (WebRTCDTLSTransport.isAvailable()) Interop.register(WebRTCDTLSTransport.getType(), WebRTCDTLSTransport.fromAddress);
        if (WebRTCDataChannel.isAvailable()) Interop.register(WebRTCDataChannel.getType(), WebRTCDataChannel.fromAddress);
        if (WebRTCICETransport.isAvailable()) Interop.register(WebRTCICETransport.getType(), WebRTCICETransport.fromAddress);
        if (WebRTCRTPReceiver.isAvailable()) Interop.register(WebRTCRTPReceiver.getType(), WebRTCRTPReceiver.fromAddress);
        if (WebRTCRTPSender.isAvailable()) Interop.register(WebRTCRTPSender.getType(), WebRTCRTPSender.fromAddress);
        if (WebRTCRTPTransceiver.isAvailable()) Interop.register(WebRTCRTPTransceiver.getType(), WebRTCRTPTransceiver.fromAddress);
        if (WebRTCSCTPTransport.isAvailable()) Interop.register(WebRTCSCTPTransport.getType(), WebRTCSCTPTransport.fromAddress);
    }
}
