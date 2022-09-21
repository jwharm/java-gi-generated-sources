package org.harfbuzz;

/**
 * Defined by <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Design-Variation Axis Tag Registry</a>.
 */
public enum StyleTagT {

    /**
     * Used to vary between non-italic and italic.
     * A value of 0 can be interpreted as "Roman" (non-italic); a value of 1 can
     * be interpreted as (fully) italic.
     */
    ITALIC,
    
    /**
     * Used to vary design to suit different text sizes.
     * Non-zero. Values can be interpreted as text size, in points.
     */
    OPTICAL_SIZE,
    
    /**
     * Used to vary between upright and slanted text. Values
     * must be greater than -90 and less than +90. Values can be interpreted as
     * the angle, in counter-clockwise degrees, of oblique slant from whatever the
     * designer considers to be upright for that font design. Typical right-leaning
     * Italic fonts have a negative slant angle (typically around -12)
     */
    SLANT_ANGLE,
    
    /**
     * same as {@code HB_STYLE_TAG_SLANT_ANGLE} expression as ratio.
     * Typical right-leaning Italic fonts have a positive slant ratio (typically around 0.2)
     */
    SLANT_RATIO,
    
    /**
     * Used to vary width of text from narrower to wider.
     * Non-zero. Values can be interpreted as a percentage of whatever the font
     * designer considers “normal width” for that font design.
     */
    WIDTH,
    
    /**
     * Used to vary stroke thicknesses or other design details
     * to give variation from lighter to blacker. Values can be interpreted in direct
     * comparison to values for usWeightClass in the OS/2 table,
     * or the CSS font-weight property.
     */
    WEIGHT;
    
    public static StyleTagT fromValue(int value) {
        return switch(value) {
            case 1769234796 -> ITALIC;
            case 1869640570 -> OPTICAL_SIZE;
            case 1936486004 -> SLANT_ANGLE;
            case 1399615092 -> SLANT_RATIO;
            case 2003072104 -> WIDTH;
            case 2003265652 -> WEIGHT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ITALIC -> 1769234796;
            case OPTICAL_SIZE -> 1869640570;
            case SLANT_ANGLE -> 1936486004;
            case SLANT_RATIO -> 1399615092;
            case WIDTH -> 2003072104;
            case WEIGHT -> 2003265652;
        };
    }

}
