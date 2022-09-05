package org.pango;

/**
 * `PangoGravity` represents the orientation of glyphs in a segment
 * of text.
 * 
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity [struct@Pango.Matrix], and then
 * glyph orientation is controlled using `PangoGravity`.
 * 
 * Not every value in this enumeration makes sense for every usage of
 * `PangoGravity`; for example, %PANGO_GRAVITY_AUTO only can be passed to
 * [method@Pango.Context.set_base_gravity] and can only be returned by
 * [method@Pango.Context.get_base_gravity].
 * 
 * See also: [enum@Pango.GravityHint]
 */
public enum Gravity {

    /**
     * Glyphs stand upright (default) <img align="right" valign="center" src="m-south.png">
     */
    SOUTH,
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. <img align="right" valign="center" src="m-east.png">
     */
    EAST,
    
    /**
     * Glyphs are upside-down. <img align="right" valign="cener" src="m-north.png">
     */
    NORTH,
    
    /**
     * Glyphs are rotated 90 degrees clockwise. <img align="right" valign="center" src="m-west.png">
     */
    WEST,
    
    /**
     * Gravity is resolved from the context matrix
     */
    AUTO;
    
    public static Gravity fromValue(int value) {
        return switch(value) {
            case 0 -> SOUTH;
            case 1 -> EAST;
            case 2 -> NORTH;
            case 3 -> WEST;
            case 4 -> AUTO;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SOUTH -> 0;
            case EAST -> 1;
            case NORTH -> 2;
            case WEST -> 3;
            case AUTO -> 4;
        };
    }

}
