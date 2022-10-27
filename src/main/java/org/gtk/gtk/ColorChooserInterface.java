package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ColorChooserInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_interface"),
        Interop.valueLayout.ADDRESS.withName("get_rgba"),
        Interop.valueLayout.ADDRESS.withName("set_rgba"),
        Interop.valueLayout.ADDRESS.withName("add_palette"),
        Interop.valueLayout.ADDRESS.withName("color_activated"),
        MemoryLayout.sequenceLayout(12, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkColorChooserInterface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ColorChooserInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
