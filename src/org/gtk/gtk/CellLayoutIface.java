package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CellLayoutIface extends io.github.jwharm.javagi.ResourceBase {

    public CellLayoutIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CellLayoutIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCellLayoutIface.allocate(Interop.getAllocator()).address()));
    }
    
}
