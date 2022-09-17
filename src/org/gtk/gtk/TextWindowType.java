package org.gtk.gtk;

/**
 * Used to reference the parts of <code>GtkTextView</code>.
 */
public enum TextWindowType {

    /**
     * Window that floats over scrolling areas.
     */
    WIDGET,
    
    /**
     * Scrollable text window.
     */
    TEXT,
    
    /**
     * Left side border window.
     */
    LEFT,
    
    /**
     * Right side border window.
     */
    RIGHT,
    
    /**
     * Top border window.
     */
    TOP,
    
    /**
     * Bottom border window.
     */
    BOTTOM;
    
    public static TextWindowType fromValue(int value) {
        return switch(value) {
            case 1 -> WIDGET;
            case 2 -> TEXT;
            case 3 -> LEFT;
            case 4 -> RIGHT;
            case 5 -> TOP;
            case 6 -> BOTTOM;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case WIDGET -> 1;
            case TEXT -> 2;
            case LEFT -> 3;
            case RIGHT -> 4;
            case TOP -> 5;
            case BOTTOM -> 6;
        };
    }

}
