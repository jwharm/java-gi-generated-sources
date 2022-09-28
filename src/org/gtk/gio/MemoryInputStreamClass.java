package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class MemoryInputStreamClass extends io.github.jwharm.javagi.ResourceBase {

    public MemoryInputStreamClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MemoryInputStreamClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GMemoryInputStreamClass.allocate(Interop.getAllocator()).address()));
    }
    
}
