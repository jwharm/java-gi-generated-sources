package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The list of virtual functions for the {@code GtkSymbolicPaintable} interface.
 * No function must be implemented, default implementations exist for each one.
 */
public class SymbolicPaintableInterface extends io.github.jwharm.javagi.ResourceBase {

    public SymbolicPaintableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SymbolicPaintableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkSymbolicPaintableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
