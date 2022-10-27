package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual table for handling subtrees registered with g_dbus_connection_register_subtree().
 * @version 2.26
 */
public class DBusSubtreeVTable extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("enumerate"),
        Interop.valueLayout.ADDRESS.withName("introspect"),
        Interop.valueLayout.ADDRESS.withName("dispatch"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GDBusSubtreeVTable");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusSubtreeVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
