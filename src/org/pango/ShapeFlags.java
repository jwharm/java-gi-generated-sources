package org.pango;

/**
 * Flags influencing the shaping process.
 * <p><code>PangoShapeFlags</code> can be passed to {@link Pango#shapeWithFlags}.
 */
public class ShapeFlags {

    /**
     * Default value
     */
    public static final int NONE = 0;
    
    /**
     * Round glyph positions and widths to whole device units
     *   This option should be set if the target renderer can&#39;t do subpixel positioning of glyphs
     */
    public static final int ROUND_POSITIONS = 1;
    
}
