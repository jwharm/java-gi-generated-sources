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
 * Unrelated to #GTimer.
 * <p>
 * Note that #GTime is defined to always be a 32-bit integer,
 * unlike <code>time_t</code> which may be 64-bit on some systems. Therefore,
 * #GTime will overflow in the year 2038, and you cannot use the
 * address of a #GTime variable as argument to the UNIX time()
 * function.
 * 
 * Instead, do the following:
 * 
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * time_t ttime;
 * GTime gtime;
 * 
 * time (&#38;ttime);
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
