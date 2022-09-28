package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class OrientableIface extends io.github.jwharm.javagi.ResourceBase {

    public OrientableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OrientableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkOrientableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
