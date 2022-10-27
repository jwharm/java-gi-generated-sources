package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public class DateDMY extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
