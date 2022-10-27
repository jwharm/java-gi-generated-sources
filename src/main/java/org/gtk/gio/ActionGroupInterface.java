package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ActionGroup}.
 * @version 2.28
 */
public class ActionGroupInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("has_action"),
        Interop.valueLayout.ADDRESS.withName("list_actions"),
        Interop.valueLayout.ADDRESS.withName("get_action_enabled"),
        Interop.valueLayout.ADDRESS.withName("get_action_parameter_type"),
        Interop.valueLayout.ADDRESS.withName("get_action_state_type"),
        Interop.valueLayout.ADDRESS.withName("get_action_state_hint"),
        Interop.valueLayout.ADDRESS.withName("get_action_state"),
        Interop.valueLayout.ADDRESS.withName("change_action_state"),
        Interop.valueLayout.ADDRESS.withName("activate_action"),
        Interop.valueLayout.ADDRESS.withName("action_added"),
        Interop.valueLayout.ADDRESS.withName("action_removed"),
        Interop.valueLayout.ADDRESS.withName("action_enabled_changed"),
        Interop.valueLayout.ADDRESS.withName("action_state_changed"),
        Interop.valueLayout.ADDRESS.withName("query_action")
    ).withName("GActionGroupInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ActionGroupInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
