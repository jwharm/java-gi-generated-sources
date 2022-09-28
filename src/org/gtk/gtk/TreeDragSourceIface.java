package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TreeDragSourceIface extends io.github.jwharm.javagi.ResourceBase {

    public TreeDragSourceIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeDragSourceIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeDragSourceIface.allocate(Interop.getAllocator()).address()));
    }
    
}
