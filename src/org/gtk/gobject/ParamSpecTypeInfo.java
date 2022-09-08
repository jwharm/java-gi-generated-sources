package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 * 
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 */
public class ParamSpecTypeInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public ParamSpecTypeInfo(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
