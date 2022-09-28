package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class UnixFDMessageClass extends io.github.jwharm.javagi.ResourceBase {

    public UnixFDMessageClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public UnixFDMessageClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GUnixFDMessageClass.allocate(Interop.getAllocator()).address()));
    }
    
}
