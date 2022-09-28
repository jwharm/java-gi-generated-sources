package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class BinLayoutClass extends io.github.jwharm.javagi.ResourceBase {

    public BinLayoutClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BinLayoutClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBinLayoutClass.allocate(Interop.getAllocator()).address()));
    }
    
}
