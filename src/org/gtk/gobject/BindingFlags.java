package org.gtk.gobject;

/**
 * Flags to be passed to g_object_bind_property() or
 * g_object_bind_property_full().
 * 
 * This enumeration can be extended at later date.
 */
public class BindingFlags {

    /**
     * The default binding; if the source property
     *   changes, the target property is updated with its value.
     */
    public static final int DEFAULT = 0;
    
    /**
     * Bidirectional binding; if either the
     *   property of the source or the property of the target changes,
     *   the other is updated.
     */
    public static final int BIDIRECTIONAL = 1;
    
    /**
     * Synchronize the values of the source and
     *   target properties when creating the binding; the direction of
     *   the synchronization is always from the source to the target.
     */
    public static final int SYNC_CREATE = 2;
    
    /**
     * If the two properties being bound are
     *   booleans, setting one to %TRUE will result in the other being
     *   set to %FALSE and vice versa. This flag will only work for
     *   boolean properties, and cannot be used when passing custom
     *   transformation functions to g_object_bind_property_full().
     */
    public static final int INVERT_BOOLEAN = 4;
    
}
