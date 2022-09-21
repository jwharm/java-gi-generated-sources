package org.gtk.gsk;

/**
 * The corner indices used by {@code GskRoundedRect}.
 */
public enum Corner {

    /**
     * The top left corner
     */
    TOP_LEFT,
    
    /**
     * The top right corner
     */
    TOP_RIGHT,
    
    /**
     * The bottom right corner
     */
    BOTTOM_RIGHT,
    
    /**
     * The bottom left corner
     */
    BOTTOM_LEFT;
    
    public static Corner fromValue(int value) {
        return switch(value) {
            case 0 -> TOP_LEFT;
            case 1 -> TOP_RIGHT;
            case 2 -> BOTTOM_RIGHT;
            case 3 -> BOTTOM_LEFT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOP_LEFT -> 0;
            case TOP_RIGHT -> 1;
            case BOTTOM_RIGHT -> 2;
            case BOTTOM_LEFT -> 3;
        };
    }

}
