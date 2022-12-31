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
 * @version 2.32
 */
public class RecMutex extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRecMutex";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("p"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("i")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RecMutex}
     * @return A new, uninitialized @{link RecMutex}
     */
    public static RecMutex allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecMutex newInstance = new RecMutex(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RecMutex proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RecMutex(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RecMutex> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RecMutex(input, ownership);
    
    /**
     * Frees the resources allocated to a recursive mutex with
     * g_rec_mutex_init().
     * <p>
     * This function should not be used with a {@link RecMutex} that has been
     * statically allocated.
     * <p>
     * Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * to undefined behaviour.
     */
    public void clear() {
        try {
            DowncallHandles.g_rec_mutex_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link RecMutex} so that it can be used.
     * <p>
     * This function is useful to initialize a recursive mutex
     * that has been allocated on the stack, or as part of a larger
     * structure.
     * <p>
     * It is not necessary to initialise a recursive mutex that has been
     * statically allocated.
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
    public void init() {
        try {
            DowncallHandles.g_rec_mutex_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Locks {@code rec_mutex}. If {@code rec_mutex} is already locked by another
     * thread, the current thread will block until {@code rec_mutex} is
     * unlocked by the other thread. If {@code rec_mutex} is already locked
     * by the current thread, the 'lock count' of {@code rec_mutex} is increased.
     * The mutex will only become available again when it is unlocked
     * as many times as it has been locked.
     */
    public void lock() {
        try {
            DowncallHandles.g_rec_mutex_lock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to lock {@code rec_mutex}. If {@code rec_mutex} is already locked
     * by another thread, it immediately returns {@code false}. Otherwise
     * it locks {@code rec_mutex} and returns {@code true}.
     * @return {@code true} if {@code rec_mutex} could be locked
     */
    public boolean trylock() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rec_mutex_trylock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unlocks {@code rec_mutex}. If another thread is blocked in a
     * g_rec_mutex_lock() call for {@code rec_mutex}, it will become unblocked
     * and can lock {@code rec_mutex} itself.
     * <p>
     * Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * locked by the current thread leads to undefined behaviour.
     */
    public void unlock() {
        try {
            DowncallHandles.g_rec_mutex_unlock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_rec_mutex_clear = Interop.downcallHandle(
            "g_rec_mutex_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_rec_mutex_init = Interop.downcallHandle(
            "g_rec_mutex_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_rec_mutex_lock = Interop.downcallHandle(
            "g_rec_mutex_lock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_rec_mutex_trylock = Interop.downcallHandle(
            "g_rec_mutex_trylock",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_rec_mutex_unlock = Interop.downcallHandle(
            "g_rec_mutex_unlock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RecMutex.Builder} object constructs a {@link RecMutex} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RecMutex.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RecMutex struct;
        
        private Builder() {
            struct = RecMutex.allocate();
        }
        
         /**
         * Finish building the {@link RecMutex} struct.
         * @return A new instance of {@code RecMutex} with the fields 
         *         that were set in the Builder object.
         */
        public RecMutex build() {
            return struct;
        }
        
        public Builder setP(java.lang.foreign.MemoryAddress p) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("p"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (p == null ? MemoryAddress.NULL : (Addressable) p));
            return this;
        }
        
        public Builder setI(int[] i) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("i"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (i == null ? MemoryAddress.NULL : Interop.allocateNativeArray(i, false)));
            return this;
        }
    }
}
