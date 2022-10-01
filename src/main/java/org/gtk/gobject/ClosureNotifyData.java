package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ClosureNotifyData extends io.github.jwharm.javagi.ResourceBase {

    public ClosureNotifyData(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ClosureNotifyData() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GClosureNotifyData.allocate(Interop.getAllocator()).address()));
    }
    
}
