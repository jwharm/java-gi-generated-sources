package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GSourceCallbackFuncs} struct contains
 * functions for managing callback objects.
 */
public class SourceCallbackFuncs extends io.github.jwharm.javagi.ResourceBase {

    public SourceCallbackFuncs(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SourceCallbackFuncs() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSourceCallbackFuncs.allocate(Interop.getAllocator()).address()));
    }
    
}
