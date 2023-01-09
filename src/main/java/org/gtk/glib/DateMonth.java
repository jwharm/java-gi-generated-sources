package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration representing a month; values are {@link DateMonth#JANUARY},
 * {@link DateMonth#FEBRUARY}, etc. {@link DateMonth#BAD_MONTH} is the invalid value.
 */
public enum DateMonth implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * invalid value
     */
    BAD_MONTH(0),
    
    /**
     * January
     */
    JANUARY(1),
    
    /**
     * February
     */
    FEBRUARY(2),
    
    /**
     * March
     */
    MARCH(3),
    
    /**
     * April
     */
    APRIL(4),
    
    /**
     * May
     */
    MAY(5),
    
    /**
     * June
     */
    JUNE(6),
    
    /**
     * July
     */
    JULY(7),
    
    /**
     * August
     */
    AUGUST(8),
    
    /**
     * September
     */
    SEPTEMBER(9),
    
    /**
     * October
     */
    OCTOBER(10),
    
    /**
     * November
     */
    NOVEMBER(11),
    
    /**
     * December
     */
    DECEMBER(12);
    
    private static final java.lang.String C_TYPE_NAME = "GDateMonth";
    
    private final int value;
    
    /**
     * Create a new DateMonth for the provided value
     * @param numeric value the enum value
     */
    DateMonth(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new DateMonth for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DateMonth of(int value) {
        return switch (value) {
            case 0 -> BAD_MONTH;
            case 1 -> JANUARY;
            case 2 -> FEBRUARY;
            case 3 -> MARCH;
            case 4 -> APRIL;
            case 5 -> MAY;
            case 6 -> JUNE;
            case 7 -> JULY;
            case 8 -> AUGUST;
            case 9 -> SEPTEMBER;
            case 10 -> OCTOBER;
            case 11 -> NOVEMBER;
            case 12 -> DECEMBER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
