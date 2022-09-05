package org.gtk.gtk;

/**
 * An enum for determining where a dropped item goes.
 */
public enum IconViewDropPosition {

    /**
     * no drop possible
     */
    NO_DROP,
    
    /**
     * dropped item replaces the item
     */
    DROP_INTO,
    
    /**
     * dropped item is inserted to the left
     */
    DROP_LEFT,
    
    /**
     * dropped item is inserted to the right
     */
    DROP_RIGHT,
    
    /**
     * dropped item is inserted above
     */
    DROP_ABOVE,
    
    /**
     * dropped item is inserted below
     */
    DROP_BELOW;
    
    public static IconViewDropPosition fromValue(int value) {
        return switch(value) {
            case 0 -> NO_DROP;
            case 1 -> DROP_INTO;
            case 2 -> DROP_LEFT;
            case 3 -> DROP_RIGHT;
            case 4 -> DROP_ABOVE;
            case 5 -> DROP_BELOW;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NO_DROP -> 0;
            case DROP_INTO -> 1;
            case DROP_LEFT -> 2;
            case DROP_RIGHT -> 3;
            case DROP_ABOVE -> 4;
            case DROP_BELOW -> 5;
        };
    }

}
