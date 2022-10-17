package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 * <p>
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 */
public class ParamSpecTypeInfo extends io.github.jwharm.javagi.ResourceBase {

    public ParamSpecTypeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
