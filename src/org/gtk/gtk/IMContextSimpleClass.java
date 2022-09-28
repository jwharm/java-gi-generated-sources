package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class IMContextSimpleClass extends io.github.jwharm.javagi.ResourceBase {

    public IMContextSimpleClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public IMContextSimpleClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkIMContextSimpleClass.allocate(Interop.getAllocator()).address()));
    }
    
}
