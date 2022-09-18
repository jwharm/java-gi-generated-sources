package org.gtk.gio;

/**
 * An error code used with <code>G_RESOURCE_ERROR</code> in a {@link org.gtk.glib.Error} returned
 * from a {@link org.gtk.gio.Resource} routine.
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
