package org.pango;

/**
 * <code>PangoGravity</code> represents the orientation of glyphs in a segment
 * of text.
 * <p>
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity {@link [struct@Pango.Matrix] (ref=struct)}, and then
 * glyph orientation is controlled using <code>PangoGravity</code>.
 * <p>
 * Not every value in this enumeration makes sense for every usage of<code>PangoGravity</code>; for example, {@link org.pango.Gravity<code>#AUTO</code>  only can be passed to
 * {@link org.pango.Context<code>#setBaseGravity</code>  and can only be returned by
 * {@link org.pango.Context<code>#getBaseGravity</code> .
 * 
 * See also: {@link [enum@Pango.GravityHint] (ref=enum)}
 */
public enum Gravity {

    /**
     * Glyphs stand upright (default) &<code>#60</code> img align=&<code>#34</code> right&<code>#34</code>  valign=&<code>#34</code> center&<code>#34</code>  src=&<code>#34</code> m-south.png&<code>#34</code> &<code>#62</code>
     */
    SOUTH,
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &<code>#60</code> img align=&<code>#34</code> right&<code>#34</code>  valign=&<code>#34</code> center&<code>#34</code>  src=&<code>#34</code> m-east.png&<code>#34</code> &<code>#62</code>
     */
    EAST,
    
    /**
     * Glyphs are upside-down. &<code>#60</code> img align=&<code>#34</code> right&<code>#34</code>  valign=&<code>#34</code> cener&<code>#34</code>  src=&<code>#34</code> m-north.png&<code>#34</code> &<code>#62</code>
     */
    NORTH,
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &<code>#60</code> img align=&<code>#34</code> right&<code>#34</code>  valign=&<code>#34</code> center&<code>#34</code>  src=&<code>#34</code> m-west.png&<code>#34</code> &<code>#62</code>
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
