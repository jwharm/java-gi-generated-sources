package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class MultiSorterClass extends io.github.jwharm.javagi.ResourceBase {

    public MultiSorterClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MultiSorterClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkMultiSorterClass.allocate(Interop.getAllocator()).address()));
    }
    
}
