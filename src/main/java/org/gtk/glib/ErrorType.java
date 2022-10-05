package org.gtk.glib;

/**
 * The possible errors, used in the {@code v_error} field
 * of {@link TokenValue}, when the token is a {@link TokenType#ERROR}.
 */
public class ErrorType extends io.github.jwharm.javagi.Enumeration {

    /**
     * unknown error
     */
    public static final ErrorType UNKNOWN = new ErrorType(0);
    
    /**
     * unexpected end of file
     */
    public static final ErrorType UNEXP_EOF = new ErrorType(1);
    
    /**
     * unterminated string constant
     */
    public static final ErrorType UNEXP_EOF_IN_STRING = new ErrorType(2);
    
    /**
     * unterminated comment
     */
    public static final ErrorType UNEXP_EOF_IN_COMMENT = new ErrorType(3);
    
    /**
     * non-digit character in a number
     */
    public static final ErrorType NON_DIGIT_IN_CONST = new ErrorType(4);
    
    /**
     * digit beyond radix in a number
     */
    public static final ErrorType DIGIT_RADIX = new ErrorType(5);
    
    /**
     * non-decimal floating point number
     */
    public static final ErrorType FLOAT_RADIX = new ErrorType(6);
    
    /**
     * malformed floating point number
     */
    public static final ErrorType FLOAT_MALFORMED = new ErrorType(7);
    
    public ErrorType(int value) {
        super(value);
    }
    
}