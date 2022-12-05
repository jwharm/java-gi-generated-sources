package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration representing a day of the week; {@link DateWeekday#MONDAY},
 * {@link DateWeekday#TUESDAY}, etc. {@link DateWeekday#BAD_WEEKDAY} is an invalid weekday.
 */
public enum DateWeekday implements io.github.jwharm.javagi.Enumeration {
    /**
     * invalid value
     */
    BAD_WEEKDAY(0),
    /**
     * Monday
     */
    MONDAY(1),
    /**
     * Tuesday
     */
    TUESDAY(2),
    /**
     * Wednesday
     */
    WEDNESDAY(3),
    /**
     * Thursday
     */
    THURSDAY(4),
    /**
     * Friday
     */
    FRIDAY(5),
    /**
     * Saturday
     */
    SATURDAY(6),
    /**
     * Sunday
     */
    SUNDAY(7);
    
    private static final java.lang.String C_TYPE_NAME = "GDateWeekday";
    
    private final int value;
    DateWeekday(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DateWeekday of(int value) {
        return switch (value) {
            case 0 -> BAD_WEEKDAY;
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
