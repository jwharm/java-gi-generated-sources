package org.gtk.glib;

/**
 * A value representing an interval of time, in microseconds.
 */
public class TimeSpan {
    private long value;
    
    public TimeSpan(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return this.value;
    }
    
    public void setValue(long value) {
        this.value = value;
    }
    
    public static long[] getValues(TimeSpan[] array) {
        long[] values = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
