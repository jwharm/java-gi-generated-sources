package org.gtk.gtk;

/**
 * Errors that can occur while parsing CSS.
 * <p>
 * These errors are unexpected and will cause parts of the given CSS
 * to be ignored.
 */
public class CssParserError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Unknown failure.
     */
    public static final CssParserError FAILED = new CssParserError(0);
    
    /**
     * The given text does not form valid syntax
     */
    public static final CssParserError SYNTAX = new CssParserError(1);
    
    /**
     * Failed to import a resource
     */
    public static final CssParserError IMPORT = new CssParserError(2);
    
    /**
     * The given name has not been defined
     */
    public static final CssParserError NAME = new CssParserError(3);
    
    /**
     * The given value is not correct
     */
    public static final CssParserError UNKNOWN_VALUE = new CssParserError(4);
    
    public CssParserError(int value) {
        super(value);
    }
    
}
