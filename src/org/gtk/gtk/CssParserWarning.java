package org.gtk.gtk;

/**
 * Warnings that can occur while parsing CSS.
 * <p>
 * Unlike {@code GtkCssParserError}s, warnings do not cause the parser to
 * skip any input, but they indicate issues that should be fixed.
 */
public enum CssParserWarning {

    /**
     * The given construct is
     *   deprecated and will be removed in a future version
     */
    DEPRECATED,
    
    /**
     * A syntax construct was used
     *   that should be avoided
     */
    SYNTAX,
    
    /**
     * A feature is not implemented
     */
    UNIMPLEMENTED;
    
    public static CssParserWarning fromValue(int value) {
        return switch(value) {
            case 0 -> DEPRECATED;
            case 1 -> SYNTAX;
            case 2 -> UNIMPLEMENTED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEPRECATED -> 0;
            case SYNTAX -> 1;
            case UNIMPLEMENTED -> 2;
        };
    }

}
