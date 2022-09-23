package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class GridLayoutClass extends io.github.jwharm.javagi.ResourceBase {

    public GridLayoutClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GridLayoutClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkGridLayoutClass.allocate(Interop.getAllocator()).address()));
    }
    
}
