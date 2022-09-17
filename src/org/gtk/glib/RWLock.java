package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GRWLock struct is an opaque data structure to represent a
 * reader-writer lock. It is similar to a #GMutex in that it allows
 * multiple threads to coordinate access to a shared resource.
 * 
 * The difference to a mutex is that a reader-writer lock discriminates
 * between read-only (&#39;reader&#39;) and full (&#39;writer&#39;) access. While only
 * one thread at a time is allowed write access (by holding the &#39;writer&#39;
 * lock via g_rw_lock_writer_lock()), multiple threads can gain
 * simultaneous read-only access (by holding the &#39;reader&#39; lock via
 * g_rw_lock_reader_lock()).
 * 
 * It is unspecified whether readers or writers have priority in acquiring the
 * lock when a reader already holds the lock and a writer is queued to acquire
 * it.
 * 
 * Here is an example for an array with access functions:
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
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
 *     g_rw_lock_reader_lock (&#38;lock);
 *     if (index &#60; array-&#62;len)
 *       retval = g_ptr_array_index (array, index);
 *     g_rw_lock_reader_unlock (&#38;lock);
 * 
 *     return retval;
 *   }
 * 
 *   void
 *   my_array_set (guint index, gpointer data)
 *   {
 *     g_rw_lock_writer_lock (&#38;lock);
 * 
 *     if (!array)
 *       array = g_ptr_array_new ();
 * 
 *     if (index &#62;= array-&#62;len)
 *       g_ptr_array_set_size (array, index+1);
 *     g_ptr_array_index (array, index) = data;
 * 
 *     g_rw_lock_writer_unlock (&#38;lock);
 *   }
 *  ]}|
 * This example shows an array which can be accessed by many readers
 * (the my_array_get() function) simultaneously, whereas the writers
 * (the my_array_set() function) will only be allowed one at a time
 * and only if no readers currently access the array. This is because
 * of the potentially dangerous resizing of the array. Using these
 * functions is fully multi-thread safe now.
 * 
 * If a #GRWLock is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rw_lock_init() on it and g_rw_lock_clear() when done.
 * 
 * A GRWLock should only be accessed with the g_rw_lock_ functions.
 */
public class RWLock extends io.github.jwharm.javagi.ResourceBase {

    public RWLock(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees the resources allocated to a lock with g_rw_lock_init().
     * 
     * This function should not be used with a #GRWLock that has been
     * statically allocated.
     * 
     * Calling g_rw_lock_clear() when any thread holds the lock
     * leads to undefined behaviour.
     * 
     * Sine: 2.32
     */
    public void clear() {
        gtk_h.g_rw_lock_clear(handle());
    }
    
    /**
     * Initializes a #GRWLock so that it can be used.
     * 
     * This function is useful to initialize a lock that has been
     * allocated on the stack, or as part of a larger structure.  It is not
     * necessary to initialise a reader-writer lock that has been statically
     * allocated.
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     *   typedef struct {
     *     GRWLock l;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rw_lock_init (&#38;b-&#62;l);
     * ]}|
     * 
     * To undo the effect of g_rw_lock_init() when a lock is no longer
     * needed, use g_rw_lock_clear().
     * 
     * Calling g_rw_lock_init() on an already initialized #GRWLock leads
     * to undefined behaviour.
     */
    public void init() {
        gtk_h.g_rw_lock_init(handle());
    }
    
    /**
     * Obtain a read lock on @rw_lock. If another thread currently holds
     * the write lock on @rw_lock, the current thread will block until the
     * write lock was (held and) released. If another thread does not hold
     * the write lock, but is waiting for it, it is implementation defined
     * whether the reader or writer will block. Read locks can be taken
     * recursively.
     * 
     * Calling g_rw_lock_reader_lock() while the current thread already
     * owns a write lock leads to undefined behaviour. Read locks however
     * can be taken recursively, in which case you need to make sure to
     * call g_rw_lock_reader_unlock() the same amount of times.
     * 
     * It is implementation-defined how many read locks are allowed to be
     * held on the same lock simultaneously. If the limit is hit,
     * or if a deadlock is detected, a critical warning will be emitted.
     */
    public void readerLock() {
        gtk_h.g_rw_lock_reader_lock(handle());
    }
    
    /**
     * Tries to obtain a read lock on @rw_lock and returns <code>true</code> if
     * the read lock was successfully obtained. Otherwise it
     * returns if
     * the read lock was successfully obtained. Otherwise it
     * returns %FALSE.
     */
    public boolean readerTrylock() {
        var RESULT = gtk_h.g_rw_lock_reader_trylock(handle());
        return (RESULT != 0);
    }
    
    /**
     * Release a read lock on @rw_lock.
     * 
     * Calling g_rw_lock_reader_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void readerUnlock() {
        gtk_h.g_rw_lock_reader_unlock(handle());
    }
    
    /**
     * Obtain a write lock on @rw_lock. If another thread currently holds
     * a read or write lock on @rw_lock, the current thread will block
     * until all other threads have dropped their locks on @rw_lock.
     * 
     * Calling g_rw_lock_writer_lock() while the current thread already
     * owns a read or write lock on @rw_lock leads to undefined behaviour.
     */
    public void writerLock() {
        gtk_h.g_rw_lock_writer_lock(handle());
    }
    
    /**
     * Tries to obtain a write lock on @rw_lock. If another thread
     * currently holds a read or write lock on @rw_lock, it immediately
     * returns <code>FALSE.
     * Otherwise</code> it locks @rw_lock and returns it locks @rw_lock and returns %TRUE.
     */
    public boolean writerTrylock() {
        var RESULT = gtk_h.g_rw_lock_writer_trylock(handle());
        return (RESULT != 0);
    }
    
    /**
     * Release a write lock on @rw_lock.
     * 
     * Calling g_rw_lock_writer_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     */
    public void writerUnlock() {
        gtk_h.g_rw_lock_writer_unlock(handle());
    }
    
}
