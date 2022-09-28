package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 */
public class DBusSubtreeVTable extends io.github.jwharm.javagi.ResourceBase {

    public DBusSubtreeVTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusSubtreeVTable() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusSubtreeVTable.allocate(Interop.getAllocator()).address()));
    }
    
}
