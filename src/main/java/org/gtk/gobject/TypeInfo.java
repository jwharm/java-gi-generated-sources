package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a type's class and
 * its instances.
 * <p>
 * The initialized structure is passed to the g_type_register_static() function
 * (or is copied into the provided {@link TypeInfo} structure in the
 * g_type_plugin_complete_type_info()). The type system will perform a deep
 * copy of this structure, so its memory does not need to be persistent
 * across invocation of g_type_register_static().
 */
public class TypeInfo extends io.github.jwharm.javagi.ResourceBase {

    public TypeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public TypeInfo() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GTypeInfo.allocate(Interop.getAllocator()).address()));
    }
    
}
