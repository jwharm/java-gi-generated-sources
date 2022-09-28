package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CustomSorterClass extends io.github.jwharm.javagi.ResourceBase {

    public CustomSorterClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CustomSorterClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCustomSorterClass.allocate(Interop.getAllocator()).address()));
    }
    
}
