package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for {@link TlsFileDatabase} implementations.
 */
public class TlsFileDatabaseInterface extends io.github.jwharm.javagi.ResourceBase {

    public TlsFileDatabaseInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsFileDatabaseInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsFileDatabaseInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
