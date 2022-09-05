package org.gtk.gtk;

/**
 * Describes a type of line wrapping.
 */
public enum WrapMode {

    /**
     * do not wrap lines; just make the text area wider
     */
    NONE,
    
    /**
     * wrap text, breaking lines anywhere the cursor can
     *   appear (between characters, usually - if you want to be technical,
     *   between graphemes, see pango_get_log_attrs())
     */
    CHAR,
    
    /**
     * wrap text, breaking lines in between words
     */
    WORD,
    
    /**
     * wrap text, breaking lines in between words, or if
     *   that is not enough, also between graphemes
     */
    WORD_CHAR;
    
    public static WrapMode fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CHAR;
            case 2 -> WORD;
            case 3 -> WORD_CHAR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CHAR -> 1;
            case WORD -> 2;
            case WORD_CHAR -> 3;
        };
    }

}
