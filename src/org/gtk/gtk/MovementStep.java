package org.gtk.gtk;

/**
 * Passed as argument to various keybinding signals for moving the
 * cursor position.
 */
public enum MovementStep {

    /**
     * Move forward or back by graphemes
     */
    LOGICAL_POSITIONS,
    
    /**
     * Move left or right by graphemes
     */
    VISUAL_POSITIONS,
    
    /**
     * Move forward or back by words
     */
    WORDS,
    
    /**
     * Move up or down lines (wrapped lines)
     */
    DISPLAY_LINES,
    
    /**
     * Move to either end of a line
     */
    DISPLAY_LINE_ENDS,
    
    /**
     * Move up or down paragraphs (newline-ended lines)
     */
    PARAGRAPHS,
    
    /**
     * Move to either end of a paragraph
     */
    PARAGRAPH_ENDS,
    
    /**
     * Move by pages
     */
    PAGES,
    
    /**
     * Move to ends of the buffer
     */
    BUFFER_ENDS,
    
    /**
     * Move horizontally by pages
     */
    HORIZONTAL_PAGES;
    
    public static MovementStep fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOGICAL_POSITIONS -> 0;
            case VISUAL_POSITIONS -> 1;
            case WORDS -> 2;
            case DISPLAY_LINES -> 3;
            case DISPLAY_LINE_ENDS -> 4;
            case PARAGRAPHS -> 5;
            case PARAGRAPH_ENDS -> 6;
            case PAGES -> 7;
            case BUFFER_ENDS -> 8;
            case HORIZONTAL_PAGES -> 9;
        };
    }

}
