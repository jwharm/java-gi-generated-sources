package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SingleSelectionClass extends io.github.jwharm.javagi.ResourceBase {

    public SingleSelectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SingleSelectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkSingleSelectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
