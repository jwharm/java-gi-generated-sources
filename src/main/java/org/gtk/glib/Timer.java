package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque datatype that records a start time.
 */
public class Timer extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTimer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Timer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Timer newInstance = new Timer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Timer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Timer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     */
    public void continue_() {
        try {
            DowncallHandles.g_timer_continue.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Destroys a timer, freeing associated resources.
     */
    public void destroy() {
        try {
            DowncallHandles.g_timer_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code timer} has been started but not stopped, obtains the time since
     * the timer was started. If {@code timer} has been stopped, obtains the
     * elapsed time between the time it was started and the time it was
     * stopped. The return value is the number of seconds elapsed,
     * including any fractional part. The {@code microseconds} out parameter is
     * essentially useless.
     * @param microseconds return location for the fractional part of seconds
     *                elapsed, in microseconds (that is, the total number
     *                of microseconds elapsed, modulo 1000000), or {@code null}
     * @return seconds elapsed as a floating point value, including any
     *          fractional part.
     */
    public double elapsed(PointerLong microseconds) {
        java.util.Objects.requireNonNull(microseconds, "Parameter 'microseconds' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_timer_elapsed.invokeExact(
                    handle(),
                    microseconds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Exposes whether the timer is currently active.
     * @return {@code true} if the timer is running, {@code false} otherwise
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_timer_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public void reset() {
        try {
            DowncallHandles.g_timer_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public void start() {
        try {
            DowncallHandles.g_timer_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public void stop() {
        try {
            DowncallHandles.g_timer_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new timer, and starts timing (i.e. g_timer_start() is
     * implicitly called for you).
     * @return a new {@link Timer}.
     */
    public static @NotNull org.gtk.glib.Timer new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_timer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Timer(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_timer_continue = Interop.downcallHandle(
            "g_timer_continue",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_destroy = Interop.downcallHandle(
            "g_timer_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_elapsed = Interop.downcallHandle(
            "g_timer_elapsed",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_is_active = Interop.downcallHandle(
            "g_timer_is_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_reset = Interop.downcallHandle(
            "g_timer_reset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_start = Interop.downcallHandle(
            "g_timer_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_stop = Interop.downcallHandle(
            "g_timer_stop",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_timer_new = Interop.downcallHandle(
            "g_timer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
