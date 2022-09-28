package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link ListModel}.
 */
public class ListModelInterface extends io.github.jwharm.javagi.ResourceBase {

    public ListModelInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ListModelInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GListModelInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
