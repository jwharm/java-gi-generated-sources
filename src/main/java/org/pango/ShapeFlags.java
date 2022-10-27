package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags influencing the shaping process.
 * <p>
 * {@code PangoShapeFlags} can be passed to {@link Pango#shapeWithFlags}.
 * @version 1.44
 */
public class ShapeFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Default value
     */
    public static final ShapeFlags NONE = new ShapeFlags(0);
    
    /**
     * Round glyph positions and widths to whole device units
     *   This option should be set if the target renderer can't do subpixel positioning of glyphs
     */
    public static final ShapeFlags ROUND_POSITIONS = new ShapeFlags(1);
    
    public ShapeFlags(int value) {
        super(value);
    }
}
