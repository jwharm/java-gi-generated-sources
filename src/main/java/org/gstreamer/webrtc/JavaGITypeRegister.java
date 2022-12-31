package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(WebRTCDTLSTransport.getType(), WebRTCDTLSTransport.fromAddress);
        Interop.typeRegister.put(WebRTCDataChannel.getType(), WebRTCDataChannel.fromAddress);
        Interop.typeRegister.put(WebRTCICETransport.getType(), WebRTCICETransport.fromAddress);
        Interop.typeRegister.put(WebRTCRTPReceiver.getType(), WebRTCRTPReceiver.fromAddress);
        Interop.typeRegister.put(WebRTCRTPSender.getType(), WebRTCRTPSender.fromAddress);
        Interop.typeRegister.put(WebRTCRTPTransceiver.getType(), WebRTCRTPTransceiver.fromAddress);
        Interop.typeRegister.put(WebRTCSCTPTransport.getType(), WebRTCSCTPTransport.fromAddress);
    }
}
