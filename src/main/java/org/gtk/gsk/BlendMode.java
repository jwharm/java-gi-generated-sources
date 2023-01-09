package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The blend modes available for render nodes.
 * <p>
 * The implementation of each blend mode is deferred to the
 * rendering pipeline.
 * <p>
 * See &lt;https://www.w3.org/TR/compositing-1/{@code blending}&gt; for more information
 * on blending and blend modes.
 */
public enum BlendMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The default blend mode, which specifies no blending
     */
    DEFAULT(0),
    
    /**
     * The source color is multiplied by the destination
     *   and replaces the destination
     */
    MULTIPLY(1),
    
    /**
     * Multiplies the complements of the destination and source
     *   color values, then complements the result.
     */
    SCREEN(2),
    
    /**
     * Multiplies or screens the colors, depending on the
     *   destination color value. This is the inverse of hard-list
     */
    OVERLAY(3),
    
    /**
     * Selects the darker of the destination and source colors
     */
    DARKEN(4),
    
    /**
     * Selects the lighter of the destination and source colors
     */
    LIGHTEN(5),
    
    /**
     * Brightens the destination color to reflect the source color
     */
    COLOR_DODGE(6),
    
    /**
     * Darkens the destination color to reflect the source color
     */
    COLOR_BURN(7),
    
    /**
     * Multiplies or screens the colors, depending on the source color value
     */
    HARD_LIGHT(8),
    
    /**
     * Darkens or lightens the colors, depending on the source color value
     */
    SOFT_LIGHT(9),
    
    /**
     * Subtracts the darker of the two constituent colors from the lighter color
     */
    DIFFERENCE(10),
    
    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
     */
    EXCLUSION(11),
    
    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
     */
    COLOR(12),
    
    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
     */
    HUE(13),
    
    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
     */
    SATURATION(14),
    
    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
     */
    LUMINOSITY(15);
    
    private static final java.lang.String C_TYPE_NAME = "GskBlendMode";
    
    private final int value;
    
    /**
     * Create a new BlendMode for the provided value
     * @param numeric value the enum value
     */
    BlendMode(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new BlendMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BlendMode of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
