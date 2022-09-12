package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GCond struct is an opaque data structure that represents a
 * condition. Threads can block on a #GCond if they find a certain
 * condition to be false. If other threads change the state of this
 * condition they signal the #GCond, and that causes the waiting
 * threads to be woken up.
 * 
 * Consider the following example of a shared variable.  One or more
 * threads can wait for data to be published to the variable and when
 * another thread publishes the data, it can signal one of the waiting
 * threads to wake up to collect the data.
 * 
 * Here is an example for using GCond to block a thread until a condition
 * is satisfied:
 * |[<!-- language="C" -->
 *   gpointer current_data = NULL;
 *   GMutex data_mutex;
 *   GCond data_cond;
 * 
 *   void
 *   push_data (gpointer data)
 *   {
 *     g_mutex_lock (&data_mutex);
 *     current_data = data;
 *     g_cond_signal (&data_cond);
 *     g_mutex_unlock (&data_mutex);
 *   }
 * 
 *   gpointer
 *   pop_data (void)
 *   {
 *     gpointer data;
 * 
 *     g_mutex_lock (&data_mutex);
 *     while (!current_data)
 *       g_cond_wait (&data_cond, &data_mutex);
 *     data = current_data;
 *     current_data = NULL;
 *     g_mutex_unlock (&data_mutex);
 * 
 *     return data;
 *   }
 * ]|
 * Whenever a thread calls pop_data() now, it will wait until
 * current_data is non-%NULL, i.e. until some other thread
 * has called push_data().
 * 
 * The example shows that use of a condition variable must always be
 * paired with a mutex.  Without the use of a mutex, there would be a
 * race between the check of @current_data by the while loop in
 * pop_data() and waiting. Specifically, another thread could set
 * @current_data after the check, and signal the cond (with nobody
 * waiting on it) before the first thread goes to sleep. #GCond is
 * specifically useful for its ability to release the mutex and go
 * to sleep atomically.
 * 
 * It is also important to use the g_cond_wait() and g_cond_wait_until()
 * functions only inside a loop which checks for the condition to be
 * true.  See g_cond_wait() for an explanation of why the condition may
 * not be true even after it returns.
 * 
 * If a #GCond is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call g_cond_init()
 * on it and g_cond_clear() when done.
 * 
 * A #GCond should only be accessed via the g_cond_ functions.
 */
public class Cond extends io.github.jwharm.javagi.ResourceBase {

    public Cond(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * If threads are waiting for @cond, all of them are unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to lock the same mutex as the waiting threads
     * while calling this function, though not required.
     */
    public void broadcast() {
        gtk_h.g_cond_broadcast(handle());
    }
    
    /**
     * Frees the resources allocated to a #GCond with g_cond_init().
     * 
     * This function should not be used with a #GCond that has been
     * statically allocated.
     * 
     * Calling g_cond_clear() for a #GCond on which threads are
     * blocking leads to undefined behaviour.
     */
    public void clear() {
        gtk_h.g_cond_clear(handle());
    }
    
    /**
     * Initialises a #GCond so that it can be used.
     * 
     * This function is useful to initialise a #GCond that has been
     * allocated as part of a larger structure.  It is not necessary to
     * initialise a #GCond that has been statically allocated.
     * 
     * To undo the effect of g_cond_init() when a #GCond is no longer
     * needed, use g_cond_clear().
     * 
     * Calling g_cond_init() on an already-initialised #GCond leads
     * to undefined behaviour.
     */
    public void init() {
        gtk_h.g_cond_init(handle());
    }
    
    /**
     * If threads are waiting for @cond, at least one of them is unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to hold the same lock as the waiting thread
     * while calling this function, though not required.
     */
    public void signal() {
        gtk_h.g_cond_signal(handle());
    }
    
    /**
     * Atomically releases @mutex and waits until @cond is signalled.
     * When this function returns, @mutex is locked again and owned by the
     * calling thread.
     * 
     * When using condition variables, it is possible that a spurious wakeup
     * may occur (ie: g_cond_wait() returns even though g_cond_signal() was
     * not called).  It's also possible that a stolen wakeup may occur.
     * This is when g_cond_signal() is called, but another thread acquires
     * @mutex before this thread and modifies the state of the program in
     * such a way that when g_cond_wait() is able to return, the expected
     * condition is no longer met.
     * 
     * For this reason, g_cond_wait() must always be used in a loop.  See
     * the documentation for #GCond for a complete example.
     */
    public void wait(Mutex mutex) {
        gtk_h.g_cond_wait(handle(), mutex.handle());
    }
    
    /**
     * Waits until either @cond is signalled or @end_time has passed.
     * 
     * As with g_cond_wait() it is possible that a spurious or stolen wakeup
     * could occur.  For that reason, waiting on a condition variable should
     * always be in a loop, based on an explicitly-checked predicate.
     * 
     * %TRUE is returned if the condition variable was signalled (or in the
     * case of a spurious wakeup).  %FALSE is returned if @end_time has
     * passed.
     * 
     * The following code shows how to correctly perform a timed wait on a
     * condition variable (extending the example presented in the
     * documentation for #GCond):
     * 
     * |[<!-- language="C" -->
     * gpointer
     * pop_data_timed (void)
     * {
     *   gint64 end_time;
     *   gpointer data;
     * 
     *   g_mutex_lock (&data_mutex);
     * 
     *   end_time = g_get_monotonic_time () + 5 * G_TIME_SPAN_SECOND;
     *   while (!current_data)
     *     if (!g_cond_wait_until (&data_cond, &data_mutex, end_time))
     *       {
     *         // timeout has passed.
     *         g_mutex_unlock (&data_mutex);
     *         return NULL;
     *       }
     * 
     *   // there is data for us
     *   data = current_data;
     *   current_data = NULL;
     * 
     *   g_mutex_unlock (&data_mutex);
     * 
     *   return data;
     * }
     * ]|
     * 
     * Notice that the end time is calculated once, before entering the
     * loop and reused.  This is the motivation behind the use of absolute
     * time on this API -- if a relative time of 5 seconds were passed
     * directly to the call and a spurious wakeup occurred, the program would
     * have to start over waiting again (which would lead to a total wait
     * time of more than 5 seconds).
     */
    public boolean waitUntil(Mutex mutex, long endTime) {
        var RESULT = gtk_h.g_cond_wait_until(handle(), mutex.handle(), endTime);
        return (RESULT != 0);
    }
    
}
