package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NativeVolumeMonitorClass extends io.github.jwharm.javagi.ResourceBase {

    public NativeVolumeMonitorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public NativeVolumeMonitorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GNativeVolumeMonitorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
