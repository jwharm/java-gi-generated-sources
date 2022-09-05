package org.pango;

/**
 * An enumeration specifying the width of the font relative to other designs
 * within a family.
 */
public enum Stretch {

    /**
     * ultra condensed width
     */
    ULTRA_CONDENSED,
    
    /**
     * extra condensed width
     */
    EXTRA_CONDENSED,
    
    /**
     * condensed width
     */
    CONDENSED,
    
    /**
     * semi condensed width
     */
    SEMI_CONDENSED,
    
    /**
     * the normal width
     */
    NORMAL,
    
    /**
     * semi expanded width
     */
    SEMI_EXPANDED,
    
    /**
     * expanded width
     */
    EXPANDED,
    
    /**
     * extra expanded width
     */
    EXTRA_EXPANDED,
    
    /**
     * ultra expanded width
     */
    ULTRA_EXPANDED;
    
    public static Stretch fromValue(int value) {
        return switch(value) {
            case 0 -> ULTRA_CONDENSED;
            case 1 -> EXTRA_CONDENSED;
            case 2 -> CONDENSED;
            case 3 -> SEMI_CONDENSED;
            case 4 -> NORMAL;
            case 5 -> SEMI_EXPANDED;
            case 6 -> EXPANDED;
            case 7 -> EXTRA_EXPANDED;
            case 8 -> ULTRA_EXPANDED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ULTRA_CONDENSED -> 0;
            case EXTRA_CONDENSED -> 1;
            case CONDENSED -> 2;
            case SEMI_CONDENSED -> 3;
            case NORMAL -> 4;
            case SEMI_EXPANDED -> 5;
            case EXPANDED -> 6;
            case EXTRA_EXPANDED -> 7;
            case ULTRA_EXPANDED -> 8;
        };
    }

}
