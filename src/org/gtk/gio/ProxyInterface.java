package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for handling proxy connection and payload.
 */
public class ProxyInterface extends io.github.jwharm.javagi.ResourceBase {

    public ProxyInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ProxyInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GProxyInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
