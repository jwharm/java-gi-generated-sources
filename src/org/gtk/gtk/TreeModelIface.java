package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TreeModelIface extends io.github.jwharm.javagi.ResourceBase {

    public TreeModelIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeModelIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeModelIface.allocate(Interop.getAllocator()).address()));
    }
    
}
