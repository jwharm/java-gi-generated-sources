package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FixedClass extends io.github.jwharm.javagi.ResourceBase {

    public FixedClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FixedClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkFixedClass.allocate(Interop.getAllocator()).address()));
    }
    
}
