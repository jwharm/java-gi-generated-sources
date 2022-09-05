package org.pango;

/**
 * `PangoGravityHint` defines how horizontal scripts should behave in a
 * vertical context.
 * 
 * That is, English excerpts in a vertical paragraph for example.
 * 
 * See also [enum@Pango.Gravity]
 */
public enum GravityHint {

    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    NATURAL,
    
    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    STRONG,
    
    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    LINE;
    
    public static GravityHint fromValue(int value) {
        return switch(value) {
            case 0 -> NATURAL;
            case 1 -> STRONG;
            case 2 -> LINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NATURAL -> 0;
            case STRONG -> 1;
            case LINE -> 2;
        };
    }

}
