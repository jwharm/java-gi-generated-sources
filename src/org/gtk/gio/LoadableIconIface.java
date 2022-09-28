package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for icons that can be loaded as a stream.
 */
public class LoadableIconIface extends io.github.jwharm.javagi.ResourceBase {

    public LoadableIconIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LoadableIconIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GLoadableIconIface.allocate(Interop.getAllocator()).address()));
    }
    
}
