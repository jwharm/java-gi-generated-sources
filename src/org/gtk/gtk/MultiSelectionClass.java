package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class MultiSelectionClass extends io.github.jwharm.javagi.ResourceBase {

    public MultiSelectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MultiSelectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkMultiSelectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
