package org.gtk.gobject;

/**
 * Flags to be passed to g_object_bind_property() or
 * g_object_bind_property_full().
 * <p>
 * This enumeration can be extended at later date.
 */
public class BindingFlags {

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
    
    private int value;
    
    public BindingFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BindingFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BindingFlags combined(BindingFlags mask) {
        return new BindingFlags(this.getValue() | mask.getValue());
    }
    
    public static BindingFlags combined(BindingFlags mask, BindingFlags... masks) {
        int value = mask.getValue();
        for (BindingFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BindingFlags(value);
    }
    
}
