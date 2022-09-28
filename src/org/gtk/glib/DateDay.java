package org.gtk.glib;

/**
 * Integer representing a day of the month; between 1 and 31.
 * <p>
 * The {@code G_DATE_BAD_DAY} value represents an invalid day of the month.
 */
public class DateDay {
    private byte value;
    
    public DateDay(byte value) {
        this.value = value;
    }
    
    public byte getValue() {
        return this.value;
    }
    
    public void setValue(byte value) {
        this.value = value;
    }
    
    public static byte[] getValues(DateDay[] array) {
        byte[] values = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
