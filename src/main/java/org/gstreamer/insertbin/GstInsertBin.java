package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstInsertBin namespace.
 */
public final class GstInsertBin {
    
    static {
        LibLoad.loadLibrary("gstinsertbin-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (InsertBin.isAvailable()) Interop.register(InsertBin.getType(), InsertBin.fromAddress);
    }
}
