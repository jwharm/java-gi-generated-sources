package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class UnixConnectionClass extends io.github.jwharm.javagi.ResourceBase {

    public UnixConnectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public UnixConnectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GUnixConnectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
