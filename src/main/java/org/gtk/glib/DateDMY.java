package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public enum DateDMY implements io.github.jwharm.javagi.Enumeration {
    /**
     * a day
     */
    DAY(0),
    /**
     * a month
     */
    MONTH(1),
    /**
     * a year
     */
    YEAR(2);
    
    private static final java.lang.String C_TYPE_NAME = "GDateDMY";
    
    private final int value;
    DateDMY(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DateDMY of(int value) {
        return switch (value) {
            case 0 -> DAY;
            case 1 -> MONTH;
            case 2 -> YEAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
