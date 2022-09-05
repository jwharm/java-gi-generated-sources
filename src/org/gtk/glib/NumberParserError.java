package org.gtk.glib;

/**
 * Error codes returned by functions converting a string to a number.
 */
public enum NumberParserError {

    /**
     * String was not a valid number.
     */
    INVALID,
    
    /**
     * String was a number, but out of bounds.
     */
    OUT_OF_BOUNDS;
    
    public static NumberParserError fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> OUT_OF_BOUNDS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case OUT_OF_BOUNDS -> 1;
        };
    }

}
