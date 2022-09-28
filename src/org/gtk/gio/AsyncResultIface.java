package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface definition for {@link AsyncResult}.
 */
public class AsyncResultIface extends io.github.jwharm.javagi.ResourceBase {

    public AsyncResultIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AsyncResultIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GAsyncResultIface.allocate(Interop.getAllocator()).address()));
    }
    
}
