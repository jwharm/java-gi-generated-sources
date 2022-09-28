package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class VolumeMonitorClass extends io.github.jwharm.javagi.ResourceBase {

    public VolumeMonitorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public VolumeMonitorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GVolumeMonitorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
