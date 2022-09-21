package org.gtk.glib;

/**
 * Enumeration representing a day of the week; {@link DateWeekday#MONDAY},
 * {@link DateWeekday#TUESDAY}, etc. {@link DateWeekday#BAD_WEEKDAY} is an invalid weekday.
 */
public enum DateWeekday {

    /**
     * invalid value
     */
    BAD_WEEKDAY,
    
    /**
     * Monday
     */
    MONDAY,
    
    /**
     * Tuesday
     */
    TUESDAY,
    
    /**
     * Wednesday
     */
    WEDNESDAY,
    
    /**
     * Thursday
     */
    THURSDAY,
    
    /**
     * Friday
     */
    FRIDAY,
    
    /**
     * Saturday
     */
    SATURDAY,
    
    /**
     * Sunday
     */
    SUNDAY;
    
    public static DateWeekday fromValue(int value) {
        return switch(value) {
            case 0 -> BAD_WEEKDAY;
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BAD_WEEKDAY -> 0;
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }

}
