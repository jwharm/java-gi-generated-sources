package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Class structure for {@link SocketControlMessage}.
 */
public class SocketControlMessageClass extends io.github.jwharm.javagi.ResourceBase {

    public SocketControlMessageClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SocketControlMessageClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GSocketControlMessageClass.allocate(Interop.getAllocator()).address()));
    }
    
}
