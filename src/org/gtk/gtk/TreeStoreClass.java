package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TreeStoreClass extends io.github.jwharm.javagi.ResourceBase {

    public TreeStoreClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeStoreClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeStoreClass.allocate(Interop.getAllocator()).address()));
    }
    
}
