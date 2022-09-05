package org.pango;

/**
 * The `PangoOverline` enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 */
public enum Overline {

    /**
     * no overline should be drawn
     */
    NONE,
    
    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    SINGLE;
    
    public static Overline fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SINGLE -> 1;
        };
    }

}
