package org.gtk.gio;

/**
 * An error code used with {@code G_RESOURCE_ERROR} in a {@link org.gtk.glib.Error} returned
 * from a {@link Resource} routine.
 */
public class ResourceError extends io.github.jwharm.javagi.Enumeration {

    /**
     * no file was found at the requested path
     */
    public static final ResourceError NOT_FOUND = new ResourceError(0);
    
    /**
     * unknown error
     */
    public static final ResourceError INTERNAL = new ResourceError(1);
    
    public ResourceError(int value) {
        super(value);
    }
    
}
