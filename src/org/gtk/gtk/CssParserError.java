package org.gtk.gtk;

/**
 * Errors that can occur while parsing CSS.
 * 
 * These errors are unexpected and will cause parts of the given CSS
 * to be ignored.
 */
public enum CssParserError {

    /**
     * Unknown failure.
     */
    FAILED,
    
    /**
     * The given text does not form valid syntax
     */
    SYNTAX,
    
    /**
     * Failed to import a resource
     */
    IMPORT,
    
    /**
     * The given name has not been defined
     */
    NAME,
    
    /**
     * The given value is not correct
     */
    UNKNOWN_VALUE;
    
    public static CssParserError fromValue(int value) {
        return switch(value) {
            case 0 -> FAILED;
            case 1 -> SYNTAX;
            case 2 -> IMPORT;
            case 3 -> NAME;
            case 4 -> UNKNOWN_VALUE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case SYNTAX -> 1;
            case IMPORT -> 2;
            case NAME -> 3;
            case UNKNOWN_VALUE -> 4;
        };
    }

}
