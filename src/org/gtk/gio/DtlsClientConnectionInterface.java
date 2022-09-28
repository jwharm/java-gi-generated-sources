package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * vtable for a {@link DtlsClientConnection} implementation.
 */
public class DtlsClientConnectionInterface extends io.github.jwharm.javagi.ResourceBase {

    public DtlsClientConnectionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DtlsClientConnectionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDtlsClientConnectionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
