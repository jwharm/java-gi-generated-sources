package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for the GParamSpec type.
 * Normally, GParamSpec classes are filled by
 * g_param_type_register_static().
 */
public class ParamSpecClass extends io.github.jwharm.javagi.ResourceBase {

    public ParamSpecClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ParamSpecClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GParamSpecClass.allocate(Interop.getAllocator()).address()));
    }
    
}
