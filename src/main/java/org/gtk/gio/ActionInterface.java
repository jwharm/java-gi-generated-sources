package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link Action}.
 * @version 2.28
 */
public class ActionInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_parameter_type"),
        Interop.valueLayout.ADDRESS.withName("get_state_type"),
        Interop.valueLayout.ADDRESS.withName("get_state_hint"),
        Interop.valueLayout.ADDRESS.withName("get_enabled"),
        Interop.valueLayout.ADDRESS.withName("get_state"),
        Interop.valueLayout.ADDRESS.withName("change_state"),
        Interop.valueLayout.ADDRESS.withName("activate")
    ).withName("GActionInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ActionInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
