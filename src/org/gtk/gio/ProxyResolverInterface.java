package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link ProxyResolver}.
 */
public class ProxyResolverInterface extends io.github.jwharm.javagi.ResourceBase {

    public ProxyResolverInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ProxyResolverInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GProxyResolverInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
