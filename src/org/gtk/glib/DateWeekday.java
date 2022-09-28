package org.gtk.glib;

/**
 * Enumeration representing a day of the week; {@link DateWeekday#MONDAY},
 * {@link DateWeekday#TUESDAY}, etc. {@link DateWeekday#BAD_WEEKDAY} is an invalid weekday.
 */
public class DateWeekday {

    /**
     * invalid value
     */
    public static final DateWeekday BAD_WEEKDAY = new DateWeekday(0);
    
    /**
     * Monday
     */
    public static final DateWeekday MONDAY = new DateWeekday(1);
    
    /**
     * Tuesday
     */
    public static final DateWeekday TUESDAY = new DateWeekday(2);
    
    /**
     * Wednesday
     */
    public static final DateWeekday WEDNESDAY = new DateWeekday(3);
    
    /**
     * Thursday
     */
    public static final DateWeekday THURSDAY = new DateWeekday(4);
    
    /**
     * Friday
     */
    public static final DateWeekday FRIDAY = new DateWeekday(5);
    
    /**
     * Saturday
     */
    public static final DateWeekday SATURDAY = new DateWeekday(6);
    
    /**
     * Sunday
     */
    public static final DateWeekday SUNDAY = new DateWeekday(7);
    
    private int value;
    
    public DateWeekday(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DateWeekday[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
