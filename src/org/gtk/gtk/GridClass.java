package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class GridClass extends io.github.jwharm.javagi.ResourceBase {

    public GridClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GridClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkGridClass.allocate(Interop.getAllocator()).address()));
    }
    
}
