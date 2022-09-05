package org.gtk.gio;

/**
 * An error code used with %G_RESOLVER_ERROR in a #GError returned
 * from a #GResolver routine.
 */
public enum ResolverError {

    /**
     * the requested name/address/service was not
     *     found
     */
    NOT_FOUND,
    
    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    TEMPORARY_FAILURE,
    
    /**
     * unknown error
     */
    INTERNAL;
    
    public static ResolverError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_FOUND;
            case 1 -> TEMPORARY_FAILURE;
            case 2 -> INTERNAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_FOUND -> 0;
            case TEMPORARY_FAILURE -> 1;
            case INTERNAL -> 2;
        };
    }

}