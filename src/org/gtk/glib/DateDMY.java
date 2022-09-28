package org.gtk.glib;

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public class DateDMY {

    /**
     * a day
     */
    public static final DateDMY DAY = new DateDMY(0);
    
    /**
     * a month
     */
    public static final DateDMY MONTH = new DateDMY(1);
    
    /**
     * a year
     */
    public static final DateDMY YEAR = new DateDMY(2);
    
    private int value;
    
    public DateDMY(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DateDMY[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
