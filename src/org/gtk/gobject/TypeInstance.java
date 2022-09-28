package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all type instances.
 */
public class TypeInstance extends io.github.jwharm.javagi.ResourceBase {

    public TypeInstance(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TypeInstance() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTypeInstance.allocate(Interop.getAllocator()).address()));
    }
    
    public java.lang.foreign.MemoryAddress getPrivate(org.gtk.gobject.Type privateType) {
        var RESULT = gtk_h.g_type_instance_get_private(handle(), privateType.getValue());
        return RESULT;
    }
    
}
