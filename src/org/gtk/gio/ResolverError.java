package org.gtk.gio;

/**
 * An error code used with {@code G_RESOLVER_ERROR} in a {@link org.gtk.glib.Error} returned
 * from a {@link Resolver} routine.
 */
public class ResolverError {

    /**
     * the requested name/address/service was not
     *     found
     */
    public static final ResolverError NOT_FOUND = new ResolverError(0);
    
    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    public static final ResolverError TEMPORARY_FAILURE = new ResolverError(1);
    
    /**
     * unknown error
     */
    public static final ResolverError INTERNAL = new ResolverError(2);
    
    private int value;
    
    public ResolverError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ResolverError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
