package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defined by <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Design-Variation Axis Tag Registry</a>.
 * @version 3.0.0
 */
public enum StyleTagT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Used to vary between non-italic and italic.
     * A value of 0 can be interpreted as "Roman" (non-italic); a value of 1 can
     * be interpreted as (fully) italic.
     */
    ITALIC(1769234796),
    
    /**
     * Used to vary design to suit different text sizes.
     * Non-zero. Values can be interpreted as text size, in points.
     */
    OPTICAL_SIZE(1869640570),
    
    /**
     * Used to vary between upright and slanted text. Values
     * must be greater than -90 and less than +90. Values can be interpreted as
     * the angle, in counter-clockwise degrees, of oblique slant from whatever the
     * designer considers to be upright for that font design. Typical right-leaning
     * Italic fonts have a negative slant angle (typically around -12)
     */
    SLANT_ANGLE(1936486004),
    
    /**
     * same as {@code HB_STYLE_TAG_SLANT_ANGLE} expression as ratio.
     * Typical right-leaning Italic fonts have a positive slant ratio (typically around 0.2)
     */
    SLANT_RATIO(1399615092),
    
    /**
     * Used to vary width of text from narrower to wider.
     * Non-zero. Values can be interpreted as a percentage of whatever the font
     * designer considers “normal width” for that font design.
     */
    WIDTH(2003072104),
    
    /**
     * Used to vary stroke thicknesses or other design details
     * to give variation from lighter to blacker. Values can be interpreted in direct
     * comparison to values for usWeightClass in the OS/2 table,
     * or the CSS font-weight property.
     */
    WEIGHT(2003265652);
    
    private static final java.lang.String C_TYPE_NAME = "hb_style_tag_t";
    
    private final int value;
    
    /**
     * Create a new StyleTagT for the provided value
     * @param numeric value the enum value
     */
    StyleTagT(int value) {
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
     * Create a new StyleTagT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StyleTagT of(int value) {
        return switch (value) {
            case 1769234796 -> ITALIC;
            case 1869640570 -> OPTICAL_SIZE;
            case 1936486004 -> SLANT_ANGLE;
            case 1399615092 -> SLANT_RATIO;
            case 2003072104 -> WIDTH;
            case 2003265652 -> WEIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
