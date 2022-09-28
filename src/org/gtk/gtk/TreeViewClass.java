package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TreeViewClass extends io.github.jwharm.javagi.ResourceBase {

    public TreeViewClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeViewClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeViewClass.allocate(Interop.getAllocator()).address()));
    }
    
}
