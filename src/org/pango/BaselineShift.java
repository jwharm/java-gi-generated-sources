package org.pango;

/**
 * An enumeration that affects baseline shifts between runs.
 */
public enum BaselineShift {

    /**
     * Leave the baseline unchanged
     */
    NONE,
    
    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    SUPERSCRIPT,
    
    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    SUBSCRIPT;
    
    public static BaselineShift fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SUPERSCRIPT;
            case 2 -> SUBSCRIPT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SUPERSCRIPT -> 1;
            case SUBSCRIPT -> 2;
        };
    }

}
