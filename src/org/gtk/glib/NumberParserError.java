package org.gtk.glib;

/**
 * Error codes returned by functions converting a string to a number.
 */
public class NumberParserError extends io.github.jwharm.javagi.Enumeration {

    /**
     * String was not a valid number.
     */
    public static final NumberParserError INVALID = new NumberParserError(0);
    
    /**
     * String was a number, but out of bounds.
     */
    public static final NumberParserError OUT_OF_BOUNDS = new NumberParserError(1);
    
    public NumberParserError(int value) {
        super(value);
    }
    
}
