package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("describe"),
        Interop.valueLayout.ADDRESS.withName("get_coverage"),
        Interop.valueLayout.ADDRESS.withName("get_glyph_extents"),
        Interop.valueLayout.ADDRESS.withName("get_metrics"),
        Interop.valueLayout.ADDRESS.withName("get_font_map"),
        Interop.valueLayout.ADDRESS.withName("describe_absolute"),
        Interop.valueLayout.ADDRESS.withName("get_features"),
        Interop.valueLayout.ADDRESS.withName("create_hb_font")
    ).withName("PangoFontClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FontClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
