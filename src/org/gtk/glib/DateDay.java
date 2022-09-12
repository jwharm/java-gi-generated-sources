package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Integer representing a day of the month; between 1 and 31.
 * 
 * The %G_DATE_BAD_DAY value represents an invalid day of the month.
 */
public class DateDay {

    private final byte value;
    
    public DateDay(byte value) {
        this.value = value;
    }
    
    public byte getValue() {
        return this.value;
    }
    
}
