package org.gtk.gio;

/**
 * An error code used with %G_RESOURCE_ERROR in a #GError returned
 * from a #GResource routine.
 */
public enum ResourceError {

    /**
     * no file was found at the requested path
     */
    NOT_FOUND,
    
    /**
     * unknown error
     */
    INTERNAL;
    
    public static ResourceError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_FOUND;
            case 1 -> INTERNAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_FOUND -> 0;
            case INTERNAL -> 1;
        };
    }

}
