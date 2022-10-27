package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkLayoutManagerClass} structure contains only private data, and
 * should only be accessed through the provided API, or when subclassing
 * {@code GtkLayoutManager}.
 */
public class LayoutManagerClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_request_mode"),
        Interop.valueLayout.ADDRESS.withName("measure"),
        Interop.valueLayout.ADDRESS.withName("allocate"),
        ValueLayout.JAVA_LONG.withName("layout_child_type"),
        Interop.valueLayout.ADDRESS.withName("create_layout_child"),
        Interop.valueLayout.ADDRESS.withName("root"),
        Interop.valueLayout.ADDRESS.withName("unroot"),
        MemoryLayout.sequenceLayout(16, ValueLayout.ADDRESS).withName("_padding")
    ).withName("GtkLayoutManagerClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public LayoutManagerClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
