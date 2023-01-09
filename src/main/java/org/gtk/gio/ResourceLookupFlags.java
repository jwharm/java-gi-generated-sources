package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GResourceLookupFlags determine how resource path lookups are handled.
 * @version 2.32
 */
public class ResourceLookupFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GResourceLookupFlags";
    
    /**
     * No flags set.
     */
    public static final ResourceLookupFlags NONE = new ResourceLookupFlags(0);
    
    /**
     * Create a new ResourceLookupFlags with the provided value
     */
    public ResourceLookupFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ResourceLookupFlags or(ResourceLookupFlags... masks) {
        int value = this.getValue();
        for (ResourceLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResourceLookupFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ResourceLookupFlags combined(ResourceLookupFlags mask, ResourceLookupFlags... masks) {
        int value = mask.getValue();
        for (ResourceLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResourceLookupFlags(value);
    }
}
