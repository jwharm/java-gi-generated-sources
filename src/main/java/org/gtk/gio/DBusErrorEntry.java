package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Struct used in g_dbus_error_register_error_domain().
 */
public class DBusErrorEntry extends io.github.jwharm.javagi.ResourceBase {

    public DBusErrorEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public DBusErrorEntry() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GDBusErrorEntry.allocate(Interop.getAllocator()).address()));
    }
    
}
