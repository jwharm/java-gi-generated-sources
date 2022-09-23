package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for creating {@link Drive} implementations.
 */
public class DriveIface extends io.github.jwharm.javagi.ResourceBase {

    public DriveIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DriveIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDriveIface.allocate(Interop.getAllocator()).address()));
    }
    
}
