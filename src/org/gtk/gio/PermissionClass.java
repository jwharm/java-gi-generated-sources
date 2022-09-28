package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class PermissionClass extends io.github.jwharm.javagi.ResourceBase {

    public PermissionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PermissionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GPermissionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
