package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class IOStreamClass extends io.github.jwharm.javagi.ResourceBase {

    public IOStreamClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public IOStreamClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GIOStreamClass.allocate(Interop.getAllocator()).address()));
    }
    
}
