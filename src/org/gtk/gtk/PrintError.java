package org.gtk.gtk;

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public enum PrintError {

    /**
     * An unspecified error occurred.
     */
    GENERAL,
    
    /**
     * An internal error occurred.
     */
    INTERNAL_ERROR,
    
    /**
     * A memory allocation failed.
     */
    NOMEM,
    
    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    INVALID_FILE;
    
    public static PrintError fromValue(int value) {
        return switch(value) {
            case 0 -> GENERAL;
            case 1 -> INTERNAL_ERROR;
            case 2 -> NOMEM;
            case 3 -> INVALID_FILE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case GENERAL -> 0;
            case INTERNAL_ERROR -> 1;
            case NOMEM -> 2;
            case INVALID_FILE -> 3;
        };
    }

}
