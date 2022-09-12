package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GRecMutex struct is an opaque data structure to represent a
 * recursive mutex. It is similar to a #GMutex with the difference
 * that it is possible to lock a GRecMutex multiple times in the same
 * thread without deadlock. When doing so, care has to be taken to
 * unlock the recursive mutex as often as it has been locked.
 * 
 * If a #GRecMutex is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rec_mutex_init() on it and g_rec_mutex_clear() when done.
 * 
 * A GRecMutex should only be accessed with the
 * g_rec_mutex_ functions.
 */
public class RecMutex extends io.github.jwharm.javagi.ResourceBase {

    public RecMutex(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees the resources allocated to a recursive mutex with
     * g_rec_mutex_init().
     * 
     * This function should not be used with a #GRecMutex that has been
     * statically allocated.
     * 
     * Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * to undefined behaviour.
     * 
     * Sine: 2.32
     */
    public void clear() {
        gtk_h.g_rec_mutex_clear(handle());
    }
    
    /**
     * Initializes a #GRecMutex so that it can be used.
     * 
     * This function is useful to initialize a recursive mutex
     * that has been allocated on the stack, or as part of a larger
     * structure.
     * 
     * It is not necessary to initialise a recursive mutex that has been
     * statically allocated.
     * 
     * |[<!-- language="C" -->
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&b->m);
     * ]|
     * 
     * Calling g_rec_mutex_init() on an already initialized #GRecMutex
     * leads to undefined behaviour.
     * 
     * To undo the effect of g_rec_mutex_init() when a recursive mutex
     * is no longer needed, use g_rec_mutex_clear().
     */
    public void init() {
        gtk_h.g_rec_mutex_init(handle());
    }
    
    /**
     * Locks @rec_mutex. If @rec_mutex is already locked by another
     * thread, the current thread will block until @rec_mutex is
     * unlocked by the other thread. If @rec_mutex is already locked
     * by the current thread, the 'lock count' of @rec_mutex is increased.
     * The mutex will only become available again when it is unlocked
     * as many times as it has been locked.
     */
    public void lock() {
        gtk_h.g_rec_mutex_lock(handle());
    }
    
    /**
     * Tries to lock @rec_mutex. If @rec_mutex is already locked
     * by another thread, it immediately returns %FALSE. Otherwise
     * it locks @rec_mutex and returns %TRUE.
     */
    public boolean trylock() {
        var RESULT = gtk_h.g_rec_mutex_trylock(handle());
        return (RESULT != 0);
    }
    
    /**
     * Unlocks @rec_mutex. If another thread is blocked in a
     * g_rec_mutex_lock() call for @rec_mutex, it will become unblocked
     * and can lock @rec_mutex itself.
     * 
     * Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * locked by the current thread leads to undefined behaviour.
     */
    public void unlock() {
        gtk_h.g_rec_mutex_unlock(handle());
    }
    
}
