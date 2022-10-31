package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code GtkEntry}. All virtual functions have a default
 * implementation. Derived classes may set the virtual function pointers for the
 * signal handlers to {@code null}, but must keep {@code get_text_area_size} and
 * {@code get_frame_size} non-{@code null}; either use the default implementation, or provide
 * a custom one.
 */
public class EntryClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntryClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        MemoryLayout.paddingLayout(384),
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
    
    public static EntryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EntryClass newInstance = new EntryClass(Refcounted.get(segment.address()));
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
    public EntryClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
