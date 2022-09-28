package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for the {@link TlsConnection} type.
 */
public class TlsConnectionClass extends io.github.jwharm.javagi.ResourceBase {

    public TlsConnectionClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsConnectionClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsConnectionClass.allocate(Interop.getAllocator()).address()));
    }
    
}
