package org.gtk.gtk;

/**
 * Specifies which corner a child widget should be placed in when packed into
 * a {@code GtkScrolledWindow.}
 * <p>
 * This is effectively the opposite of where the scroll bars are placed.
 */
public enum CornerType {

    /**
     * Place the scrollbars on the right and bottom of the
     *   widget (default behaviour).
     */
    TOP_LEFT,
    
    /**
     * Place the scrollbars on the top and right of the
     *   widget.
     */
    BOTTOM_LEFT,
    
    /**
     * Place the scrollbars on the left and bottom of the
     *   widget.
     */
    TOP_RIGHT,
    
    /**
     * Place the scrollbars on the top and left of the
     *   widget.
     */
    BOTTOM_RIGHT;
    
    public static CornerType fromValue(int value) {
        return switch(value) {
            case 0 -> TOP_LEFT;
            case 1 -> BOTTOM_LEFT;
            case 2 -> TOP_RIGHT;
            case 3 -> BOTTOM_RIGHT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOP_LEFT -> 0;
            case BOTTOM_LEFT -> 1;
            case TOP_RIGHT -> 2;
            case BOTTOM_RIGHT -> 3;
        };
    }

}
