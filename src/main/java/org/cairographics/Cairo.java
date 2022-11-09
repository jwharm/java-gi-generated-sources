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
        System.loadLibrary("cairo");
        System.loadLibrary("cairo-gobject");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
}
