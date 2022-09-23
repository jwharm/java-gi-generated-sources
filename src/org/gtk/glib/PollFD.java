package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 */
public class PollFD extends io.github.jwharm.javagi.ResourceBase {

    public PollFD(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PollFD() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GPollFD.allocate(Interop.getAllocator()).address()));
    }
    
}
