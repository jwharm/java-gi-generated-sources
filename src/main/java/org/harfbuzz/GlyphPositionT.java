package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GlyphPositionT} is the structure that holds the positions of the
 * glyph in both horizontal and vertical directions. All positions in
 * {@link GlyphPositionT} are relative to the current point.
 */
public class GlyphPositionT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x_advance"),
        ValueLayout.JAVA_INT.withName("y_advance"),
        ValueLayout.JAVA_INT.withName("x_offset"),
        ValueLayout.JAVA_INT.withName("y_offset"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var")
    ).withName("hb_glyph_position_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public GlyphPositionT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
