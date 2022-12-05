package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Passed to various keybinding signals for deleting text.
 */
public enum DeleteType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Delete characters.
     */
    CHARS(0),
    /**
     * Delete only the portion of the word to the
     *   left/right of cursor if we’re in the middle of a word.
     */
    WORD_ENDS(1),
    /**
     * Delete words.
     */
    WORDS(2),
    /**
     * Delete display-lines. Display-lines
     *   refers to the visible lines, with respect to the current line
     *   breaks. As opposed to paragraphs, which are defined by line
     *   breaks in the input.
     */
    DISPLAY_LINES(3),
    /**
     * Delete only the portion of the
     *   display-line to the left/right of cursor.
     */
    DISPLAY_LINE_ENDS(4),
    /**
     * Delete to the end of the
     *   paragraph. Like C-k in Emacs (or its reverse).
     */
    PARAGRAPH_ENDS(5),
    /**
     * Delete entire line. Like C-k in pico.
     */
    PARAGRAPHS(6),
    /**
     * Delete only whitespace. Like M-\\ in Emacs.
     */
    WHITESPACE(7);
    
    private static final java.lang.String C_TYPE_NAME = "GtkDeleteType";
    
    private final int value;
    DeleteType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DeleteType of(int value) {
        return switch (value) {
            case 0 -> CHARS;
            case 1 -> WORD_ENDS;
            case 2 -> WORDS;
            case 3 -> DISPLAY_LINES;
            case 4 -> DISPLAY_LINE_ENDS;
            case 5 -> PARAGRAPH_ENDS;
            case 6 -> PARAGRAPHS;
            case 7 -> WHITESPACE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
