package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Integer type representing a year.
 * <p>
 * The {@code G_DATE_BAD_YEAR} value is the invalid value. The year
 * must be 1 or higher; negative (<a href="https://en.wikipedia.org/wiki/Common_Era">BCE</a>)
 * years are not allowed.
 * <p>
 * The year is represented with four digits.
 */
public class DateYear extends io.github.jwharm.javagi.Alias<Short> {
    
    public DateYear(short value) {
        super(value);
    }
}
