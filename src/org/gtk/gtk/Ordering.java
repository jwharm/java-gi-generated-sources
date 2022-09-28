package org.gtk.gtk;

/**
 * Describes the way two values can be compared.
 * <p>
 * These values can be used with a {@code GLib.CompareFunc}. However,
 * a {@code GCompareFunc} is allowed to return any integer values.
 * For converting such a value to a {@code GtkOrdering} value, use
 * {@link Gtk#Ordering}.
 */
public class Ordering {

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
    
    private int value;
    
    public Ordering(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Ordering[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
