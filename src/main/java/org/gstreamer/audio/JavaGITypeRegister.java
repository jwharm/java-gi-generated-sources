package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AudioAggregator.getType(), AudioAggregator.fromAddress);
        Interop.typeRegister.put(AudioAggregatorConvertPad.getType(), AudioAggregatorConvertPad.fromAddress);
        Interop.typeRegister.put(AudioAggregatorPad.getType(), AudioAggregatorPad.fromAddress);
        Interop.typeRegister.put(AudioBaseSink.getType(), AudioBaseSink.fromAddress);
        Interop.typeRegister.put(AudioBaseSrc.getType(), AudioBaseSrc.fromAddress);
        Interop.typeRegister.put(AudioCdSrc.getType(), AudioCdSrc.fromAddress);
        Interop.typeRegister.put(AudioClock.getType(), AudioClock.fromAddress);
        Interop.typeRegister.put(AudioDecoder.getType(), AudioDecoder.fromAddress);
        Interop.typeRegister.put(AudioEncoder.getType(), AudioEncoder.fromAddress);
        Interop.typeRegister.put(AudioFilter.getType(), AudioFilter.fromAddress);
        Interop.typeRegister.put(AudioRingBuffer.getType(), AudioRingBuffer.fromAddress);
        Interop.typeRegister.put(AudioSink.getType(), AudioSink.fromAddress);
        Interop.typeRegister.put(AudioSrc.getType(), AudioSrc.fromAddress);
        Interop.typeRegister.put(StreamVolume.getType(), StreamVolume.fromAddress);
    }
}
