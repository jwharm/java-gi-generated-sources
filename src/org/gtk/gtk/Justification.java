package org.gtk.gtk;

/**
 * Used for justifying the text inside a [class@Label] widget.
 */
public enum Justification {

    /**
     * The text is placed at the left edge of the label.
     */
    LEFT,
    
    /**
     * The text is placed at the right edge of the label.
     */
    RIGHT,
    
    /**
     * The text is placed in the center of the label.
     */
    CENTER,
    
    /**
     * The text is placed is distributed across the label.
     */
    FILL;
    
    public static Justification fromValue(int value) {
        return switch(value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> CENTER;
            case 3 -> FILL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LEFT -> 0;
            case RIGHT -> 1;
            case CENTER -> 2;
            case FILL -> 3;
        };
    }

}
