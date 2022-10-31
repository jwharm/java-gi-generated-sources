package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class TimeType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTimeType";
    
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
    
    public TimeType(int value) {
        super(value);
    }
}
