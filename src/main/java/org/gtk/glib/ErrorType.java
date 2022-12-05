package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible errors, used in the {@code v_error} field
 * of {@link TokenValue}, when the token is a {@link TokenType#ERROR}.
 */
public enum ErrorType implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown error
     */
    UNKNOWN(0),
    /**
     * unexpected end of file
     */
    UNEXP_EOF(1),
    /**
     * unterminated string constant
     */
    UNEXP_EOF_IN_STRING(2),
    /**
     * unterminated comment
     */
    UNEXP_EOF_IN_COMMENT(3),
    /**
     * non-digit character in a number
     */
    NON_DIGIT_IN_CONST(4),
    /**
     * digit beyond radix in a number
     */
    DIGIT_RADIX(5),
    /**
     * non-decimal floating point number
     */
    FLOAT_RADIX(6),
    /**
     * malformed floating point number
     */
    FLOAT_MALFORMED(7);
    
    private static final java.lang.String C_TYPE_NAME = "GErrorType";
    
    private final int value;
    ErrorType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ErrorType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> UNEXP_EOF;
            case 2 -> UNEXP_EOF_IN_STRING;
            case 3 -> UNEXP_EOF_IN_COMMENT;
            case 4 -> NON_DIGIT_IN_CONST;
            case 5 -> DIGIT_RADIX;
            case 6 -> FLOAT_RADIX;
            case 7 -> FLOAT_MALFORMED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
