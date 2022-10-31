package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for {@code GtkTextBuffer}.
 */
public class TextBufferClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextBufferClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("insert_text"),
        Interop.valueLayout.ADDRESS.withName("insert_paintable"),
        Interop.valueLayout.ADDRESS.withName("insert_child_anchor"),
        Interop.valueLayout.ADDRESS.withName("delete_range"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("modified_changed"),
        Interop.valueLayout.ADDRESS.withName("mark_set"),
        Interop.valueLayout.ADDRESS.withName("mark_deleted"),
        Interop.valueLayout.ADDRESS.withName("apply_tag"),
        Interop.valueLayout.ADDRESS.withName("remove_tag"),
        Interop.valueLayout.ADDRESS.withName("begin_user_action"),
        Interop.valueLayout.ADDRESS.withName("end_user_action"),
        Interop.valueLayout.ADDRESS.withName("paste_done"),
        Interop.valueLayout.ADDRESS.withName("undo"),
        Interop.valueLayout.ADDRESS.withName("redo"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TextBufferClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextBufferClass newInstance = new TextBufferClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public TextBufferClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
