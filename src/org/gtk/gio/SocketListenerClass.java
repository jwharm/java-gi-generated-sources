package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link SocketListener}.
 */
public class SocketListenerClass extends io.github.jwharm.javagi.ResourceBase {

    public SocketListenerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketListenerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketListenerClass.allocate(Interop.getAllocator()).address()));
    }
    
}
