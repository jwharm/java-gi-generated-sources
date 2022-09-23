package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * In order to implement dynamic loading of types based on {@link TypeModule},
 * the {@code load} and {@code unload} functions in {@link TypeModuleClass} must be implemented.
 */
public class TypeModuleClass extends io.github.jwharm.javagi.ResourceBase {

    public TypeModuleClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TypeModuleClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTypeModuleClass.allocate(Interop.getAllocator()).address()));
    }
    
}
