package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for returning a {@link SocketAddressEnumerator}
 * and {@link ProxyAddressEnumerator}
 */
public class SocketConnectableIface extends io.github.jwharm.javagi.ResourceBase {

    public SocketConnectableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketConnectableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketConnectableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
