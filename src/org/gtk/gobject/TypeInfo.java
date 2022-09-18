package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a type&<code>#39</code> s class and
 * its instances.
 * 
 * The initialized structure is passed to the g_type_register_static() function
 * (or is copied into the provided {@link org.gtk.gobject.TypeInfo} structure in the
 * g_type_plugin_complete_type_info()). The type system will perform a deep
 * copy of this structure, so its memory does not need to be persistent
 * across invocation of g_type_register_static().
 */
public class TypeInfo extends io.github.jwharm.javagi.ResourceBase {

    public TypeInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
