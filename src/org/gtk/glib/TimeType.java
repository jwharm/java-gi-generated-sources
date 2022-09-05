package org.gtk.glib;

/**
 * Disambiguates a given time in two ways.
 * 
 * First, specifies if the given time is in universal or local time.
 * 
 * Second, if the time is in local time, specifies if it is local
 * standard time or local daylight time.  This is important for the case
 * where the same local time occurs twice (during daylight savings time
 * transitions, for example).
 */
public enum TimeType {

    /**
     * the time is in local standard time
     */
    STANDARD,
    
    /**
     * the time is in local daylight time
     */
    DAYLIGHT,
    
    /**
     * the time is in UTC
     */
    UNIVERSAL;
    
    public static TimeType fromValue(int value) {
        return switch(value) {
            case 0 -> STANDARD;
            case 1 -> DAYLIGHT;
            case 2 -> UNIVERSAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case STANDARD -> 0;
            case DAYLIGHT -> 1;
            case UNIVERSAL -> 2;
        };
    }

}
