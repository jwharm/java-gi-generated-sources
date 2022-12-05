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
        System.loadLibrary("gstcontroller-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Reset the controlled value cache.
     * @param self the {@link TimedValueControlSource}
     */
    public static void timedValueControlInvalidateCache(@NotNull org.gstreamer.controller.TimedValueControlSource self) {
        java.util.Objects.requireNonNull(self, "Parameter 'self' must not be null");
        try {
            DowncallHandles.gst_timed_value_control_invalidate_cache.invokeExact(
                    self.handle());
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
}
