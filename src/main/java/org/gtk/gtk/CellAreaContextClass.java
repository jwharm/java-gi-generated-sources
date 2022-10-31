package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellAreaContextClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellAreaContextClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("allocate"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_height_for_width"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_width_for_height"),
        MemoryLayout.paddingLayout(192),
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
    
    public static CellAreaContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellAreaContextClass newInstance = new CellAreaContextClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public CellAreaContextClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
