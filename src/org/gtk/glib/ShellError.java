package org.gtk.glib;

/**
 * Error codes returned by shell functions.
 */
public enum ShellError {

    /**
     * Mismatched or otherwise mangled quoting.
     */
    BAD_QUOTING,
    
    /**
     * String to be parsed was empty.
     */
    EMPTY_STRING,
    
    /**
     * Some other error.
     */
    FAILED;
    
    public static ShellError fromValue(int value) {
        return switch(value) {
            case 0 -> BAD_QUOTING;
            case 1 -> EMPTY_STRING;
            case 2 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BAD_QUOTING -> 0;
            case EMPTY_STRING -> 1;
            case FAILED -> 2;
        };
    }

}
