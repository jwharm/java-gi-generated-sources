package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ApplicationWindowClass extends io.github.jwharm.javagi.ResourceBase {

    public ApplicationWindowClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ApplicationWindowClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkApplicationWindowClass.allocate(Interop.getAllocator()).address()));
    }
    
}
