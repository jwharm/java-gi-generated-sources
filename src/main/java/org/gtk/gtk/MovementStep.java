package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Passed as argument to various keybinding signals for moving the
 * cursor position.
 */
public enum MovementStep implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Move forward or back by graphemes
     */
    LOGICAL_POSITIONS(0),
    
    /**
     * Move left or right by graphemes
     */
    VISUAL_POSITIONS(1),
    
    /**
     * Move forward or back by words
     */
    WORDS(2),
    
    /**
     * Move up or down lines (wrapped lines)
     */
    DISPLAY_LINES(3),
    
    /**
     * Move to either end of a line
     */
    DISPLAY_LINE_ENDS(4),
    
    /**
     * Move up or down paragraphs (newline-ended lines)
     */
    PARAGRAPHS(5),
    
    /**
     * Move to either end of a paragraph
     */
    PARAGRAPH_ENDS(6),
    
    /**
     * Move by pages
     */
    PAGES(7),
    
    /**
     * Move to ends of the buffer
     */
    BUFFER_ENDS(8),
    
    /**
     * Move horizontally by pages
     */
    HORIZONTAL_PAGES(9);
    
    private static final java.lang.String C_TYPE_NAME = "GtkMovementStep";
    
    private final int value;
    
    /**
     * Create a new MovementStep for the provided value
     * @param numeric value the enum value
     */
    MovementStep(int value) {
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
     * Create a new MovementStep for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static MovementStep of(int value) {
        return switch (value) {
            case 0 -> LOGICAL_POSITIONS;
            case 1 -> VISUAL_POSITIONS;
            case 2 -> WORDS;
            case 3 -> DISPLAY_LINES;
            case 4 -> DISPLAY_LINE_ENDS;
            case 5 -> PARAGRAPHS;
            case 6 -> PARAGRAPH_ENDS;
            case 7 -> PAGES;
            case 8 -> BUFFER_ENDS;
            case 9 -> HORIZONTAL_PAGES;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
