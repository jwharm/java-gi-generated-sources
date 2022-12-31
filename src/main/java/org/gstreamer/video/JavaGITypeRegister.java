package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(ColorBalanceChannel.getType(), ColorBalanceChannel.fromAddress);
        Interop.typeRegister.put(VideoAggregator.getType(), VideoAggregator.fromAddress);
        Interop.typeRegister.put(VideoAggregatorConvertPad.getType(), VideoAggregatorConvertPad.fromAddress);
        Interop.typeRegister.put(VideoAggregatorPad.getType(), VideoAggregatorPad.fromAddress);
        Interop.typeRegister.put(VideoAggregatorParallelConvertPad.getType(), VideoAggregatorParallelConvertPad.fromAddress);
        Interop.typeRegister.put(VideoBufferPool.getType(), VideoBufferPool.fromAddress);
        Interop.typeRegister.put(VideoDecoder.getType(), VideoDecoder.fromAddress);
        Interop.typeRegister.put(VideoEncoder.getType(), VideoEncoder.fromAddress);
        Interop.typeRegister.put(VideoFilter.getType(), VideoFilter.fromAddress);
        Interop.typeRegister.put(VideoMultiviewFlagsSet.getType(), VideoMultiviewFlagsSet.fromAddress);
        Interop.typeRegister.put(VideoSink.getType(), VideoSink.fromAddress);
        Interop.typeRegister.put(ColorBalance.getType(), ColorBalance.fromAddress);
        Interop.typeRegister.put(Navigation.getType(), Navigation.fromAddress);
        Interop.typeRegister.put(VideoDirection.getType(), VideoDirection.fromAddress);
        Interop.typeRegister.put(VideoOrientation.getType(), VideoOrientation.fromAddress);
        Interop.typeRegister.put(VideoOverlay.getType(), VideoOverlay.fromAddress);
    }
}
