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
    
    private static final java.lang.String C_TYPE_NAME = "GActionGroupInterface";
    
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
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ActionGroupInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionGroupInterface newInstance = new ActionGroupInterface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ActionGroupInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
