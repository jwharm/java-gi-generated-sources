package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ComboBoxClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkComboBoxClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("format_entry_text"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        MemoryLayout.paddingLayout(192),
        MemoryLayout.sequenceLayout(7, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ComboBoxClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ComboBoxClass newInstance = new ComboBoxClass(Refcounted.get(segment.address()));
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
    public ComboBoxClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
