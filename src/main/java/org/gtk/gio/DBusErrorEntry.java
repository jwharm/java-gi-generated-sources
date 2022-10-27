package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct used in g_dbus_error_register_error_domain().
 * @version 2.26
 */
public class DBusErrorEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("error_code"),
        Interop.valueLayout.ADDRESS.withName("dbus_error_name")
    ).withName("GDBusErrorEntry");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusErrorEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
