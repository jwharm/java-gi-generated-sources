package org.gtk.gdk;

/**
 * Used in {@code GdkDrag} to the reason of a cancelled DND operation.
 */
public enum DragCancelReason {

    /**
     * There is no suitable drop target.
     */
    NO_TARGET,
    
    /**
     * Drag cancelled by the user
     */
    USER_CANCELLED,
    
    /**
     * Unspecified error.
     */
    ERROR;
    
    public static DragCancelReason fromValue(int value) {
        return switch(value) {
            case 0 -> NO_TARGET;
            case 1 -> USER_CANCELLED;
            case 2 -> ERROR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NO_TARGET -> 0;
            case USER_CANCELLED -> 1;
            case ERROR -> 2;
        };
    }

}
