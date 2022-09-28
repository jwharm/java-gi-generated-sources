package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class InetAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public InetAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public InetAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GInetAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
