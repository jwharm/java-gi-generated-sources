package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Opaque datatype that records a start time.
 */
public class Timer extends io.github.jwharm.javagi.interop.ResourceBase {

    public Timer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     */
    public void continue_() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_continue(HANDLE());
    }
    
    /**
     * Destroys a timer, freeing associated resources.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_destroy(HANDLE());
    }
    
    /**
     * Exposes whether the timer is currently active.
     */
    public boolean isActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_is_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_reset(HANDLE());
    }
    
    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public void start() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_start(HANDLE());
    }
    
    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public void stop() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_timer_stop(HANDLE());
    }
    
}
