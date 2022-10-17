package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRecMutex struct is an opaque data structure to represent a
 * recursive mutex. It is similar to a {@link Mutex} with the difference
 * that it is possible to lock a GRecMutex multiple times in the same
 * thread without deadlock. When doing so, care has to be taken to
 * unlock the recursive mutex as often as it has been locked.
 * <p>
 * If a {@link RecMutex} is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rec_mutex_init() on it and g_rec_mutex_clear() when done.
 * <p>
 * A GRecMutex should only be accessed with the
 * g_rec_mutex_ functions.
 */
public class RecMutex extends io.github.jwharm.javagi.ResourceBase {

    public RecMutex(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_rec_mutex_clear = Interop.downcallHandle(
        "g_rec_mutex_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated to a recursive mutex with
     * g_rec_mutex_init().
     * <p>
     * This function should not be used with a {@link RecMutex} that has been
     * statically allocated.
     * <p>
     * Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * to undefined behaviour.
     * <p>
     * Sine: 2.32
     */
    public @NotNull void clear() {
        try {
            g_rec_mutex_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rec_mutex_init = Interop.downcallHandle(
        "g_rec_mutex_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link RecMutex} so that it can be used.
     * <p>
     * This function is useful to initialize a recursive mutex
     * that has been allocated on the stack, or as part of a larger
     * structure.
     * <p>
     * It is not necessary to initialise a recursive mutex that has been
     * statically allocated.
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&b->m);
     * }</pre>
     * <p>
     * Calling g_rec_mutex_init() on an already initialized {@link RecMutex}
     * leads to undefined behaviour.
     * <p>
     * To undo the effect of g_rec_mutex_init() when a recursive mutex
     * is no longer needed, use g_rec_mutex_clear().
     */
    public @NotNull void init() {
        try {
            g_rec_mutex_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rec_mutex_lock = Interop.downcallHandle(
        "g_rec_mutex_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Locks {@code rec_mutex}. If {@code rec_mutex} is already locked by another
     * thread, the current thread will block until {@code rec_mutex} is
     * unlocked by the other thread. If {@code rec_mutex} is already locked
     * by the current thread, the 'lock count' of {@code rec_mutex} is increased.
     * The mutex will only become available again when it is unlocked
     * as many times as it has been locked.
     */
    public @NotNull void lock() {
        try {
            g_rec_mutex_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_rec_mutex_trylock = Interop.downcallHandle(
        "g_rec_mutex_trylock",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to lock {@code rec_mutex}. If {@code rec_mutex} is already locked
     * by another thread, it immediately returns {@code false}. Otherwise
     * it locks {@code rec_mutex} and returns {@code true}.
     */
    public boolean trylock() {
        int RESULT;
        try {
            RESULT = (int) g_rec_mutex_trylock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_rec_mutex_unlock = Interop.downcallHandle(
        "g_rec_mutex_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unlocks {@code rec_mutex}. If another thread is blocked in a
     * g_rec_mutex_lock() call for {@code rec_mutex}, it will become unblocked
     * and can lock {@code rec_mutex} itself.
     * <p>
     * Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * locked by the current thread leads to undefined behaviour.
     */
    public @NotNull void unlock() {
        try {
            g_rec_mutex_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
