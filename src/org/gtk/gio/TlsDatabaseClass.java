package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The class for {@link TlsDatabase}. Derived classes should implement the various
 * virtual methods. _async and _finish methods have a default
 * implementation that runs the corresponding sync method in a thread.
 */
public class TlsDatabaseClass extends io.github.jwharm.javagi.ResourceBase {

    public TlsDatabaseClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TlsDatabaseClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTlsDatabaseClass.allocate(Interop.getAllocator()).address()));
    }
    
}
