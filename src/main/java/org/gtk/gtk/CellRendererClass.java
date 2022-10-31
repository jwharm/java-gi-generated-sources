package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellRendererClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_request_mode"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_width"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_height_for_width"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_height"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_width_for_height"),
        Interop.valueLayout.ADDRESS.withName("get_aligned_area"),
        Interop.valueLayout.ADDRESS.withName("snapshot"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("start_editing"),
        Interop.valueLayout.ADDRESS.withName("editing_canceled"),
        Interop.valueLayout.ADDRESS.withName("editing_started"),
        MemoryLayout.paddingLayout(256),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static CellRendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellRendererClass newInstance = new CellRendererClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public CellRendererClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
