package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TreeSortableIface extends io.github.jwharm.javagi.ResourceBase {

    public TreeSortableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeSortableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeSortableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
