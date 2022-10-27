package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontChooserIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("get_font_family"),
        Interop.valueLayout.ADDRESS.withName("get_font_face"),
        Interop.valueLayout.ADDRESS.withName("get_font_size"),
        Interop.valueLayout.ADDRESS.withName("set_filter_func"),
        Interop.valueLayout.ADDRESS.withName("font_activated"),
        Interop.valueLayout.ADDRESS.withName("set_font_map"),
        Interop.valueLayout.ADDRESS.withName("get_font_map"),
        MemoryLayout.sequenceLayout(10, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkFontChooserIface");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FontChooserIface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
