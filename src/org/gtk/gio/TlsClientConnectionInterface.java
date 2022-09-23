package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * vtable for a {@link TlsClientConnection} implementation.
 */
public class TlsClientConnectionInterface extends io.github.jwharm.javagi.ResourceBase {

    public TlsClientConnectionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsClientConnectionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsClientConnectionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
