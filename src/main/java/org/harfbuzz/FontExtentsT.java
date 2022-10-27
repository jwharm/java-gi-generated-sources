package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Font-wide extent values, measured in font units.
 * <p>
 * Note that typically {@code ascender} is positive and {@code descender}
 * negative, in coordinate systems that grow up.
 */
public class FontExtentsT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ascender"),
        ValueLayout.JAVA_INT.withName("descender"),
        ValueLayout.JAVA_INT.withName("line_gap"),
        ValueLayout.JAVA_INT.withName("reserved9"),
        ValueLayout.JAVA_INT.withName("reserved8"),
        ValueLayout.JAVA_INT.withName("reserved7"),
        ValueLayout.JAVA_INT.withName("reserved6"),
        ValueLayout.JAVA_INT.withName("reserved5"),
        ValueLayout.JAVA_INT.withName("reserved4"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.JAVA_INT.withName("reserved2"),
        ValueLayout.JAVA_INT.withName("reserved1")
    ).withName("hb_font_extents_t");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FontExtentsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
