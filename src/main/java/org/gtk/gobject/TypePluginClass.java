package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link TypePlugin} interface is used by the type system in order to handle
 * the lifecycle of dynamically loaded types.
 */
public class TypePluginClass extends io.github.jwharm.javagi.ResourceBase {

    public TypePluginClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TypePluginClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTypePluginClass.allocate(Interop.getAllocator()).address()));
    }
    
}
