package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextViewClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
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
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkTextViewClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TextViewClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
