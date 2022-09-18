package org.gtk.gtk;

/**
 * Passed to various keybinding signals for deleting text.
 */
public enum DeleteType {

    /**
     * Delete characters.
     */
    CHARS,
    
    /**
     * Delete only the portion of the word to the
     *   left/right of cursor if we&<code>#8217</code> re in the middle of a word.
     */
    WORD_ENDS,
    
    /**
     * Delete words.
     */
    WORDS,
    
    /**
     * Delete display-lines. Display-lines
     *   refers to the visible lines, with respect to the current line
     *   breaks. As opposed to paragraphs, which are defined by line
     *   breaks in the input.
     */
    DISPLAY_LINES,
    
    /**
     * Delete only the portion of the
     *   display-line to the left/right of cursor.
     */
    DISPLAY_LINE_ENDS,
    
    /**
     * Delete to the end of the
     *   paragraph. Like C-k in Emacs (or its reverse).
     */
    PARAGRAPH_ENDS,
    
    /**
     * Delete entire line. Like C-k in pico.
     */
    PARAGRAPHS,
    
    /**
     * Delete only whitespace. Like M-\\ in Emacs.
     */
    WHITESPACE;
    
    public static DeleteType fromValue(int value) {
        return switch(value) {
            case 0 -> CHARS;
            case 1 -> WORD_ENDS;
            case 2 -> WORDS;
            case 3 -> DISPLAY_LINES;
            case 4 -> DISPLAY_LINE_ENDS;
            case 5 -> PARAGRAPH_ENDS;
            case 6 -> PARAGRAPHS;
            case 7 -> WHITESPACE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CHARS -> 0;
            case WORD_ENDS -> 1;
            case WORDS -> 2;
            case DISPLAY_LINES -> 3;
            case DISPLAY_LINE_ENDS -> 4;
            case PARAGRAPH_ENDS -> 5;
            case PARAGRAPHS -> 6;
            case WHITESPACE -> 7;
        };
    }

}
