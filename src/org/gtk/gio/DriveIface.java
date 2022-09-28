package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
