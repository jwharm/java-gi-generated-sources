package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GParameter struct is an auxiliary structure used
 * to hand parameter name/value pairs to g_object_newv().
 */
public class Parameter extends io.github.jwharm.javagi.ResourceBase {

    public Parameter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Parameter() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GParameter.allocate(Interop.getAllocator()).address()));
    }
    
}
