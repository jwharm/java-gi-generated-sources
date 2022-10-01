package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Associates a string with a bit flag.
 * Used in g_parse_debug_string().
 */
public class DebugKey extends io.github.jwharm.javagi.ResourceBase {

    public DebugKey(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DebugKey() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDebugKey.allocate(Interop.getAllocator()).address()));
    }
    
}
