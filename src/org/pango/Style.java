package org.pango;

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public enum Style {

    /**
     * the font is upright.
     */
    NORMAL,
    
    /**
     * the font is slanted, but in a roman style.
     */
    OBLIQUE,
    
    /**
     * the font is slanted in an italic style.
     */
    ITALIC;
    
    public static Style fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> OBLIQUE;
            case 2 -> ITALIC;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case OBLIQUE -> 1;
            case ITALIC -> 2;
        };
    }

}
