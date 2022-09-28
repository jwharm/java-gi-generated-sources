package org.pango;

/**
 * Flags influencing the shaping process.
 * <p>
 * {@code PangoShapeFlags} can be passed to {@link Pango#shapeWithFlags}.
 */
public class ShapeFlags extends io.github.jwharm.javagi.Bitfield {

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
