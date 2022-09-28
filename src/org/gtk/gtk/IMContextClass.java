package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class IMContextClass extends io.github.jwharm.javagi.ResourceBase {

    public IMContextClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public IMContextClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkIMContextClass.allocate(Interop.getAllocator()).address()));
    }
    
}
