package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class StyleContextClass extends io.github.jwharm.javagi.ResourceBase {

    public StyleContextClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public StyleContextClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkStyleContextClass.allocate(Interop.getAllocator()).address()));
    }
    
}
