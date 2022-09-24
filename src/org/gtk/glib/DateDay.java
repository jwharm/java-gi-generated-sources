package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Integer representing a day of the month; between 1 and 31.
 * <p>
 * The {@code G_DATE_BAD_DAY} value represents an invalid day of the month.
 */
public class DateDay extends Alias<Byte> {

    public DateDay(byte value) {
        this.value = value;
    }
    
    public static byte[] getValues(DateDay[] array) {
        byte[] values = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
