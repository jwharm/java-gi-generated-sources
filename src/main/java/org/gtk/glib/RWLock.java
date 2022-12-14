package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRWLock struct is an opaque data structure to represent a
 * reader-writer lock. It is similar to a {@link Mutex} in that it allows
 * multiple threads to coordinate access to a shared resource.
 * <p>
 * The difference to a mutex is that a reader-writer lock discriminates
 * between read-only ('reader') and full ('writer') access. While only
 * one thread at a time is allowed write access (by holding the 'writer'
 * lock via g_rw_lock_writer_lock()), multiple threads can gain
 * simultaneous read-only access (by holding the 'reader' lock via
 * g_rw_lock_reader_lock()).
 * <p>
 * It is unspecified whether readers or writers have priority in acquiring the
 * lock when a reader already holds the lock and a writer is queued to acquire
 * it.
 * <p>
 * Here is an example for an array with access functions:
 * <pre>{@code <!-- language="C" -->
 *   GRWLock lock;
 *   GPtrArray *array;
 * 
 *   gpointer
 *   my_array_get (guint index)
 *   {
 *     gpointer retval = NULL;
 * 
 *     if (!array)
 *       return NULL;
 * 
 *     g_rw_lock_reader_lock (&lock);
 *     if (index < array->len)
 *       retval = g_ptr_array_index (array, index);
 *     g_rw_lock_reader_unlock (&lock);
 * 
 *     return retval;
 *   }
 * 
 *   void
 *   my_array_set (guint index, gpointer data)
 *   {
 *     g_rw_lock_writer_lock (&lock);
 * 
 *     if (!array)
 *       array = g_ptr_array_new ();
 * 
 *     if (index >= array->len)
 *       g_ptr_array_set_size (array, index+1);
 *     g_ptr_array_index (array, index) = data;
 * 
 *     g_rw_lock_writer_unlock (&lock);
 *   }
 *  }</pre>
 * This example shows an array which can be accessed by many readers
 * (the my_array_get() function) simultaneously, whereas the writers
 * (the my_array_set() function) will only be allowed one at a time
 * and only if no readers currently access the array. This is because
 * of the potentially dangerous resizing of the array. Using these
 * functions is fully multi-thread safe now.
 * <p>
 * If a {@link RWLock} is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rw_lock_init() on it and g_rw_lock_clear() when done.
 * <p>
 * A GRWLock should only be accessed with the g_rw_lock_ functions.
 * @version 2.32
 */
public class RWLock extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRWLock";
    
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
     * Allocate a new {@link RWLock}
     * @return A new, uninitialized @{link RWLock}
     */
    public static RWLock allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RWLock newInstance = new RWLock(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RWLock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RWLock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RWLock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RWLock(input);
    
    /**
     * Frees the resources allocated to a lock with g_rw_lock_init().
     * <p>
     * This function should not be used with a {@link RWLock} that has been
     * statically allocated.
     * <p>
     * Calling g_rw_lock_clear() when any thread holds the lock
     * leads to undefined behaviour.
     */
    public void clear() {
        try {
            DowncallHandles.g_rw_lock_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link RWLock} so that it can be used.
     * <p>
     * This function is useful to initialize a lock that has been
     * allocated on the stack, or as part of a larger structure.  It is not
     * necessary to initialise a reader-writer lock that has been statically
     * allocated.
     * <pre>{@code <!-- language="C" -->
     *   typedef struct {
     *     GRWLock l;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rw_lock_init (&b->l);
     * }</pre>
     * <p>
     * To undo the effect of g_rw_lock_init() when a lock is no longer
     * needed, use g_rw_lock_clear().
     * <p>
     * Calling g_rw_lock_init() on an already initialized {@link RWLock} leads
     * to undefined behaviour.
     */
    public void init() {
        try {
            DowncallHandles.g_rw_lock_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Obtain a read lock on {@code rw_lock}. If another thread currently holds
     * the write lock on {@code rw_lock}, the current thread will block until the
     * write lock was (held and) released. If another thread does not hold
     * the write lock, but is waiting for it, it is implementation defined
     * whether the reader or writer will block. Read locks can be taken
     * recursively.
     * <p>
     * Calling g_rw_lock_reader_lock() while the current thread already
     * owns a write lock leads to undefined behaviour. Read locks however
     * can be taken recursively, in which case you need to make sure to
     * call g_rw_lock_reader_unlock() the same amount of times.
     * <p>
     * It is implementation-defined how many read locks are allowed to be
     * held on the same lock simultaneously. If the limit is hit,
     * or if a deadlock is detected, a critical warning will be emitted.
     */
    public void readerLock() {
        try {
            DowncallHandles.g_rw_lock_reader_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to obtain a read lock on {@code rw_lock} and returns {@code true} if
     * the read lock was successfully obtained. Otherwise it
     * returns {@code false}.
     * @return {@code true} if {@code rw_lock} could be locked
     */
    public boolean readerTrylock() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rw_lock_reader_trylock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Release a read lock on {@code rw_lock}.
     * <p>
     * Calling g_rw_lock_reader_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void readerUnlock() {
        try {
            DowncallHandles.g_rw_lock_reader_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Obtain a write lock on {@code rw_lock}. If another thread currently holds
     * a read or write lock on {@code rw_lock}, the current thread will block
     * until all other threads have dropped their locks on {@code rw_lock}.
     * <p>
     * Calling g_rw_lock_writer_lock() while the current thread already
     * owns a read or write lock on {@code rw_lock} leads to undefined behaviour.
     */
    public void writerLock() {
        try {
            DowncallHandles.g_rw_lock_writer_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to obtain a write lock on {@code rw_lock}. If another thread
     * currently holds a read or write lock on {@code rw_lock}, it immediately
     * returns {@code false}.
     * Otherwise it locks {@code rw_lock} and returns {@code true}.
     * @return {@code true} if {@code rw_lock} could be locked
     */
    public boolean writerTrylock() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rw_lock_writer_trylock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Release a write lock on {@code rw_lock}.
     * <p>
     * Calling g_rw_lock_writer_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void writerUnlock() {
        try {
            DowncallHandles.g_rw_lock_writer_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_rw_lock_clear = Interop.downcallHandle(
                "g_rw_lock_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_init = Interop.downcallHandle(
                "g_rw_lock_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_reader_lock = Interop.downcallHandle(
                "g_rw_lock_reader_lock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_reader_trylock = Interop.downcallHandle(
                "g_rw_lock_reader_trylock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_reader_unlock = Interop.downcallHandle(
                "g_rw_lock_reader_unlock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_writer_lock = Interop.downcallHandle(
                "g_rw_lock_writer_lock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_writer_trylock = Interop.downcallHandle(
                "g_rw_lock_writer_trylock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_rw_lock_writer_unlock = Interop.downcallHandle(
                "g_rw_lock_writer_unlock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link RWLock.Builder} object constructs a {@link RWLock} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RWLock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RWLock struct;
        
        private Builder() {
            struct = RWLock.allocate();
        }
        
        /**
         * Finish building the {@link RWLock} struct.
         * @return A new instance of {@code RWLock} with the fields 
         *         that were set in the Builder object.
         */
        public RWLock build() {
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
        
        public Builder setI(int[] i) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("i"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (i == null ? MemoryAddress.NULL : Interop.allocateNativeArray(i, false, SCOPE)));
                return this;
            }
        }
    }
}
