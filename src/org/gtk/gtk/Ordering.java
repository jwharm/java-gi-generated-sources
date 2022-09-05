package org.gtk.gtk;

/**
 * Describes the way two values can be compared.
 * 
 * These values can be used with a [callback@GLib.CompareFunc]. However,
 * a `GCompareFunc` is allowed to return any integer values.
 * For converting such a value to a `GtkOrdering` value, use
 * [func@Gtk.Ordering.from_cmpfunc].
 */
public enum Ordering {

    /**
     * the first value is smaller than the second
     */
    SMALLER,
    
    /**
     * the two values are equal
     */
    EQUAL,
    
    /**
     * the first value is larger than the second
     */
    LARGER;
    
    public static Ordering fromValue(int value) {
        return switch(value) {
            case -1 -> SMALLER;
            case 0 -> EQUAL;
            case 1 -> LARGER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SMALLER -> -1;
            case EQUAL -> 0;
            case LARGER -> 1;
        };
    }

}
