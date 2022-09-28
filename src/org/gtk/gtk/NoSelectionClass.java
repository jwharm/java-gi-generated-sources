package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NoSelectionClass extends io.github.jwharm.javagi.ResourceBase {

    public NoSelectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NoSelectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkNoSelectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
