package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ListStoreClass extends io.github.jwharm.javagi.ResourceBase {

    public ListStoreClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ListStoreClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GListStoreClass.allocate(Interop.getAllocator()).address()));
    }
    
}
