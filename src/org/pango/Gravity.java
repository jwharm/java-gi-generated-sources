package org.pango;

/**
 * <code>PangoGravity</code> represents the orientation of glyphs in a segment
 * of text.
 * <p>
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity {@link [struct@Pango.Matrix] (ref=struct)}, and then
 * glyph orientation is controlled using <code>PangoGravity</code>.
 * <p>
 * Not every value in this enumeration makes sense for every usage of<code>PangoGravity</code>; for example, {@link org.pango.Gravity#AUTO} only can be passed to
 * {@link org.pango.Context#setBaseGravity} and can only be returned by
 * {@link org.pango.Context#getBaseGravity}.
 * 
 * See also: {@link [enum@Pango.GravityHint] (ref=enum)}
 */
public enum Gravity {

    /**
     * Glyphs stand upright (default) &#60;img align=&#34;right&#34; valign=&#34;center&#34; src=&#34;m-south.png&#34;&#62;
     */
    SOUTH,
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &#60;img align=&#34;right&#34; valign=&#34;center&#34; src=&#34;m-east.png&#34;&#62;
     */
    EAST,
    
    /**
     * Glyphs are upside-down. &#60;img align=&#34;right&#34; valign=&#34;cener&#34; src=&#34;m-north.png&#34;&#62;
     */
    NORTH,
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &#60;img align=&#34;right&#34; valign=&#34;center&#34; src=&#34;m-west.png&#34;&#62;
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
