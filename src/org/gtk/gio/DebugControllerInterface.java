package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link DebugController}.
 */
public class DebugControllerInterface extends io.github.jwharm.javagi.ResourceBase {

    public DebugControllerInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DebugControllerInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDebugControllerInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
