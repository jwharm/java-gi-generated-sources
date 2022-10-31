package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeModelIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("row_changed"),
        Interop.valueLayout.ADDRESS.withName("row_inserted"),
        Interop.valueLayout.ADDRESS.withName("row_has_child_toggled"),
        Interop.valueLayout.ADDRESS.withName("row_deleted"),
        Interop.valueLayout.ADDRESS.withName("rows_reordered"),
        Interop.valueLayout.ADDRESS.withName("get_flags"),
        Interop.valueLayout.ADDRESS.withName("get_n_columns"),
        Interop.valueLayout.ADDRESS.withName("get_column_type"),
        Interop.valueLayout.ADDRESS.withName("get_iter"),
        Interop.valueLayout.ADDRESS.withName("get_path"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        Interop.valueLayout.ADDRESS.withName("iter_next"),
        Interop.valueLayout.ADDRESS.withName("iter_previous"),
        Interop.valueLayout.ADDRESS.withName("iter_children"),
        Interop.valueLayout.ADDRESS.withName("iter_has_child"),
        Interop.valueLayout.ADDRESS.withName("iter_n_children"),
        Interop.valueLayout.ADDRESS.withName("iter_nth_child"),
        Interop.valueLayout.ADDRESS.withName("iter_parent"),
        Interop.valueLayout.ADDRESS.withName("ref_node"),
        Interop.valueLayout.ADDRESS.withName("unref_node")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TreeModelIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeModelIface newInstance = new TreeModelIface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TreeModelIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
