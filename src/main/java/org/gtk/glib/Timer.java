package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Opaque datatype that records a start time.
 */
public class Timer extends io.github.jwharm.javagi.ResourceBase {

    public Timer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_timer_continue = Interop.downcallHandle(
        "g_timer_continue",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     */
    public void continue_() {
        try {
            g_timer_continue.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_destroy = Interop.downcallHandle(
        "g_timer_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys a timer, freeing associated resources.
     */
    public void destroy() {
        try {
            g_timer_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_elapsed = Interop.downcallHandle(
        "g_timer_elapsed",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code timer} has been started but not stopped, obtains the time since
     * the timer was started. If {@code timer} has been stopped, obtains the
     * elapsed time between the time it was started and the time it was
     * stopped. The return value is the number of seconds elapsed,
     * including any fractional part. The {@code microseconds} out parameter is
     * essentially useless.
     */
    public double elapsed(PointerLong microseconds) {
        try {
            var RESULT = (double) g_timer_elapsed.invokeExact(handle(), microseconds.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_is_active = Interop.downcallHandle(
        "g_timer_is_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Exposes whether the timer is currently active.
     */
    public boolean isActive() {
        try {
            var RESULT = (int) g_timer_is_active.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_reset = Interop.downcallHandle(
        "g_timer_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public void reset() {
        try {
            g_timer_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_start = Interop.downcallHandle(
        "g_timer_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public void start() {
        try {
            g_timer_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_stop = Interop.downcallHandle(
        "g_timer_stop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public void stop() {
        try {
            g_timer_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timer_new = Interop.downcallHandle(
        "g_timer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new timer, and starts timing (i.e. g_timer_start() is
     * implicitly called for you).
     */
    public static Timer new_() {
        try {
            var RESULT = (MemoryAddress) g_timer_new.invokeExact();
            return new Timer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
