package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Cairo namespace.
 */
public final class Cairo {
    
    static {
        LibLoad.loadLibrary("cairo");
        LibLoad.loadLibrary("cairo-gobject");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    private static void registerTypes() {
    }
}
