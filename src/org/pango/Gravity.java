package org.pango;

/**
 * {@code PangoGravity} represents the orientation of glyphs in a segment
 * of text.
 * <p>
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity {@code Pango.Matrix}, and then
 * glyph orientation is controlled using {@code PangoGravity}.
 * <p>
 * Not every value in this enumeration makes sense for every usage of
 * {@code PangoGravity}; for example, {@link Gravity#AUTO} only can be passed to
 * {@link Context#setBaseGravity} and can only be returned by
 * {@link Context#getBaseGravity}.
 * <p>
 * See also: {@code Pango.GravityHint}
 */
public enum Gravity {

    /**
     * Glyphs stand upright (default) &lt;img align="right" valign="center" src="m-south.png"&gt;
     */
    SOUTH,
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &lt;img align="right" valign="center" src="m-east.png"&gt;
     */
    EAST,
    
    /**
     * Glyphs are upside-down. &lt;img align="right" valign="cener" src="m-north.png"&gt;
     */
    NORTH,
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &lt;img align="right" valign="center" src="m-west.png"&gt;
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
