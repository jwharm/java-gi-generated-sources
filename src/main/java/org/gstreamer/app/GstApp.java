package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstApp namespace.
 */
public final class GstApp {
    
    static {
        LibLoad.loadLibrary("gstapp-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    private static void registerTypes() {
        if (AppSink.isAvailable()) Interop.register(AppSink.getType(), AppSink.fromAddress);
        if (AppSrc.isAvailable()) Interop.register(AppSrc.getType(), AppSrc.fromAddress);
    }
}
