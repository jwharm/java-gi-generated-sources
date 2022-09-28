package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ThreadedSocketServiceClass extends io.github.jwharm.javagi.ResourceBase {

    public ThreadedSocketServiceClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ThreadedSocketServiceClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GThreadedSocketServiceClass.allocate(Interop.getAllocator()).address()));
    }
    
}
