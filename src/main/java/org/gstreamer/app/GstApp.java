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
        System.loadLibrary("gstapp-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
}
