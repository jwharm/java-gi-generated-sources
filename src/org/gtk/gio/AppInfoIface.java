package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Application Information interface, for operating system portability.
 */
public class AppInfoIface extends io.github.jwharm.javagi.ResourceBase {

    public AppInfoIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AppInfoIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GAppInfoIface.allocate(Interop.getAllocator()).address()));
    }
    
}
