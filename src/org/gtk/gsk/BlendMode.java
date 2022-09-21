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
public enum BlendMode {

    /**
     * The default blend mode, which specifies no blending
     */
    DEFAULT,
    
    /**
     * The source color is multiplied by the destination
     *   and replaces the destination
     */
    MULTIPLY,
    
    /**
     * Multiplies the complements of the destination and source
     *   color values, then complements the result.
     */
    SCREEN,
    
    /**
     * Multiplies or screens the colors, depending on the
     *   destination color value. This is the inverse of hard-list
     */
    OVERLAY,
    
    /**
     * Selects the darker of the destination and source colors
     */
    DARKEN,
    
    /**
     * Selects the lighter of the destination and source colors
     */
    LIGHTEN,
    
    /**
     * Brightens the destination color to reflect the source color
     */
    COLOR_DODGE,
    
    /**
     * Darkens the destination color to reflect the source color
     */
    COLOR_BURN,
    
    /**
     * Multiplies or screens the colors, depending on the source color value
     */
    HARD_LIGHT,
    
    /**
     * Darkens or lightens the colors, depending on the source color value
     */
    SOFT_LIGHT,
    
    /**
     * Subtracts the darker of the two constituent colors from the lighter color
     */
    DIFFERENCE,
    
    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
     */
    EXCLUSION,
    
    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
     */
    COLOR,
    
    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
     */
    HUE,
    
    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
     */
    SATURATION,
    
    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
     */
    LUMINOSITY;
    
    public static BlendMode fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> MULTIPLY;
            case 2 -> SCREEN;
            case 3 -> OVERLAY;
            case 4 -> DARKEN;
            case 5 -> LIGHTEN;
            case 6 -> COLOR_DODGE;
            case 7 -> COLOR_BURN;
            case 8 -> HARD_LIGHT;
            case 9 -> SOFT_LIGHT;
            case 10 -> DIFFERENCE;
            case 11 -> EXCLUSION;
            case 12 -> COLOR;
            case 13 -> HUE;
            case 14 -> SATURATION;
            case 15 -> LUMINOSITY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case MULTIPLY -> 1;
            case SCREEN -> 2;
            case OVERLAY -> 3;
            case DARKEN -> 4;
            case LIGHTEN -> 5;
            case COLOR_DODGE -> 6;
            case COLOR_BURN -> 7;
            case HARD_LIGHT -> 8;
            case SOFT_LIGHT -> 9;
            case DIFFERENCE -> 10;
            case EXCLUSION -> 11;
            case COLOR -> 12;
            case HUE -> 13;
            case SATURATION -> 14;
            case LUMINOSITY -> 15;
        };
    }

}
