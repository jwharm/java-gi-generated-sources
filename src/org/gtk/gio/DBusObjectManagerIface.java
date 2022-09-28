package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Base type for D-Bus object managers.
 */
public class DBusObjectManagerIface extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectManagerIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectManagerIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectManagerIface.allocate(Interop.getAllocator()).address()));
    }
    
}
