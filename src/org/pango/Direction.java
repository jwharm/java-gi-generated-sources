package org.pango;

/**
 * `PangoDirection` represents a direction in the Unicode bidirectional
 * algorithm.
 * 
 * Not every value in this enumeration makes sense for every usage of
 * `PangoDirection`; for example, the return value of [func@unichar_direction]
 * and [func@find_base_dir] cannot be `PANGO_DIRECTION_WEAK_LTR` or
 * `PANGO_DIRECTION_WEAK_RTL`, since every character is either neutral
 * or has a strong direction; on the other hand `PANGO_DIRECTION_NEUTRAL`
 * doesn't make sense to pass to [func@itemize_with_base_dir].
 * 
 * The `PANGO_DIRECTION_TTB_LTR`, `PANGO_DIRECTION_TTB_RTL` values come from
 * an earlier interpretation of this enumeration as the writing direction
 * of a block of text and are no longer used. See `PangoGravity` for how
 * vertical text is handled in Pango.
 * 
 * If you are interested in text direction, you should really use fribidi
 * directly. `PangoDirection` is only retained because it is used in some
 * public apis.
 */
public enum Direction {

    /**
     * A strong left-to-right direction
     */
    LTR,
    
    /**
     * A strong right-to-left direction
     */
    RTL,
    
    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_RTL`.
     */
    TTB_LTR,
    
    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_LTR`
     */
    TTB_RTL,
    
    /**
     * A weak left-to-right direction
     */
    WEAK_LTR,
    
    /**
     * A weak right-to-left direction
     */
    WEAK_RTL,
    
    /**
     * No direction specified
     */
    NEUTRAL;
    
    public static Direction fromValue(int value) {
        return switch(value) {
            case 0 -> LTR;
            case 1 -> RTL;
            case 2 -> TTB_LTR;
            case 3 -> TTB_RTL;
            case 4 -> WEAK_LTR;
            case 5 -> WEAK_RTL;
            case 6 -> NEUTRAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LTR -> 0;
            case RTL -> 1;
            case TTB_LTR -> 2;
            case TTB_RTL -> 3;
            case WEAK_LTR -> 4;
            case WEAK_RTL -> 5;
            case NEUTRAL -> 6;
        };
    }

}
