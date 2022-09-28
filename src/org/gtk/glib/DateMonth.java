package org.gtk.glib;

/**
 * Enumeration representing a month; values are {@link DateMonth#JANUARY},
 * {@link DateMonth#FEBRUARY}, etc. {@link DateMonth#BAD_MONTH} is the invalid value.
 */
public class DateMonth {

    /**
     * invalid value
     */
    public static final DateMonth BAD_MONTH = new DateMonth(0);
    
    /**
     * January
     */
    public static final DateMonth JANUARY = new DateMonth(1);
    
    /**
     * February
     */
    public static final DateMonth FEBRUARY = new DateMonth(2);
    
    /**
     * March
     */
    public static final DateMonth MARCH = new DateMonth(3);
    
    /**
     * April
     */
    public static final DateMonth APRIL = new DateMonth(4);
    
    /**
     * May
     */
    public static final DateMonth MAY = new DateMonth(5);
    
    /**
     * June
     */
    public static final DateMonth JUNE = new DateMonth(6);
    
    /**
     * July
     */
    public static final DateMonth JULY = new DateMonth(7);
    
    /**
     * August
     */
    public static final DateMonth AUGUST = new DateMonth(8);
    
    /**
     * September
     */
    public static final DateMonth SEPTEMBER = new DateMonth(9);
    
    /**
     * October
     */
    public static final DateMonth OCTOBER = new DateMonth(10);
    
    /**
     * November
     */
    public static final DateMonth NOVEMBER = new DateMonth(11);
    
    /**
     * December
     */
    public static final DateMonth DECEMBER = new DateMonth(12);
    
    private int value;
    
    public DateMonth(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DateMonth[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
