package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoRectangle} structure represents a rectangle.
 * <p>
 * {@code PangoRectangle} is frequently used to represent the logical or ink
 * extents of a single glyph or section of text. (See, for instance,
 * {@link Font#getGlyphExtents}.)
 */
public class Rectangle extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    ).withName("PangoRectangle");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Rectangle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
