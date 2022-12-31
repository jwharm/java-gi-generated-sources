package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Vulkan namespace.
 */
public final class Vulkan {
    
    static {
        System.loadLibrary("vulkan");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
}
