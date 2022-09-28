package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CellEditableIface extends io.github.jwharm.javagi.ResourceBase {

    public CellEditableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CellEditableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCellEditableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
