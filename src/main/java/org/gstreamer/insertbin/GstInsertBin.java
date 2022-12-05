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
        System.loadLibrary("gstinsertbin-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static void cbInsertBinCallback(MemoryAddress insertbin, MemoryAddress element, int success, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBinCallback) Interop.signalRegistry.get(HASH);
            HANDLER.onInsertBinCallback(new org.gstreamer.insertbin.InsertBin(insertbin, Ownership.NONE), new org.gstreamer.gst.Element(element, Ownership.NONE), success != 0);
        }
    }
}
