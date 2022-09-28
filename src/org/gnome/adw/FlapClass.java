package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FlapClass extends io.github.jwharm.javagi.ResourceBase {

    public FlapClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FlapClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwFlapClass.allocate(Interop.getAllocator()).address()));
    }
    
}
