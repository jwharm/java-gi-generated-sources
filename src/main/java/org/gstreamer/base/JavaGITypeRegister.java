package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Adapter.getType(), Adapter.fromAddress);
        Interop.typeRegister.put(Aggregator.getType(), Aggregator.fromAddress);
        Interop.typeRegister.put(AggregatorPad.getType(), AggregatorPad.fromAddress);
        Interop.typeRegister.put(BaseParse.getType(), BaseParse.fromAddress);
        Interop.typeRegister.put(BaseSink.getType(), BaseSink.fromAddress);
        Interop.typeRegister.put(BaseSrc.getType(), BaseSrc.fromAddress);
        Interop.typeRegister.put(BaseTransform.getType(), BaseTransform.fromAddress);
        Interop.typeRegister.put(CollectPads.getType(), CollectPads.fromAddress);
        Interop.typeRegister.put(DataQueue.getType(), DataQueue.fromAddress);
        Interop.typeRegister.put(PushSrc.getType(), PushSrc.fromAddress);
    }
}
