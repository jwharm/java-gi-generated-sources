package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class LayoutChildClass extends io.github.jwharm.javagi.ResourceBase {

    public LayoutChildClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LayoutChildClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkLayoutChildClass.allocate(Interop.getAllocator()).address()));
    }
    
}
