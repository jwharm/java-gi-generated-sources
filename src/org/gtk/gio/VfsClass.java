package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class VfsClass extends io.github.jwharm.javagi.ResourceBase {

    public VfsClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public VfsClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GVfsClass.allocate(Interop.getAllocator()).address()));
    }
    
}
