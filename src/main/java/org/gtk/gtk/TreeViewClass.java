package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeViewClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("row_activated"),
        Interop.valueLayout.ADDRESS.withName("test_expand_row"),
        Interop.valueLayout.ADDRESS.withName("test_collapse_row"),
        Interop.valueLayout.ADDRESS.withName("row_expanded"),
        Interop.valueLayout.ADDRESS.withName("row_collapsed"),
        Interop.valueLayout.ADDRESS.withName("columns_changed"),
        Interop.valueLayout.ADDRESS.withName("cursor_changed"),
        Interop.valueLayout.ADDRESS.withName("move_cursor"),
        Interop.valueLayout.ADDRESS.withName("select_all"),
        Interop.valueLayout.ADDRESS.withName("unselect_all"),
        Interop.valueLayout.ADDRESS.withName("select_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("toggle_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("expand_collapse_cursor_row"),
        Interop.valueLayout.ADDRESS.withName("select_cursor_parent"),
        Interop.valueLayout.ADDRESS.withName("start_interactive_search"),
        MemoryLayout.sequenceLayout(16, ValueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TreeViewClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeViewClass newInstance = new TreeViewClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public TreeViewClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
