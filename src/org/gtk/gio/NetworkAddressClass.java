package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NetworkAddressClass extends io.github.jwharm.javagi.ResourceBase {

    public NetworkAddressClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NetworkAddressClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GNetworkAddressClass.allocate(Interop.getAllocator()).address()));
    }
    
}
