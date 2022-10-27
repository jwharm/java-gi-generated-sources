package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GIconIface is used to implement GIcon types for various
 * different systems. See {@link ThemedIcon} and {@link LoadableIcon} for
 * examples of how to implement this interface.
 */
public class IconIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("hash"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("to_tokens"),
        Interop.valueLayout.ADDRESS.withName("from_tokens"),
        Interop.valueLayout.ADDRESS.withName("serialize")
    ).withName("GIconIface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public IconIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
