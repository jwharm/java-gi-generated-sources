package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AV1Decoder.getType(), AV1Decoder.fromAddress);
        Interop.typeRegister.put(H264Decoder.getType(), H264Decoder.fromAddress);
        Interop.typeRegister.put(H265Decoder.getType(), H265Decoder.fromAddress);
        Interop.typeRegister.put(Mpeg2Decoder.getType(), Mpeg2Decoder.fromAddress);
        Interop.typeRegister.put(Vp8Decoder.getType(), Vp8Decoder.fromAddress);
        Interop.typeRegister.put(Vp9Decoder.getType(), Vp9Decoder.fromAddress);
    }
}
