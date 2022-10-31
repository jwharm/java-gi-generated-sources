package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeDragDestIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeDragDestIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("drag_data_received"),
        Interop.valueLayout.ADDRESS.withName("row_drop_possible")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TreeDragDestIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeDragDestIface newInstance = new TreeDragDestIface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TreeDragDestIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
