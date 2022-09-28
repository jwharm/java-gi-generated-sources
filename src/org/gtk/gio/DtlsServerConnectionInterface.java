package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * vtable for a {@link DtlsServerConnection} implementation.
 */
public class DtlsServerConnectionInterface extends io.github.jwharm.javagi.ResourceBase {

    public DtlsServerConnectionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DtlsServerConnectionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDtlsServerConnectionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
