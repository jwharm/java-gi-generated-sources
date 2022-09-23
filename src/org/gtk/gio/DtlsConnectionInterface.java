package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Virtual method table for a {@link DtlsConnection} implementation.
 */
public class DtlsConnectionInterface extends io.github.jwharm.javagi.ResourceBase {

    public DtlsConnectionInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DtlsConnectionInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDtlsConnectionInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
