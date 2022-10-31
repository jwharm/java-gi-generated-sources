package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellLayoutIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellLayoutIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("pack_start"),
        Interop.valueLayout.ADDRESS.withName("pack_end"),
        Interop.valueLayout.ADDRESS.withName("clear"),
        Interop.valueLayout.ADDRESS.withName("add_attribute"),
        Interop.valueLayout.ADDRESS.withName("set_cell_data_func"),
        Interop.valueLayout.ADDRESS.withName("clear_attributes"),
        Interop.valueLayout.ADDRESS.withName("reorder"),
        Interop.valueLayout.ADDRESS.withName("get_cells"),
        Interop.valueLayout.ADDRESS.withName("get_area")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static CellLayoutIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellLayoutIface newInstance = new CellLayoutIface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public CellLayoutIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
