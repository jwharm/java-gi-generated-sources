package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Base object type for D-Bus objects.
 */
public class DBusObjectIface extends io.github.jwharm.javagi.ResourceBase {

    public DBusObjectIface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusObjectIface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusObjectIface.allocate(Interop.getAllocator()).address()));
    }
    
}
