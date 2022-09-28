package org.gtk.glib;

/**
 * Error codes returned by character set conversion routines.
 */
public class ConvertError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Conversion between the requested character
     *     sets is not supported.
     */
    public static final ConvertError NO_CONVERSION = new ConvertError(0);
    
    /**
     * Invalid byte sequence in conversion input;
     *    or the character sequence could not be represented in the target
     *    character set.
     */
    public static final ConvertError ILLEGAL_SEQUENCE = new ConvertError(1);
    
    /**
     * Conversion failed for some reason.
     */
    public static final ConvertError FAILED = new ConvertError(2);
    
    /**
     * Partial character sequence at end of input.
     */
    public static final ConvertError PARTIAL_INPUT = new ConvertError(3);
    
    /**
     * URI is invalid.
     */
    public static final ConvertError BAD_URI = new ConvertError(4);
    
    /**
     * Pathname is not an absolute path.
     */
    public static final ConvertError NOT_ABSOLUTE_PATH = new ConvertError(5);
    
    /**
     * No memory available. Since: 2.40
     */
    public static final ConvertError NO_MEMORY = new ConvertError(6);
    
    /**
     * An embedded NUL character is present in
     *     conversion output where a NUL-terminated string is expected.
     *     Since: 2.56
     */
    public static final ConvertError EMBEDDED_NUL = new ConvertError(7);
    
    public ConvertError(int value) {
        super(value);
    }
    
}
