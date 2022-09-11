package org.gtk.gsk;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static void cbParseErrorFunc(MemoryAddress start, MemoryAddress end, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ParseErrorFunc) Interop.signalRegistry.get(hash);
        handler.onParseErrorFunc(new ParseLocation(References.get(start, false)), new ParseLocation(References.get(end, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
}
