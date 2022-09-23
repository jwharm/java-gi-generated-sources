package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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
