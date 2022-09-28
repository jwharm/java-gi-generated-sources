package org.gtk.glib;

/**
 * A GQuark is a non-zero integer which uniquely identifies a
 * particular string. A GQuark value of zero is associated to {@code null}.
 */
public class Quark {
    private int value;
    
    public Quark(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Quark[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
