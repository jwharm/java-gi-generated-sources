package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for the GInitiallyUnowned type.
 */
public class InitiallyUnownedClass extends io.github.jwharm.javagi.ResourceBase {

    public InitiallyUnownedClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public InitiallyUnownedClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GInitiallyUnownedClass.allocate(Interop.getAllocator()).address()));
    }
    
}
