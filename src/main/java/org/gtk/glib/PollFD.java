package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a file descriptor, which events to poll for, and which events
 * occurred.
 */
public class PollFD extends io.github.jwharm.javagi.ResourceBase {

    public PollFD(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public PollFD() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GPollFD.allocate(Interop.getAllocator()).address()));
    }
    
}
