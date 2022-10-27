package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link DBusObjectManagerClient}.
 * @version 2.30
 */
public class DBusObjectManagerClientClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("interface_proxy_signal"),
        Interop.valueLayout.ADDRESS.withName("interface_proxy_properties_changed"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GDBusObjectManagerClientClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusObjectManagerClientClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
