package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * vtable for a {@link TlsServerConnection} implementation.
 */
public class TlsServerConnectionInterface extends io.github.jwharm.javagi.ResourceBase {

    public TlsServerConnectionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsServerConnectionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsServerConnectionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
