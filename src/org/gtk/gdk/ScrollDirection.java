package org.gtk.gdk;

/**
 * Specifies the direction for scroll events.
 */
public enum ScrollDirection {

    /**
     * the surface is scrolled up.
     */
    UP,
    
    /**
     * the surface is scrolled down.
     */
    DOWN,
    
    /**
     * the surface is scrolled to the left.
     */
    LEFT,
    
    /**
     * the surface is scrolled to the right.
     */
    RIGHT,
    
    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    SMOOTH;
    
    public static ScrollDirection fromValue(int value) {
        return switch(value) {
            case 0 -> UP;
            case 1 -> DOWN;
            case 2 -> LEFT;
            case 3 -> RIGHT;
            case 4 -> SMOOTH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UP -> 0;
            case DOWN -> 1;
            case LEFT -> 2;
            case RIGHT -> 3;
            case SMOOTH -> 4;
        };
    }

}
