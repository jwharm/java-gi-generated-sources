package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(ARGBControlBinding.getType(), ARGBControlBinding.fromAddress);
        Interop.typeRegister.put(DirectControlBinding.getType(), DirectControlBinding.fromAddress);
        Interop.typeRegister.put(InterpolationControlSource.getType(), InterpolationControlSource.fromAddress);
        Interop.typeRegister.put(LFOControlSource.getType(), LFOControlSource.fromAddress);
        Interop.typeRegister.put(ProxyControlBinding.getType(), ProxyControlBinding.fromAddress);
        Interop.typeRegister.put(TimedValueControlSource.getType(), TimedValueControlSource.fromAddress);
        Interop.typeRegister.put(TriggerControlSource.getType(), TriggerControlSource.fromAddress);
    }
}
