package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NetworkServiceClass extends io.github.jwharm.javagi.ResourceBase {

    public NetworkServiceClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NetworkServiceClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GNetworkServiceClass.allocate(Interop.getAllocator()).address()));
    }
    
}
