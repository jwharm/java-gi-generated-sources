package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Opaque datatype that records a start time.
 */
public class Timer extends io.github.jwharm.javagi.ResourceBase {

    public Timer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     */
    public void continue_() {
        gtk_h.g_timer_continue(handle());
    }
    
    /**
     * Destroys a timer, freeing associated resources.
     */
    public void destroy() {
        gtk_h.g_timer_destroy(handle());
    }
    
    /**
     * Exposes whether the timer is currently active.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_timer_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * This function is useless; it&<code>#39</code> s fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public void reset() {
        gtk_h.g_timer_reset(handle());
    }
    
    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public void start() {
        gtk_h.g_timer_start(handle());
    }
    
    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public void stop() {
        gtk_h.g_timer_stop(handle());
    }
    
    /**
     * Creates a new timer, and starts timing (i.e. g_timer_start() is
     * implicitly called for you).
     */
    public static Timer new_() {
        var RESULT = gtk_h.g_timer_new();
        return new Timer(References.get(RESULT, false));
    }
    
}
