package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A value representing an interval of time, in microseconds.
 */
public class TimeSpan extends Alias<Long> {

    public TimeSpan(long value) {
        this.value = value;
    }
    
    public static long[] getValues(TimeSpan[] array) {
        long[] values = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
