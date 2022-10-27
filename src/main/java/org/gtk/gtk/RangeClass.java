package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RangeClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("value_changed"),
        Interop.valueLayout.ADDRESS.withName("adjust_bounds"),
        Interop.valueLayout.ADDRESS.withName("move_slider"),
        Interop.valueLayout.ADDRESS.withName("get_range_border"),
        Interop.valueLayout.ADDRESS.withName("change_value"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkRangeClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public RangeClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
