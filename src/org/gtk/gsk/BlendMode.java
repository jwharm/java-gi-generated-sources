package org.gtk.gsk;

/**
 * The blend modes available for render nodes.
 * <p>
 * The implementation of each blend mode is deferred to the
 * rendering pipeline.
 * <p>
 * See &lt;https://www.w3.org/TR/compositing-1/#blending&gt; for more information
 * on blending and blend modes.
 */
public class BlendMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * The default blend mode, which specifies no blending
     */
    public static final BlendMode DEFAULT = new BlendMode(0);
    
    /**
     * The source color is multiplied by the destination
     *   and replaces the destination
     */
    public static final BlendMode MULTIPLY = new BlendMode(1);
    
    /**
     * Multiplies the complements of the destination and source
     *   color values, then complements the result.
     */
    public static final BlendMode SCREEN = new BlendMode(2);
    
    /**
     * Multiplies or screens the colors, depending on the
     *   destination color value. This is the inverse of hard-list
     */
    public static final BlendMode OVERLAY = new BlendMode(3);
    
    /**
     * Selects the darker of the destination and source colors
     */
    public static final BlendMode DARKEN = new BlendMode(4);
    
    /**
     * Selects the lighter of the destination and source colors
     */
    public static final BlendMode LIGHTEN = new BlendMode(5);
    
    /**
     * Brightens the destination color to reflect the source color
     */
    public static final BlendMode COLOR_DODGE = new BlendMode(6);
    
    /**
     * Darkens the destination color to reflect the source color
     */
    public static final BlendMode COLOR_BURN = new BlendMode(7);
    
    /**
     * Multiplies or screens the colors, depending on the source color value
     */
    public static final BlendMode HARD_LIGHT = new BlendMode(8);
    
    /**
     * Darkens or lightens the colors, depending on the source color value
     */
    public static final BlendMode SOFT_LIGHT = new BlendMode(9);
    
    /**
     * Subtracts the darker of the two constituent colors from the lighter color
     */
    public static final BlendMode DIFFERENCE = new BlendMode(10);
    
    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
     */
    public static final BlendMode EXCLUSION = new BlendMode(11);
    
    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
     */
    public static final BlendMode COLOR = new BlendMode(12);
    
    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
     */
    public static final BlendMode HUE = new BlendMode(13);
    
    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
     */
    public static final BlendMode SATURATION = new BlendMode(14);
    
    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
     */
    public static final BlendMode LUMINOSITY = new BlendMode(15);
    
    public BlendMode(int value) {
        super(value);
    }
    
}
