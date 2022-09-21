package org.gtk.gtk;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@code GesturePan}.
 */
public enum Orientation {

    /**
     * The element is in horizontal orientation.
     */
    HORIZONTAL,
    
    /**
     * The element is in vertical orientation.
     */
    VERTICAL;
    
    public static Orientation fromValue(int value) {
        return switch(value) {
            case 0 -> HORIZONTAL;
            case 1 -> VERTICAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case HORIZONTAL -> 0;
            case VERTICAL -> 1;
        };
    }

}
