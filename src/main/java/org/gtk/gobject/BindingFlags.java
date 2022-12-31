package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to be passed to g_object_bind_property() or
 * g_object_bind_property_full().
 * <p>
 * This enumeration can be extended at later date.
 * @version 2.26
 */
public class BindingFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GBindingFlags";
    
    /**
     * The default binding; if the source property
     *   changes, the target property is updated with its value.
     */
    public static final BindingFlags DEFAULT = new BindingFlags(0);
    
    /**
     * Bidirectional binding; if either the
     *   property of the source or the property of the target changes,
     *   the other is updated.
     */
    public static final BindingFlags BIDIRECTIONAL = new BindingFlags(1);
    
    /**
     * Synchronize the values of the source and
     *   target properties when creating the binding; the direction of
     *   the synchronization is always from the source to the target.
     */
    public static final BindingFlags SYNC_CREATE = new BindingFlags(2);
    
    /**
     * If the two properties being bound are
     *   booleans, setting one to {@code true} will result in the other being
     *   set to {@code false} and vice versa. This flag will only work for
     *   boolean properties, and cannot be used when passing custom
     *   transformation functions to g_object_bind_property_full().
     */
    public static final BindingFlags INVERT_BOOLEAN = new BindingFlags(4);
    
    public BindingFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BindingFlags or(BindingFlags... masks) {
        int value = this.getValue();
        for (BindingFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BindingFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BindingFlags combined(BindingFlags mask, BindingFlags... masks) {
        int value = mask.getValue();
        for (BindingFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BindingFlags(value);
    }
}
