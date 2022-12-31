package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(NonstreamAudioDecoder.getType(), NonstreamAudioDecoder.fromAddress);
        Interop.typeRegister.put(PlanarAudioAdapter.getType(), PlanarAudioAdapter.fromAddress);
    }
}
