package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CustomLayoutClass extends io.github.jwharm.javagi.ResourceBase {

    public CustomLayoutClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CustomLayoutClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCustomLayoutClass.allocate(Interop.getAllocator()).address()));
    }
    
}
