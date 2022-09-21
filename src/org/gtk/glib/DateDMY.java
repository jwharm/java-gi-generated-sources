package org.gtk.glib;

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public enum DateDMY {

    /**
     * a day
     */
    DAY,
    
    /**
     * a month
     */
    MONTH,
    
    /**
     * a year
     */
    YEAR;
    
    public static DateDMY fromValue(int value) {
        return switch(value) {
            case 0 -> DAY;
            case 1 -> MONTH;
            case 2 -> YEAR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DAY -> 0;
            case MONTH -> 1;
            case YEAR -> 2;
        };
    }

}
