package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SocketAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public SocketAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
