package org.gtk.gio;

/**
 * An error code used with {@code G_RESOURCE_ERROR} in a {@link org.gtk.glib.Error} returned
 * from a {@link Resource} routine.
 */
public class ResourceError {

    /**
     * no file was found at the requested path
     */
    public static final ResourceError NOT_FOUND = new ResourceError(0);
    
    /**
     * unknown error
     */
    public static final ResourceError INTERNAL = new ResourceError(1);
    
    private int value;
    
    public ResourceError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ResourceError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
