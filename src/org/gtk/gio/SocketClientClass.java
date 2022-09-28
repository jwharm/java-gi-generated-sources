package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SocketClientClass extends io.github.jwharm.javagi.ResourceBase {

    public SocketClientClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketClientClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketClientClass.allocate(Interop.getAllocator()).address()));
    }
    
}
