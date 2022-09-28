package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A type corresponding to the appropriate struct type for the stat()
 * system call, depending on the platform and/or compiler being used.
 * <p>
 * See g_stat() for more information.
 */
public class StatBuf extends io.github.jwharm.javagi.ResourceBase {

    public StatBuf(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public StatBuf() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GStatBuf.allocate(Interop.getAllocator()).address()));
    }
    
}
