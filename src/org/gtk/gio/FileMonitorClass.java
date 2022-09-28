package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class FileMonitorClass extends io.github.jwharm.javagi.ResourceBase {

    public FileMonitorClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public FileMonitorClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GFileMonitorClass.allocate(Interop.getAllocator()).address()));
    }
    
}
