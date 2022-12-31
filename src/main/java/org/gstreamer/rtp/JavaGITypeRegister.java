package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(RTPBaseAudioPayload.getType(), RTPBaseAudioPayload.fromAddress);
        Interop.typeRegister.put(RTPBaseDepayload.getType(), RTPBaseDepayload.fromAddress);
        Interop.typeRegister.put(RTPBasePayload.getType(), RTPBasePayload.fromAddress);
        Interop.typeRegister.put(RTPHeaderExtension.getType(), RTPHeaderExtension.fromAddress);
    }
}
