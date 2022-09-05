package org.pango;

/**
 * Errors that can be returned by [func@Pango.Layout.deserialize].
 */
public enum LayoutDeserializeError {

    /**
     * Unspecified error
     */
    INVALID,
    
    /**
     * A JSon value could not be
     *   interpreted
     */
    INVALID_VALUE,
    
    /**
     * A required JSon member was
     *   not found
     */
    MISSING_VALUE;
    
    public static LayoutDeserializeError fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> INVALID_VALUE;
            case 2 -> MISSING_VALUE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case INVALID_VALUE -> 1;
            case MISSING_VALUE -> 2;
        };
    }

}
