package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all interface types.
 */
public class TypeInterface extends io.github.jwharm.javagi.interop.ResourceBase {

    public TypeInterface(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the corresponding #GTypeInterface structure of the parent type
     * of the instance type to which @g_iface belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     */
    public TypeInterface peekParent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_interface_peek_parent(HANDLE());
        return new TypeInterface(References.get(RESULT, false));
    }
    
}
