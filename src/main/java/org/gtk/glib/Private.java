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
public class Private extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPrivate";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("p"),
            Interop.valueLayout.ADDRESS.withName("notify"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("future")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Private}
     * @return A new, uninitialized @{link Private}
     */
    public static Private allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Private newInstance = new Private(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Private proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Private(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Private> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Private(input);
    
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
            RESULT = (MemoryAddress) DowncallHandles.g_private_get.invokeExact(handle());
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
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
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
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_private_get = Interop.downcallHandle(
                "g_private_get",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_private_replace = Interop.downcallHandle(
                "g_private_replace",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_private_set = Interop.downcallHandle(
                "g_private_set",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Private.Builder} object constructs a {@link Private} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Private.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Private struct;
        
        private Builder() {
            struct = Private.allocate();
        }
        
        /**
         * Finish building the {@link Private} struct.
         * @return A new instance of {@code Private} with the fields 
         *         that were set in the Builder object.
         */
        public Private build() {
            return struct;
        }
        
        public Builder setP(java.lang.foreign.MemoryAddress p) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("p"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (p == null ? MemoryAddress.NULL : (Addressable) p));
                return this;
            }
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
                return this;
            }
        }
        
        public Builder setFuture(java.lang.foreign.MemoryAddress[] future) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("future"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (future == null ? MemoryAddress.NULL : Interop.allocateNativeArray(future, false, SCOPE)));
                return this;
            }
        }
    }
}
