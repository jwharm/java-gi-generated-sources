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
    
    private static final java.lang.String C_TYPE_NAME = "PangoShapeFlags";
    
    /**
     * Default value
     */
    public static final ShapeFlags NONE = new ShapeFlags(0);
    
    /**
     * Round glyph positions and widths to whole device units
     *   This option should be set if the target renderer can't do subpixel positioning of glyphs
     */
    public static final ShapeFlags ROUND_POSITIONS = new ShapeFlags(1);
    
    /**
     * Create a new ShapeFlags with the provided value
     */
    public ShapeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ShapeFlags or(ShapeFlags... masks) {
        int value = this.getValue();
        for (ShapeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShapeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ShapeFlags combined(ShapeFlags mask, ShapeFlags... masks) {
        int value = mask.getValue();
        for (ShapeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShapeFlags(value);
    }
}
