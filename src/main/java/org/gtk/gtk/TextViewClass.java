package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextViewClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextViewClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("move_cursor"),
        Interop.valueLayout.ADDRESS.withName("set_anchor"),
        Interop.valueLayout.ADDRESS.withName("insert_at_cursor"),
        Interop.valueLayout.ADDRESS.withName("delete_from_cursor"),
        Interop.valueLayout.ADDRESS.withName("backspace"),
        Interop.valueLayout.ADDRESS.withName("cut_clipboard"),
        Interop.valueLayout.ADDRESS.withName("copy_clipboard"),
        Interop.valueLayout.ADDRESS.withName("paste_clipboard"),
        Interop.valueLayout.ADDRESS.withName("toggle_overwrite"),
        Interop.valueLayout.ADDRESS.withName("create_buffer"),
        Interop.valueLayout.ADDRESS.withName("snapshot_layer"),
        Interop.valueLayout.ADDRESS.withName("extend_selection"),
        Interop.valueLayout.ADDRESS.withName("insert_emoji"),
        MemoryLayout.paddingLayout(128),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TextViewClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextViewClass newInstance = new TextViewClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TextViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextViewClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
