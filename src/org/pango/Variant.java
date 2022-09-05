package org.pango;

/**
 * An enumeration specifying capitalization variant of the font.
 */
public enum Variant {

    /**
     * A normal font.
     */
    NORMAL,
    
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     */
    SMALL_CAPS,
    
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters. Since: 1.50
     */
    ALL_SMALL_CAPS,
    
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    PETITE_CAPS,
    
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    ALL_PETITE_CAPS,
    
    /**
     * A font with the upper case characters
     *   replaced by smaller variants of the capital letters. Since: 1.50
     */
    UNICASE,
    
    /**
     * A font with capital letters that
     *   are more suitable for all-uppercase titles. Since: 1.50
     */
    TITLE_CAPS;
    
    public static Variant fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> SMALL_CAPS;
            case 2 -> ALL_SMALL_CAPS;
            case 3 -> PETITE_CAPS;
            case 4 -> ALL_PETITE_CAPS;
            case 5 -> UNICASE;
            case 6 -> TITLE_CAPS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case SMALL_CAPS -> 1;
            case ALL_SMALL_CAPS -> 2;
            case PETITE_CAPS -> 3;
            case ALL_PETITE_CAPS -> 4;
            case UNICASE -> 5;
            case TITLE_CAPS -> 6;
        };
    }

}
