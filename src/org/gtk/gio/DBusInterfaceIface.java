package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Base type for D-Bus interfaces.
 */
public class DBusInterfaceIface extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusInterfaceIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusInterfaceIface.allocate(Interop.getAllocator()).address()));
    }
    
}
