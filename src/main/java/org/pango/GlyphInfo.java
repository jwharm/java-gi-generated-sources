package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphInfo} structure represents a single glyph with
 * positioning information and visual attributes.
 */
public class GlyphInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph"),
        org.pango.GlyphGeometry.getMemoryLayout().withName("geometry"),
        org.pango.GlyphVisAttr.getMemoryLayout().withName("attr")
    ).withName("PangoGlyphInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public GlyphInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
