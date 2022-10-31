package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeSortableIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeSortableIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("sort_column_changed"),
        Interop.valueLayout.ADDRESS.withName("get_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_func"),
        Interop.valueLayout.ADDRESS.withName("set_default_sort_func"),
        Interop.valueLayout.ADDRESS.withName("has_default_sort_func")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TreeSortableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeSortableIface newInstance = new TreeSortableIface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TreeSortableIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
