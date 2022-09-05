package org.harfbuzz;

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 */
public enum OtMathKernT {

    /**
     * The top right corner of the glyph.
     */
    TOP_RIGHT,
    
    /**
     * The top left corner of the glyph.
     */
    TOP_LEFT,
    
    /**
     * The bottom right corner of the glyph.
     */
    BOTTOM_RIGHT,
    
    /**
     * The bottom left corner of the glyph.
     */
    BOTTOM_LEFT;
    
    public static OtMathKernT fromValue(int value) {
        return switch(value) {
            case 0 -> TOP_RIGHT;
            case 1 -> TOP_LEFT;
            case 2 -> BOTTOM_RIGHT;
            case 3 -> BOTTOM_LEFT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOP_RIGHT -> 0;
            case TOP_LEFT -> 1;
            case BOTTOM_RIGHT -> 2;
            case BOTTOM_LEFT -> 3;
        };
    }

}
