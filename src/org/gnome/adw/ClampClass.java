package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ClampClass extends io.github.jwharm.javagi.ResourceBase {

    public ClampClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ClampClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwClampClass.allocate(Interop.getAllocator()).address()));
    }
    
}
