package org.gtk.glib;

/**
 * The possible errors, used in the @v_error field
 * of {@link org.gtk.glib.TokenValue}  when the token is a {@link org.gtk.glib.TokenType<code>#ERROR</code>
 */
public enum ErrorType {

    /**
     * unknown error
     */
    UNKNOWN,
    
    /**
     * unexpected end of file
     */
    UNEXP_EOF,
    
    /**
     * unterminated string constant
     */
    UNEXP_EOF_IN_STRING,
    
    /**
     * unterminated comment
     */
    UNEXP_EOF_IN_COMMENT,
    
    /**
     * non-digit character in a number
     */
    NON_DIGIT_IN_CONST,
    
    /**
     * digit beyond radix in a number
     */
    DIGIT_RADIX,
    
    /**
     * non-decimal floating point number
     */
    FLOAT_RADIX,
    
    /**
     * malformed floating point number
     */
    FLOAT_MALFORMED;
    
    public static ErrorType fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> UNEXP_EOF;
            case 2 -> UNEXP_EOF_IN_STRING;
            case 3 -> UNEXP_EOF_IN_COMMENT;
            case 4 -> NON_DIGIT_IN_CONST;
            case 5 -> DIGIT_RADIX;
            case 6 -> FLOAT_RADIX;
            case 7 -> FLOAT_MALFORMED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case UNEXP_EOF -> 1;
            case UNEXP_EOF_IN_STRING -> 2;
            case UNEXP_EOF_IN_COMMENT -> 3;
            case NON_DIGIT_IN_CONST -> 4;
            case DIGIT_RADIX -> 5;
            case FLOAT_RADIX -> 6;
            case FLOAT_MALFORMED -> 7;
        };
    }

}
