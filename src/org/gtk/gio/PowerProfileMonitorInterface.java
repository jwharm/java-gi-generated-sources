package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The virtual function table for {@link PowerProfileMonitor}.
 */
public class PowerProfileMonitorInterface extends io.github.jwharm.javagi.ResourceBase {

    public PowerProfileMonitorInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public PowerProfileMonitorInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GPowerProfileMonitorInterface.allocate(Interop.getAllocator()).address()));
    }
    
}
