package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual table for {@code GtkSorter}.
 */
public class SorterClass extends io.github.jwharm.javagi.ResourceBase {

    public SorterClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SorterClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkSorterClass.allocate(Interop.getAllocator()).address()));
    }
    
}
