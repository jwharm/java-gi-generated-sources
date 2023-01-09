package org.gstreamer.gl.x11;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstGLX11 namespace.
 */
public final class GstGLX11 {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    private static void registerTypes() {
        if (GLDisplayX11.isAvailable()) Interop.register(GLDisplayX11.getType(), GLDisplayX11.fromAddress);
    }
}
