package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkBuildableIface} interface contains methods that are
 * necessary to allow {@code GtkBuilder} to construct an object from
 * a {@code GtkBuilder} UI definition.
 */
public class BuildableIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("set_id"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("add_child"),
        Interop.valueLayout.ADDRESS.withName("set_buildable_property"),
        Interop.valueLayout.ADDRESS.withName("construct_child"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_start"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_end"),
        Interop.valueLayout.ADDRESS.withName("custom_finished"),
        Interop.valueLayout.ADDRESS.withName("parser_finished"),
        Interop.valueLayout.ADDRESS.withName("get_internal_child")
    ).withName("GtkBuildableIface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public BuildableIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
