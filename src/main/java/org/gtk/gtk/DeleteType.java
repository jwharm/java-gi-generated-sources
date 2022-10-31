package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Passed to various keybinding signals for deleting text.
 */
public class DeleteType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkDeleteType";
    
    /**
     * Delete characters.
     */
    public static final DeleteType CHARS = new DeleteType(0);
    
    /**
     * Delete only the portion of the word to the
     *   left/right of cursor if we’re in the middle of a word.
     */
    public static final DeleteType WORD_ENDS = new DeleteType(1);
    
    /**
     * Delete words.
     */
    public static final DeleteType WORDS = new DeleteType(2);
    
    /**
     * Delete display-lines. Display-lines
     *   refers to the visible lines, with respect to the current line
     *   breaks. As opposed to paragraphs, which are defined by line
     *   breaks in the input.
     */
    public static final DeleteType DISPLAY_LINES = new DeleteType(3);
    
    /**
     * Delete only the portion of the
     *   display-line to the left/right of cursor.
     */
    public static final DeleteType DISPLAY_LINE_ENDS = new DeleteType(4);
    
    /**
     * Delete to the end of the
     *   paragraph. Like C-k in Emacs (or its reverse).
     */
    public static final DeleteType PARAGRAPH_ENDS = new DeleteType(5);
    
    /**
     * Delete entire line. Like C-k in pico.
     */
    public static final DeleteType PARAGRAPHS = new DeleteType(6);
    
    /**
     * Delete only whitespace. Like M-\\ in Emacs.
     */
    public static final DeleteType WHITESPACE = new DeleteType(7);
    
    public DeleteType(int value) {
        super(value);
    }
}
