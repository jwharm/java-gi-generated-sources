package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class UnixFDListClass extends io.github.jwharm.javagi.ResourceBase {

    public UnixFDListClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public UnixFDListClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GUnixFDListClass.allocate(Interop.getAllocator()).address()));
    }
    
}
