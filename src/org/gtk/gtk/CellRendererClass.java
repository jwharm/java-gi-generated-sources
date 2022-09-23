package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CellRendererClass extends io.github.jwharm.javagi.ResourceBase {

    public CellRendererClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CellRendererClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCellRendererClass.allocate(Interop.getAllocator()).address()));
    }
    
}
