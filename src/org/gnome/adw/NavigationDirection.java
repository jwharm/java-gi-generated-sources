package org.gnome.adw;

/**
 * Describes the direction of a swipe navigation gesture.
 */
public enum NavigationDirection {

    /**
     * Corresponds to start or top, depending on orientation and text direction
     */
    BACK,
    
    /**
     * Corresponds to end or bottom, depending on orientation and text direction
     */
    FORWARD;
    
    public static NavigationDirection fromValue(int value) {
        return switch(value) {
            case 0 -> BACK;
            case 1 -> FORWARD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BACK -> 0;
            case FORWARD -> 1;
        };
    }

}
