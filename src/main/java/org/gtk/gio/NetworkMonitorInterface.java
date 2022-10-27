package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link NetworkMonitor}.
 * @version 2.32
 */
public class NetworkMonitorInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("network_changed"),
        Interop.valueLayout.ADDRESS.withName("can_reach"),
        Interop.valueLayout.ADDRESS.withName("can_reach_async"),
        Interop.valueLayout.ADDRESS.withName("can_reach_finish")
    ).withName("GNetworkMonitorInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public NetworkMonitorInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
