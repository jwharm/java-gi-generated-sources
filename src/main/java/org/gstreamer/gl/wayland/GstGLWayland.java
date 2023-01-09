package org.gstreamer.gl.wayland;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstGLWayland namespace.
 */
public final class GstGLWayland {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    private static void registerTypes() {
        if (GLDisplayWayland.isAvailable()) Interop.register(GLDisplayWayland.getType(), GLDisplayWayland.fromAddress);
    }
}
