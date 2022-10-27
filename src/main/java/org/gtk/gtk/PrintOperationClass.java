package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PrintOperationClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("done"),
        Interop.valueLayout.ADDRESS.withName("begin_print"),
        Interop.valueLayout.ADDRESS.withName("paginate"),
        Interop.valueLayout.ADDRESS.withName("request_page_setup"),
        Interop.valueLayout.ADDRESS.withName("draw_page"),
        Interop.valueLayout.ADDRESS.withName("end_print"),
        Interop.valueLayout.ADDRESS.withName("status_changed"),
        Interop.valueLayout.ADDRESS.withName("create_custom_widget"),
        Interop.valueLayout.ADDRESS.withName("custom_widget_apply"),
        Interop.valueLayout.ADDRESS.withName("preview"),
        Interop.valueLayout.ADDRESS.withName("update_custom_widget"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkPrintOperationClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PrintOperationClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
