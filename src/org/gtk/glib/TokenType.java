package org.gtk.glib;

/**
 * The possible types of token returned from each
 * g_scanner_get_next_token() call.
 */
public enum TokenType {

    /**
     * the end of the file
     */
    EOF,
    
    /**
     * a &<code>#39</code> (&<code>#39</code>  character
     */
    LEFT_PAREN,
    
    /**
     * a &<code>#39</code> )&<code>#39</code>  character
     */
    RIGHT_PAREN,
    
    /**
     * a &<code>#39</code> {&<code>#39</code>  character
     */
    LEFT_CURLY,
    
    /**
     * a &<code>#39</code> }&<code>#39</code>  character
     */
    RIGHT_CURLY,
    
    /**
     * a &<code>#39</code> 
     *       
     *       
     *         a &<code>#39</code> [&<code>#39</code>  character
     */
    LEFT_BRACE,
    
    /**
     * a &<code>#39</code> ]&<code>#39</code>  character
     */
    RIGHT_BRACE,
    
    /**
     * a &<code>#39</code> =&<code>#39</code>  character
     */
    EQUAL_SIGN,
    
    /**
     * a &<code>#39</code> ,&<code>#39</code>  character
     */
    COMMA,
    
    /**
     * not a token
     */
    NONE,
    
    /**
     * an error occurred
     */
    ERROR,
    
    /**
     * a character
     */
    CHAR,
    
    /**
     * a binary integer
     */
    BINARY,
    
    /**
     * an octal integer
     */
    OCTAL,
    
    /**
     * an integer
     */
    INT,
    
    /**
     * a hex integer
     */
    HEX,
    
    /**
     * a floating point number
     */
    FLOAT,
    
    /**
     * a string
     */
    STRING,
    
    /**
     * a symbol
     */
    SYMBOL,
    
    /**
     * an identifier
     */
    IDENTIFIER,
    
    /**
     * a null identifier
     */
    IDENTIFIER_NULL,
    
    /**
     * one line comment
     */
    COMMENT_SINGLE,
    
    /**
     * multi line comment
     */
    COMMENT_MULTI;
    
    public static TokenType fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case EOF -> 0;
            case LEFT_PAREN -> 40;
            case RIGHT_PAREN -> 41;
            case LEFT_CURLY -> 123;
            case RIGHT_CURLY -> 125;
            case LEFT_BRACE -> 91;
            case RIGHT_BRACE -> 93;
            case EQUAL_SIGN -> 61;
            case COMMA -> 44;
            case NONE -> 256;
            case ERROR -> 257;
            case CHAR -> 258;
            case BINARY -> 259;
            case OCTAL -> 260;
            case INT -> 261;
            case HEX -> 262;
            case FLOAT -> 263;
            case STRING -> 264;
            case SYMBOL -> 265;
            case IDENTIFIER -> 266;
            case IDENTIFIER_NULL -> 267;
            case COMMENT_SINGLE -> 268;
            case COMMENT_MULTI -> 269;
        };
    }

}
