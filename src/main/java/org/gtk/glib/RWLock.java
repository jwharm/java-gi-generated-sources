package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class RWLock extends io.github.jwharm.javagi.ResourceBase {

    public RWLock(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_rw_lock_clear = Interop.downcallHandle(
        "g_rw_lock_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated to a lock with g_rw_lock_init().
     * <p>
     * This function should not be used with a {@link RWLock} that has been
     * statically allocated.
     * <p>
     * Calling g_rw_lock_clear() when any thread holds the lock
     * leads to undefined behaviour.
     * <p>
     * Sine: 2.32
     */
    public void clear() {
        try {
            g_rw_lock_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_init = Interop.downcallHandle(
        "g_rw_lock_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link RWLock} so that it can be used.
     * <p>
     * This function is useful to initialize a lock that has been
     * allocated on the stack, or as part of a larger structure.  It is not
     * necessary to initialise a reader-writer lock that has been statically
     * allocated.
     * <p>
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
            g_rw_lock_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_reader_lock = Interop.downcallHandle(
        "g_rw_lock_reader_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            g_rw_lock_reader_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_reader_trylock = Interop.downcallHandle(
        "g_rw_lock_reader_trylock",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to obtain a read lock on {@code rw_lock} and returns {@code true} if
     * the read lock was successfully obtained. Otherwise it
     * returns {@code false}.
     */
    public boolean readerTrylock() {
        try {
            var RESULT = (int) g_rw_lock_reader_trylock.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_reader_unlock = Interop.downcallHandle(
        "g_rw_lock_reader_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Release a read lock on {@code rw_lock}.
     * <p>
     * Calling g_rw_lock_reader_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void readerUnlock() {
        try {
            g_rw_lock_reader_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_writer_lock = Interop.downcallHandle(
        "g_rw_lock_writer_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            g_rw_lock_writer_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_writer_trylock = Interop.downcallHandle(
        "g_rw_lock_writer_trylock",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to obtain a write lock on {@code rw_lock}. If another thread
     * currently holds a read or write lock on {@code rw_lock}, it immediately
     * returns {@code false}.
     * Otherwise it locks {@code rw_lock} and returns {@code true}.
     */
    public boolean writerTrylock() {
        try {
            var RESULT = (int) g_rw_lock_writer_trylock.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rw_lock_writer_unlock = Interop.downcallHandle(
        "g_rw_lock_writer_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Release a write lock on {@code rw_lock}.
     * <p>
     * Calling g_rw_lock_writer_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void writerUnlock() {
        try {
            g_rw_lock_writer_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
