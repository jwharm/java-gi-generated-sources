package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all type instances.
 */
public class TypeInstance extends io.github.jwharm.javagi.interop.ResourceBase {

    public TypeInstance(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    public jdk.incubator.foreign.MemoryAddress getPrivate(Type privateType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_instance_get_private(HANDLE(), privateType.getValue());
        return RESULT;
    }
    
}
