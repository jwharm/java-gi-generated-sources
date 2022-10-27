package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeSortableIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("sort_column_changed"),
        Interop.valueLayout.ADDRESS.withName("get_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_func"),
        Interop.valueLayout.ADDRESS.withName("set_default_sort_func"),
        Interop.valueLayout.ADDRESS.withName("has_default_sort_func")
    ).withName("GtkTreeSortableIface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TreeSortableIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
