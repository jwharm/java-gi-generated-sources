package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GlyphInfoT} is the structure that holds information about the
 * glyphs and their relation to input text.
 */
public class GlyphInfoT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("codepoint"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("cluster"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var1"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var2")
    ).withName("hb_glyph_info_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public GlyphInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
