package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for describing TLS-related types.
 */
public class TlsBackendInterface extends io.github.jwharm.javagi.ResourceBase {

    public TlsBackendInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsBackendInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsBackendInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
