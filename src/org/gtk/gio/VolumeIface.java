package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for implementing operations for mountable volumes.
 */
public class VolumeIface extends io.github.jwharm.javagi.ResourceBase {

    public VolumeIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public VolumeIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GVolumeIface.allocate(Interop.getAllocator()).address()));
    }
    
}
