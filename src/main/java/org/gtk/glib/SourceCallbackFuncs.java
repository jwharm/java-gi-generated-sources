package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GSourceCallbackFuncs} struct contains
 * functions for managing callback objects.
 */
public class SourceCallbackFuncs extends io.github.jwharm.javagi.ResourceBase {

    public SourceCallbackFuncs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public SourceCallbackFuncs() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GSourceCallbackFuncs.allocate(Interop.getAllocator()).address()));
    }
    
}
