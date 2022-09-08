package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Simply a replacement for `time_t`. It has been deprecated
 * since it is not equivalent to `time_t` on 64-bit platforms
 * with a 64-bit `time_t`.
 * 
 * Unrelated to #GTimer.
 * 
 * Note that #GTime is defined to always be a 32-bit integer,
 * unlike `time_t` which may be 64-bit on some systems. Therefore,
 * #GTime will overflow in the year 2038, and you cannot use the
 * address of a #GTime variable as argument to the UNIX time()
 * function.
 * 
 * Instead, do the following:
 * 
 * |[<!-- language="C" -->
 * time_t ttime;
 * GTime gtime;
 * 
 * time (&ttime);
 * gtime = (GTime)ttime;
 * ]|
 */
public class Time {

    private final int value;
    
    public Time(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
