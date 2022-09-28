package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface for asynchronous initializing object such that
 * initialization may fail.
 */
public class AsyncInitableIface extends io.github.jwharm.javagi.ResourceBase {

    public AsyncInitableIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public AsyncInitableIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GAsyncInitableIface.allocate(Interop.getAllocator()).address()));
    }
    
}
