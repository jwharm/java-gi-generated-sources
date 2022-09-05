package org.pango;

/**
 * An enumeration that affects how Pango treats characters during shaping.
 */
public enum TextTransform {

    /**
     * Leave text unchanged
     */
    NONE,
    
    /**
     * Display letters and numbers as lowercase
     */
    LOWERCASE,
    
    /**
     * Display letters and numbers as uppercase
     */
    UPPERCASE,
    
    /**
     * Display the first character of a word
     *   in titlecase
     */
    CAPITALIZE;
    
    public static TextTransform fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> LOWERCASE;
            case 2 -> UPPERCASE;
            case 3 -> CAPITALIZE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case LOWERCASE -> 1;
            case UPPERCASE -> 2;
            case CAPITALIZE -> 3;
        };
    }

}
