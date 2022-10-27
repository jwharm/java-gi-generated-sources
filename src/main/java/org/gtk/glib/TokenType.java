package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible types of token returned from each
 * g_scanner_get_next_token() call.
 */
public class TokenType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the end of the file
     */
    public static final TokenType EOF = new TokenType(0);
    
    /**
     * a '(' character
     */
    public static final TokenType LEFT_PAREN = new TokenType(40);
    
    /**
     * a ')' character
     */
    public static final TokenType RIGHT_PAREN = new TokenType(41);
    
    /**
     * a '{' character
     */
    public static final TokenType LEFT_CURLY = new TokenType(123);
    
    /**
     * a '}' character
     */
    public static final TokenType RIGHT_CURLY = new TokenType(125);
    
    /**
     * a '[' character
     */
    public static final TokenType LEFT_BRACE = new TokenType(91);
    
    /**
     * a ']' character
     */
    public static final TokenType RIGHT_BRACE = new TokenType(93);
    
    /**
     * a '=' character
     */
    public static final TokenType EQUAL_SIGN = new TokenType(61);
    
    /**
     * a ',' character
     */
    public static final TokenType COMMA = new TokenType(44);
    
    /**
     * not a token
     */
    public static final TokenType NONE = new TokenType(256);
    
    /**
     * an error occurred
     */
    public static final TokenType ERROR = new TokenType(257);
    
    /**
     * a character
     */
    public static final TokenType CHAR = new TokenType(258);
    
    /**
     * a binary integer
     */
    public static final TokenType BINARY = new TokenType(259);
    
    /**
     * an octal integer
     */
    public static final TokenType OCTAL = new TokenType(260);
    
    /**
     * an integer
     */
    public static final TokenType INT = new TokenType(261);
    
    /**
     * a hex integer
     */
    public static final TokenType HEX = new TokenType(262);
    
    /**
     * a floating point number
     */
    public static final TokenType FLOAT = new TokenType(263);
    
    /**
     * a string
     */
    public static final TokenType STRING = new TokenType(264);
    
    /**
     * a symbol
     */
    public static final TokenType SYMBOL = new TokenType(265);
    
    /**
     * an identifier
     */
    public static final TokenType IDENTIFIER = new TokenType(266);
    
    /**
     * a null identifier
     */
    public static final TokenType IDENTIFIER_NULL = new TokenType(267);
    
    /**
     * one line comment
     */
    public static final TokenType COMMENT_SINGLE = new TokenType(268);
    
    /**
     * multi line comment
     */
    public static final TokenType COMMENT_MULTI = new TokenType(269);
    
    public TokenType(int value) {
        super(value);
    }
}
