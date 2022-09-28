package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The interface vtable for {@code GtkActionable}.
 */
public class ActionableInterface extends io.github.jwharm.javagi.ResourceBase {

    public ActionableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ActionableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkActionableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
