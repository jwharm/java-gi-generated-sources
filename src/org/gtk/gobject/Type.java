package org.gtk.gobject;

/**
 * A numerical value which represents the unique identifier of a registered
 * type.
 */
public class Type {
    private long value;
    
    public Type(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return this.value;
    }
    
    public void setValue(long value) {
        this.value = value;
    }
    
    public static long[] getValues(Type[] array) {
        long[] values = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
