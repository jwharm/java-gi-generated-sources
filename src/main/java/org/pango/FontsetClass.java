package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoFontsetClass} structure holds the virtual functions for
 * a particular {@code PangoFontset} implementation.
 */
public class FontsetClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_font"),
        Interop.valueLayout.ADDRESS.withName("get_metrics"),
        Interop.valueLayout.ADDRESS.withName("get_language"),
        Interop.valueLayout.ADDRESS.withName("foreach"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
    ).withName("PangoFontsetClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FontsetClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
