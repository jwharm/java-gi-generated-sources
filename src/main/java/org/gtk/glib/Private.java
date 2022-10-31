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
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPrivate";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("p"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("future")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Private allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Private newInstance = new Private(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Private(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the current value of the thread local variable {@code key}.
     * <p>
     * If the value has not yet been set in this thread, {@code null} is returned.
     * Values are never copied between threads (when a new thread is
     * created, for example).
     * @return the thread-local value
     */
    public @Nullable java.lang.foreign.MemoryAddress get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_private_get.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_set() in the following way: if
     * the previous value was non-{@code null} then the {@link DestroyNotify} handler for
     * {@code key} is run on it.
     * @param value the new value
     */
    public void replace(@Nullable java.lang.foreign.MemoryAddress value) {
        try {
            DowncallHandles.g_private_replace.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_replace() in the following way:
     * the {@link DestroyNotify} for {@code key} is not called on the old value.
     * @param value the new value
     */
    public void set(@Nullable java.lang.foreign.MemoryAddress value) {
        try {
            DowncallHandles.g_private_set.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_private_get = Interop.downcallHandle(
            "g_private_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_private_replace = Interop.downcallHandle(
            "g_private_replace",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_private_set = Interop.downcallHandle(
            "g_private_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
