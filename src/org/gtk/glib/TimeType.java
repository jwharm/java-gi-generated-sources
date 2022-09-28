package org.gtk.glib;

/**
 * Disambiguates a given time in two ways.
 * <p>
 * First, specifies if the given time is in universal or local time.
 * <p>
 * Second, if the time is in local time, specifies if it is local
 * standard time or local daylight time.  This is important for the case
 * where the same local time occurs twice (during daylight savings time
 * transitions, for example).
 */
public class TimeType {

    /**
     * the time is in local standard time
     */
    public static final TimeType STANDARD = new TimeType(0);
    
    /**
     * the time is in local daylight time
     */
    public static final TimeType DAYLIGHT = new TimeType(1);
    
    /**
     * the time is in UTC
     */
    public static final TimeType UNIVERSAL = new TimeType(2);
    
    private int value;
    
    public TimeType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TimeType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
