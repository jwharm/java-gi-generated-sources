package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

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

    public RecMutex(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
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
    public void clear() {
        gtk_h.g_rec_mutex_clear(handle());
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
     * <p>
     * |[&lt;!-- language="C" --&gt;
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     * <p>
     * Blob *b;
     * <p>
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&b->m);
     * ]|
     * <p>
     * Calling g_rec_mutex_init() on an already initialized {@link RecMutex}
     * leads to undefined behaviour.
     * <p>
     * To undo the effect of g_rec_mutex_init() when a recursive mutex
     * is no longer needed, use g_rec_mutex_clear().
     */
    public void init() {
        gtk_h.g_rec_mutex_init(handle());
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
        gtk_h.g_rec_mutex_lock(handle());
    }
    
    /**
     * Tries to lock {@code rec_mutex}. If {@code rec_mutex} is already locked
     * by another thread, it immediately returns <code>false</code>. Otherwise
     * it locks {@code rec_mutex} and returns <code>true</code>.
     */
    public boolean trylock() {
        var RESULT = gtk_h.g_rec_mutex_trylock(handle());
        return (RESULT != 0);
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
        gtk_h.g_rec_mutex_unlock(handle());
    }
    
}
