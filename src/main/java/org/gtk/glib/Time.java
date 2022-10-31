package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Simply a replacement for {@code time_t}. It has been deprecated
 * since it is not equivalent to {@code time_t} on 64-bit platforms
 * with a 64-bit {@code time_t}.
 * <p>
 * Unrelated to {@link Timer}.
 * <p>
 * Note that {@link Time} is defined to always be a 32-bit integer,
 * unlike {@code time_t} which may be 64-bit on some systems. Therefore,
 * {@link Time} will overflow in the year 2038, and you cannot use the
 * address of a {@link Time} variable as argument to the UNIX time()
 * function.
 * <p>
 * Instead, do the following:
 * <pre>{@code <!-- language="C" -->
 * time_t ttime;
 * GTime gtime;
 * 
 * time (&ttime);
 * gtime = (GTime)ttime;
 * }</pre>
 */
public class Time extends io.github.jwharm.javagi.Alias<Integer> {
    
    public Time(int value) {
        super(value);
    }
}
