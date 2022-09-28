package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TcpConnectionClass extends io.github.jwharm.javagi.ResourceBase {

    public TcpConnectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TcpConnectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTcpConnectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
