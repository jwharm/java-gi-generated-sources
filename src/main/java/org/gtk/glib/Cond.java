package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Cond} struct is an opaque data structure that represents a
 * condition. Threads can block on a {@link Cond} if they find a certain
 * condition to be false. If other threads change the state of this
 * condition they signal the {@link Cond}, and that causes the waiting
 * threads to be woken up.
 * <p>
 * Consider the following example of a shared variable.  One or more
 * threads can wait for data to be published to the variable and when
 * another thread publishes the data, it can signal one of the waiting
 * threads to wake up to collect the data.
 * <p>
 * Here is an example for using GCond to block a thread until a condition
 * is satisfied:
 * <pre>{@code <!-- language="C" -->
 *   gpointer current_data = NULL;
 *   GMutex data_mutex;
 *   GCond data_cond;
 * 
 *   void
 *   push_data (gpointer data)
 *   {
 *     g_mutex_lock (&data_mutex);
 *     current_data = data;
 *     g_cond_signal (&data_cond);
 *     g_mutex_unlock (&data_mutex);
 *   }
 * 
 *   gpointer
 *   pop_data (void)
 *   {
 *     gpointer data;
 * 
 *     g_mutex_lock (&data_mutex);
 *     while (!current_data)
 *       g_cond_wait (&data_cond, &data_mutex);
 *     data = current_data;
 *     current_data = NULL;
 *     g_mutex_unlock (&data_mutex);
 * 
 *     return data;
 *   }
 * }</pre>
 * Whenever a thread calls pop_data() now, it will wait until
 * current_data is non-{@code null}, i.e. until some other thread
 * has called push_data().
 * <p>
 * The example shows that use of a condition variable must always be
 * paired with a mutex.  Without the use of a mutex, there would be a
 * race between the check of {@code current_data} by the while loop in
 * pop_data() and waiting. Specifically, another thread could set
 * {@code current_data} after the check, and signal the cond (with nobody
 * waiting on it) before the first thread goes to sleep. {@link Cond} is
 * specifically useful for its ability to release the mutex and go
 * to sleep atomically.
 * <p>
 * It is also important to use the g_cond_wait() and g_cond_wait_until()
 * functions only inside a loop which checks for the condition to be
 * true.  See g_cond_wait() for an explanation of why the condition may
 * not be true even after it returns.
 * <p>
 * If a {@link Cond} is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call g_cond_init()
 * on it and g_cond_clear() when done.
 * <p>
 * A {@link Cond} should only be accessed via the g_cond_ functions.
 */
public class Cond extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCond";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("p"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("i")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Cond}
     * @return A new, uninitialized @{link Cond}
     */
    public static Cond allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Cond newInstance = new Cond(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Cond proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Cond(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * If threads are waiting for {@code cond}, all of them are unblocked.
     * If no threads are waiting for {@code cond}, this function has no effect.
     * It is good practice to lock the same mutex as the waiting threads
     * while calling this function, though not required.
     */
    public void broadcast() {
        try {
            DowncallHandles.g_cond_broadcast.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the resources allocated to a {@link Cond} with g_cond_init().
     * <p>
     * This function should not be used with a {@link Cond} that has been
     * statically allocated.
     * <p>
     * Calling g_cond_clear() for a {@link Cond} on which threads are
     * blocking leads to undefined behaviour.
     */
    public void clear() {
        try {
            DowncallHandles.g_cond_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initialises a {@link Cond} so that it can be used.
     * <p>
     * This function is useful to initialise a {@link Cond} that has been
     * allocated as part of a larger structure.  It is not necessary to
     * initialise a {@link Cond} that has been statically allocated.
     * <p>
     * To undo the effect of g_cond_init() when a {@link Cond} is no longer
     * needed, use g_cond_clear().
     * <p>
     * Calling g_cond_init() on an already-initialised {@link Cond} leads
     * to undefined behaviour.
     */
    public void init() {
        try {
            DowncallHandles.g_cond_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If threads are waiting for {@code cond}, at least one of them is unblocked.
     * If no threads are waiting for {@code cond}, this function has no effect.
     * It is good practice to hold the same lock as the waiting thread
     * while calling this function, though not required.
     */
    public void signal() {
        try {
            DowncallHandles.g_cond_signal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Atomically releases {@code mutex} and waits until {@code cond} is signalled.
     * When this function returns, {@code mutex} is locked again and owned by the
     * calling thread.
     * <p>
     * When using condition variables, it is possible that a spurious wakeup
     * may occur (ie: g_cond_wait() returns even though g_cond_signal() was
     * not called).  It's also possible that a stolen wakeup may occur.
     * This is when g_cond_signal() is called, but another thread acquires
     * {@code mutex} before this thread and modifies the state of the program in
     * such a way that when g_cond_wait() is able to return, the expected
     * condition is no longer met.
     * <p>
     * For this reason, g_cond_wait() must always be used in a loop.  See
     * the documentation for {@link Cond} for a complete example.
     * @param mutex a {@link Mutex} that is currently locked
     */
    public void wait_(@NotNull org.gtk.glib.Mutex mutex) {
        java.util.Objects.requireNonNull(mutex, "Parameter 'mutex' must not be null");
        try {
            DowncallHandles.g_cond_wait.invokeExact(
                    handle(),
                    mutex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Waits until either {@code cond} is signalled or {@code end_time} has passed.
     * <p>
     * As with g_cond_wait() it is possible that a spurious or stolen wakeup
     * could occur.  For that reason, waiting on a condition variable should
     * always be in a loop, based on an explicitly-checked predicate.
     * <p>
     * {@code true} is returned if the condition variable was signalled (or in the
     * case of a spurious wakeup).  {@code false} is returned if {@code end_time} has
     * passed.
     * <p>
     * The following code shows how to correctly perform a timed wait on a
     * condition variable (extending the example presented in the
     * documentation for {@link Cond}):
     * <pre>{@code <!-- language="C" -->
     * gpointer
     * pop_data_timed (void)
     * {
     *   gint64 end_time;
     *   gpointer data;
     * 
     *   g_mutex_lock (&data_mutex);
     * 
     *   end_time = g_get_monotonic_time () + 5 * G_TIME_SPAN_SECOND;
     *   while (!current_data)
     *     if (!g_cond_wait_until (&data_cond, &data_mutex, end_time))
     *       {
     *         // timeout has passed.
     *         g_mutex_unlock (&data_mutex);
     *         return NULL;
     *       }
     * 
     *   // there is data for us
     *   data = current_data;
     *   current_data = NULL;
     * 
     *   g_mutex_unlock (&data_mutex);
     * 
     *   return data;
     * }
     * }</pre>
     * <p>
     * Notice that the end time is calculated once, before entering the
     * loop and reused.  This is the motivation behind the use of absolute
     * time on this API -- if a relative time of 5 seconds were passed
     * directly to the call and a spurious wakeup occurred, the program would
     * have to start over waiting again (which would lead to a total wait
     * time of more than 5 seconds).
     * @param mutex a {@link Mutex} that is currently locked
     * @param endTime the monotonic time to wait until
     * @return {@code true} on a signal, {@code false} on a timeout
     */
    public boolean waitUntil(@NotNull org.gtk.glib.Mutex mutex, long endTime) {
        java.util.Objects.requireNonNull(mutex, "Parameter 'mutex' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_cond_wait_until.invokeExact(
                    handle(),
                    mutex.handle(),
                    endTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_cond_broadcast = Interop.downcallHandle(
            "g_cond_broadcast",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cond_clear = Interop.downcallHandle(
            "g_cond_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cond_init = Interop.downcallHandle(
            "g_cond_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cond_signal = Interop.downcallHandle(
            "g_cond_signal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cond_wait = Interop.downcallHandle(
            "g_cond_wait",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cond_wait_until = Interop.downcallHandle(
            "g_cond_wait_until",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Cond struct;
        
         /**
         * A {@link Cond.Build} object constructs a {@link Cond} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Cond.allocate();
        }
        
         /**
         * Finish building the {@link Cond} struct.
         * @return A new instance of {@code Cond} with the fields 
         *         that were set in the Build object.
         */
        public Cond construct() {
            return struct;
        }
        
        public Build setP(java.lang.foreign.MemoryAddress p) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("p"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (p == null ? MemoryAddress.NULL : (Addressable) p));
            return this;
        }
        
        public Build setI(int[] i) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("i"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (i == null ? MemoryAddress.NULL : Interop.allocateNativeArray(i, false)));
            return this;
        }
    }
}
