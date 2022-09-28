package org.gtk.gtk;

/**
 * Describes the way two values can be compared.
 * <p>
 * These values can be used with a {@code GLib.CompareFunc}. However,
 * a {@code GCompareFunc} is allowed to return any integer values.
 * For converting such a value to a {@code GtkOrdering} value, use
 * {@link Gtk#Ordering}.
 */
public class Ordering extends io.github.jwharm.javagi.Enumeration {

    /**
     * the first value is smaller than the second
     */
    public static final Ordering SMALLER = new Ordering(-1);
    
    /**
     * the two values are equal
     */
    public static final Ordering EQUAL = new Ordering(0);
    
    /**
     * the first value is larger than the second
     */
    public static final Ordering LARGER = new Ordering(1);
    
    public Ordering(int value) {
        super(value);
    }
    
}
