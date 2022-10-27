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
    ).withName("GtkTextBufferClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TextBufferClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
