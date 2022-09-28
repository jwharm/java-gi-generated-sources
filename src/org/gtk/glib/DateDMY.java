package org.gtk.glib;

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public class DateDMY extends io.github.jwharm.javagi.Enumeration {

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
    
    public DateDMY(int value) {
        super(value);
    }
    
}
