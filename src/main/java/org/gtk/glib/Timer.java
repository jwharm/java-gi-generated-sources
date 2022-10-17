package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque datatype that records a start time.
 */
public class Timer extends io.github.jwharm.javagi.ResourceBase {

    public Timer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_timer_continue = Interop.downcallHandle(
        "g_timer_continue",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     */
    public @NotNull void continue_() {
        try {
            g_timer_continue.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_timer_destroy = Interop.downcallHandle(
        "g_timer_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys a timer, freeing associated resources.
     */
    public @NotNull void destroy() {
        try {
            g_timer_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_timer_elapsed = Interop.downcallHandle(
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
    public double elapsed(@NotNull PointerLong microseconds) {
        double RESULT;
        try {
            RESULT = (double) g_timer_elapsed.invokeExact(handle(), microseconds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_timer_is_active = Interop.downcallHandle(
        "g_timer_is_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Exposes whether the timer is currently active.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) g_timer_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_timer_reset = Interop.downcallHandle(
        "g_timer_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public @NotNull void reset() {
        try {
            g_timer_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_timer_start = Interop.downcallHandle(
        "g_timer_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public @NotNull void start() {
        try {
            g_timer_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_timer_stop = Interop.downcallHandle(
        "g_timer_stop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public @NotNull void stop() {
        try {
            g_timer_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_timer_new = Interop.downcallHandle(
        "g_timer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new timer, and starts timing (i.e. g_timer_start() is
     * implicitly called for you).
     */
    public static @NotNull Timer new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_timer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Timer(Refcounted.get(RESULT, false));
    }
    
}
