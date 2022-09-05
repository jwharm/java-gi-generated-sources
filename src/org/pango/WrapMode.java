package org.pango;

/**
 * `PangoWrapMode` describes how to wrap the lines of a `PangoLayout`
 * to the desired width.
 * 
 * For @PANGO_WRAP_WORD, Pango uses break opportunities that are determined
 * by the Unicode line breaking algorithm. For @PANGO_WRAP_CHAR, Pango allows
 * breaking at grapheme boundaries that are determined by the Unicode text
 * segmentation algorithm.
 */
public enum WrapMode {

    /**
     * wrap lines at word boundaries.
     */
    WORD,
    
    /**
     * wrap lines at character boundaries.
     */
    CHAR,
    
    /**
     * wrap lines at word boundaries, but fall back to
     *   character boundaries if there is not enough space for a full word.
     */
    WORD_CHAR;
    
    public static WrapMode fromValue(int value) {
        return switch(value) {
            case 0 -> WORD;
            case 1 -> CHAR;
            case 2 -> WORD_CHAR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case WORD -> 0;
            case CHAR -> 1;
            case WORD_CHAR -> 2;
        };
    }

}
