package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible types of token returned from each
 * g_scanner_get_next_token() call.
 */
public enum TokenType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the end of the file
     */
    EOF(0),
    
    /**
     * a '(' character
     */
    LEFT_PAREN(40),
    
    /**
     * a ')' character
     */
    RIGHT_PAREN(41),
    
    /**
     * a '{' character
     */
    LEFT_CURLY(123),
    
    /**
     * a '}' character
     */
    RIGHT_CURLY(125),
    
    /**
     * a '[' character
     */
    LEFT_BRACE(91),
    
    /**
     * a ']' character
     */
    RIGHT_BRACE(93),
    
    /**
     * a '=' character
     */
    EQUAL_SIGN(61),
    
    /**
     * a ',' character
     */
    COMMA(44),
    
    /**
     * not a token
     */
    NONE(256),
    
    /**
     * an error occurred
     */
    ERROR(257),
    
    /**
     * a character
     */
    CHAR(258),
    
    /**
     * a binary integer
     */
    BINARY(259),
    
    /**
     * an octal integer
     */
    OCTAL(260),
    
    /**
     * an integer
     */
    INT(261),
    
    /**
     * a hex integer
     */
    HEX(262),
    
    /**
     * a floating point number
     */
    FLOAT(263),
    
    /**
     * a string
     */
    STRING(264),
    
    /**
     * a symbol
     */
    SYMBOL(265),
    
    /**
     * an identifier
     */
    IDENTIFIER(266),
    
    /**
     * a null identifier
     */
    IDENTIFIER_NULL(267),
    
    /**
     * one line comment
     */
    COMMENT_SINGLE(268),
    
    /**
     * multi line comment
     */
    COMMENT_MULTI(269);
    
    private static final java.lang.String C_TYPE_NAME = "GTokenType";
    
    private final int value;
    
    /**
     * Create a new TokenType for the provided value
     * @param numeric value the enum value
     */
    TokenType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TokenType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TokenType of(int value) {
        return switch (value) {
            case 0 -> EOF;
            case 40 -> LEFT_PAREN;
            case 41 -> RIGHT_PAREN;
            case 123 -> LEFT_CURLY;
            case 125 -> RIGHT_CURLY;
            case 91 -> LEFT_BRACE;
            case 93 -> RIGHT_BRACE;
            case 61 -> EQUAL_SIGN;
            case 44 -> COMMA;
            case 256 -> NONE;
            case 257 -> ERROR;
            case 258 -> CHAR;
            case 259 -> BINARY;
            case 260 -> OCTAL;
            case 261 -> INT;
            case 262 -> HEX;
            case 263 -> FLOAT;
            case 264 -> STRING;
            case 265 -> SYMBOL;
            case 266 -> IDENTIFIER;
            case 267 -> IDENTIFIER_NULL;
            case 268 -> COMMENT_SINGLE;
            case 269 -> COMMENT_MULTI;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
