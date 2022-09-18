package org.gtk.glib;

/**
 * Error codes returned by markup parsing.
 */
public enum MarkupError {

    /**
     * text being parsed was not valid UTF-8
     */
    BAD_UTF8,
    
    /**
     * document contained nothing, or only whitespace
     */
    EMPTY,
    
    /**
     * document was ill-formed
     */
    PARSE,
    
    /**
     * error should be set by {@link org.gtk.glib.MarkupParser}     functions; element wasn&<code>#39</code> t known
     */
    UNKNOWN_ELEMENT,
    
    /**
     * error should be set by {@link org.gtk.glib.MarkupParser}     functions; attribute wasn&<code>#39</code> t known
     */
    UNKNOWN_ATTRIBUTE,
    
    /**
     * error should be set by {@link org.gtk.glib.MarkupParser}     functions; content was invalid
     */
    INVALID_CONTENT,
    
    /**
     * error should be set by {@link org.gtk.glib.MarkupParser}     functions; a required attribute was missing
     */
    MISSING_ATTRIBUTE;
    
    public static MarkupError fromValue(int value) {
        return switch(value) {
            case 0 -> BAD_UTF8;
            case 1 -> EMPTY;
            case 2 -> PARSE;
            case 3 -> UNKNOWN_ELEMENT;
            case 4 -> UNKNOWN_ATTRIBUTE;
            case 5 -> INVALID_CONTENT;
            case 6 -> MISSING_ATTRIBUTE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BAD_UTF8 -> 0;
            case EMPTY -> 1;
            case PARSE -> 2;
            case UNKNOWN_ELEMENT -> 3;
            case UNKNOWN_ATTRIBUTE -> 4;
            case INVALID_CONTENT -> 5;
            case MISSING_ATTRIBUTE -> 6;
        };
    }

}
