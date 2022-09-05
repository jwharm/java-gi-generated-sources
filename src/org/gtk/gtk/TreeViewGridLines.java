package org.gtk.gtk;

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public enum TreeViewGridLines {

    /**
     * No grid lines.
     */
    NONE,
    
    /**
     * Horizontal grid lines.
     */
    HORIZONTAL,
    
    /**
     * Vertical grid lines.
     */
    VERTICAL,
    
    /**
     * Horizontal and vertical grid lines.
     */
    BOTH;
    
    public static TreeViewGridLines fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            case 3 -> BOTH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case HORIZONTAL -> 1;
            case VERTICAL -> 2;
            case BOTH -> 3;
        };
    }

}
