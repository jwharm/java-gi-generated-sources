package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Transcoder.getType(), Transcoder.fromAddress);
        Interop.typeRegister.put(TranscoderSignalAdapter.getType(), TranscoderSignalAdapter.fromAddress);
    }
}
