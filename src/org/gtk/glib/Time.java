package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Simply a replacement for <code>time_t</code>. It has been deprecated
 * since it is not equivalent to <code>time_t</code> on 64-bit platforms
 * with a 64-bit <code>time_t</code>.
 * <p>
 * Unrelated to {@link org.gtk.glib.Timer} 
 * <p>
 * Note that {@link org.gtk.glib.Time} is defined to always be a 32-bit integer,
 * unlike <code>time_t</code> which may be 64-bit on some systems. Therefore,
 * {@link org.gtk.glib.Time} will overflow in the year 2038, and you cannot use the
 * address of a {@link org.gtk.glib.Time} variable as argument to the UNIX time()
 * function.
 * 
 * Instead, do the following:
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 * time_t ttime;
 * GTime gtime;
 * 
 * time (&<code>#38</code> ttime);
 * gtime = (GTime)ttime;
 * ]}|
 */
public class Time {

    private final int value;
    
    public Time(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public static int[] getValues(Time[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
