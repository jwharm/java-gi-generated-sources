package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface vtable for {@code GtkActionable}.
 */
public class ActionableInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_action_name"),
        Interop.valueLayout.ADDRESS.withName("set_action_name"),
        Interop.valueLayout.ADDRESS.withName("get_action_target_value"),
        Interop.valueLayout.ADDRESS.withName("set_action_target_value")
    ).withName("GtkActionableInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ActionableInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
