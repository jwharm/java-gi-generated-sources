package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class BoxClass extends io.github.jwharm.javagi.ResourceBase {

    public BoxClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public BoxClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkBoxClass.allocate(Interop.getAllocator()).address()));
    }
    
}
