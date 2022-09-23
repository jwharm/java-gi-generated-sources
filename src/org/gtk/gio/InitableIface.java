package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for initializing object such that initialization
 * may fail.
 */
public class InitableIface extends io.github.jwharm.javagi.ResourceBase {

    public InitableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public InitableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GInitableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
