package org.gtk.glib;

/**
 * Error codes returned by character set conversion routines.
 */
public enum ConvertError {

    /**
     * Conversion between the requested character
     *     sets is not supported.
     */
    NO_CONVERSION,
    
    /**
     * Invalid byte sequence in conversion input;
     *    or the character sequence could not be represented in the target
     *    character set.
     */
    ILLEGAL_SEQUENCE,
    
    /**
     * Conversion failed for some reason.
     */
    FAILED,
    
    /**
     * Partial character sequence at end of input.
     */
    PARTIAL_INPUT,
    
    /**
     * URI is invalid.
     */
    BAD_URI,
    
    /**
     * Pathname is not an absolute path.
     */
    NOT_ABSOLUTE_PATH,
    
    /**
     * No memory available. Since: 2.40
     */
    NO_MEMORY,
    
    /**
     * An embedded NUL character is present in
     *     conversion output where a NUL-terminated string is expected.
     *     Since: 2.56
     */
    EMBEDDED_NUL;
    
    public static ConvertError fromValue(int value) {
        return switch(value) {
            case 0 -> NO_CONVERSION;
            case 1 -> ILLEGAL_SEQUENCE;
            case 2 -> FAILED;
            case 3 -> PARTIAL_INPUT;
            case 4 -> BAD_URI;
            case 5 -> NOT_ABSOLUTE_PATH;
            case 6 -> NO_MEMORY;
            case 7 -> EMBEDDED_NUL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NO_CONVERSION -> 0;
            case ILLEGAL_SEQUENCE -> 1;
            case FAILED -> 2;
            case PARTIAL_INPUT -> 3;
            case BAD_URI -> 4;
            case NOT_ABSOLUTE_PATH -> 5;
            case NO_MEMORY -> 6;
            case EMBEDDED_NUL -> 7;
        };
    }

}
