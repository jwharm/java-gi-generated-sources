package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkGLAreaClass} structure contains only private data.
 */
public class GLAreaClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("render"),
        Interop.valueLayout.ADDRESS.withName("resize"),
        Interop.valueLayout.ADDRESS.withName("create_context"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("_padding")
    ).withName("GtkGLAreaClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public GLAreaClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
