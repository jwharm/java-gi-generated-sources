package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Private} struct is an opaque data structure to represent a
 * thread-local data key. It is approximately equivalent to the
 * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * TlsSetValue()/TlsGetValue() on Windows.
 * <p>
 * If you don't already know why you might want this functionality,
 * then you probably don't need it.
 * <p>
 * {@link Private} is a very limited resource (as far as 128 per program,
 * shared between all libraries). It is also not possible to destroy a
 * {@link Private} after it has been used. As such, it is only ever acceptable
 * to use {@link Private} in static scope, and even then sparingly so.
 * <p>
 * See G_PRIVATE_INIT() for a couple of examples.
 * <p>
 * The {@link Private} structure should be considered opaque.  It should only
 * be accessed via the g_private_ functions.
 */
public class Private extends io.github.jwharm.javagi.ResourceBase {

    public Private(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_private_get = Interop.downcallHandle(
        "g_private_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current value of the thread local variable {@code key}.
     * <p>
     * If the value has not yet been set in this thread, {@code null} is returned.
     * Values are never copied between threads (when a new thread is
     * created, for example).
     */
    public @Nullable java.lang.foreign.MemoryAddress get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_private_get.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_private_replace = Interop.downcallHandle(
        "g_private_replace",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_set() in the following way: if
     * the previous value was non-{@code null} then the {@link DestroyNotify} handler for
     * {@code key} is run on it.
     */
    public @NotNull void replace(@Nullable java.lang.foreign.MemoryAddress value) {
        try {
            g_private_replace.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_private_set = Interop.downcallHandle(
        "g_private_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_replace() in the following way:
     * the {@link DestroyNotify} for {@code key} is not called on the old value.
     */
    public @NotNull void set(@Nullable java.lang.foreign.MemoryAddress value) {
        try {
            g_private_set.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
