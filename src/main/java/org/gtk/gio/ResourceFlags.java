package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GResourceFlags give information about a particular file inside a resource
 * bundle.
 * @version 2.32
 */
public class ResourceFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GResourceFlags";
    
    /**
     * No flags set.
     */
    public static final ResourceFlags NONE = new ResourceFlags(0);
    
    /**
     * The file is compressed.
     */
    public static final ResourceFlags COMPRESSED = new ResourceFlags(1);
    
    public ResourceFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ResourceFlags combined(ResourceFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ResourceFlags combined(ResourceFlags mask, ResourceFlags... masks) {
        for (ResourceFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
