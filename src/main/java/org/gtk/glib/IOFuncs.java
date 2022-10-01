package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A table of functions used to handle different types of {@link IOChannel}
 * in a generic way.
 */
public class IOFuncs extends io.github.jwharm.javagi.ResourceBase {

    public IOFuncs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public IOFuncs() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GIOFuncs.allocate(Interop.getAllocator()).address()));
    }
    
}
