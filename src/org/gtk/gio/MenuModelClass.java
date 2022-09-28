package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class MenuModelClass extends io.github.jwharm.javagi.ResourceBase {

    public MenuModelClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MenuModelClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GMenuModelClass.allocate(Interop.getAllocator()).address()));
    }
    
}
