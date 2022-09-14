package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Integer type representing a year.
 * 
 * The %G_DATE_BAD_YEAR value is the invalid value. The year
 * must be 1 or higher; negative ([BCE](https://en.wikipedia.org/wiki/Common_Era))
 * years are not allowed.
 * 
 * The year is represented with four digits.
 */
public class DateYear {

    private final short value;
    
    public DateYear(short value) {
        this.value = value;
    }
    
    public short getValue() {
        return this.value;
    }
    
    public static short[] getValues(DateYear[] array) {
        short[] values = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
