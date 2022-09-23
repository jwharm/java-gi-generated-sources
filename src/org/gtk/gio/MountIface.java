package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for implementing operations for mounts.
 */
public class MountIface extends io.github.jwharm.javagi.ResourceBase {

    public MountIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public MountIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GMountIface.allocate(Interop.getAllocator()).address()));
    }
    
}
