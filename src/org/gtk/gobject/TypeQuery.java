package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure holding information for a specific type.
 * <p>
 * See also: g_type_query()
 */
public class TypeQuery extends io.github.jwharm.javagi.ResourceBase {

    public TypeQuery(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TypeQuery() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTypeQuery.allocate(Interop.getAllocator()).address()));
    }
    
}
