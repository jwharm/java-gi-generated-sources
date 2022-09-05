package org.gtk.glib;

/**
 * The possible statuses of a one-time initialization function
 * controlled by a #GOnce struct.
 */
public enum OnceStatus {

    /**
     * the function has not been called yet.
     */
    NOTCALLED,
    
    /**
     * the function call is currently in progress.
     */
    PROGRESS,
    
    /**
     * the function has been called.
     */
    READY;
    
    public static OnceStatus fromValue(int value) {
        return switch(value) {
            case 0 -> NOTCALLED;
            case 1 -> PROGRESS;
            case 2 -> READY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOTCALLED -> 0;
            case PROGRESS -> 1;
            case READY -> 2;
        };
    }

}
