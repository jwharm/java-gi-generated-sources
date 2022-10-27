package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WindowClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("activate_focus"),
        Interop.valueLayout.ADDRESS.withName("activate_default"),
        Interop.valueLayout.ADDRESS.withName("keys_changed"),
        Interop.valueLayout.ADDRESS.withName("enable_debugging"),
        Interop.valueLayout.ADDRESS.withName("close_request"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkWindowClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public WindowClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
