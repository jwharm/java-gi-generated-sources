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
 * The <code>G_DATE_BAD_DAY</code> value represents an invalid day of the month.
 */
public class DateDay {

    private final byte value;
    
    public DateDay(byte value) {
        this.value = value;
    }
    
    public byte getValue() {
        return this.value;
    }
    
    public static byte[] getValues(DateDay[] array) {
        byte[] values = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
