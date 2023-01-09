package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstController namespace.
 */
public final class GstController {
    
    static {
        LibLoad.loadLibrary("gstcontroller-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

/**
 * Reset the controlled value cache.
 * @param self the {@link TimedValueControlSource}
 */
public static void timedValueControlInvalidateCache(org.gstreamer.controller.TimedValueControlSource self) {
    try {
        DowncallHandles.gst_timed_value_control_invalidate_cache.invokeExact(self.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_timed_value_control_invalidate_cache = Interop.downcallHandle(
        "gst_timed_value_control_invalidate_cache",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (ARGBControlBinding.isAvailable()) Interop.register(ARGBControlBinding.getType(), ARGBControlBinding.fromAddress);
        if (DirectControlBinding.isAvailable()) Interop.register(DirectControlBinding.getType(), DirectControlBinding.fromAddress);
        if (InterpolationControlSource.isAvailable()) Interop.register(InterpolationControlSource.getType(), InterpolationControlSource.fromAddress);
        if (LFOControlSource.isAvailable()) Interop.register(LFOControlSource.getType(), LFOControlSource.fromAddress);
        if (ProxyControlBinding.isAvailable()) Interop.register(ProxyControlBinding.getType(), ProxyControlBinding.fromAddress);
        if (TimedValueControlSource.isAvailable()) Interop.register(TimedValueControlSource.getType(), TimedValueControlSource.fromAddress);
        if (TriggerControlSource.isAvailable()) Interop.register(TriggerControlSource.getType(), TriggerControlSource.fromAddress);
    }
}
