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
public class Gravity {

    /**
     * Glyphs stand upright (default) &lt;img align="right" valign="center" src="m-south.png"&gt;
     */
    public static final Gravity SOUTH = new Gravity(0);
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &lt;img align="right" valign="center" src="m-east.png"&gt;
     */
    public static final Gravity EAST = new Gravity(1);
    
    /**
     * Glyphs are upside-down. &lt;img align="right" valign="cener" src="m-north.png"&gt;
     */
    public static final Gravity NORTH = new Gravity(2);
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &lt;img align="right" valign="center" src="m-west.png"&gt;
     */
    public static final Gravity WEST = new Gravity(3);
    
    /**
     * Gravity is resolved from the context matrix
     */
    public static final Gravity AUTO = new Gravity(4);
    
    private int value;
    
    public Gravity(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Gravity[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
