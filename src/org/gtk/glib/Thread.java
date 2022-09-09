package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GThread struct represents a running thread. This struct
 * is returned by g_thread_new() or g_thread_try_new(). You can
 * obtain the #GThread struct representing the current thread by
 * calling g_thread_self().
 * 
 * GThread is refcounted, see g_thread_ref() and g_thread_unref().
 * The thread represented by it holds a reference while it is running,
 * and g_thread_join() consumes the reference that it is given, so
 * it is normally not necessary to manage GThread references
 * explicitly.
 * 
 * The structure is opaque -- none of its fields may be directly
 * accessed.
 */
public class Thread extends io.github.jwharm.javagi.interop.ResourceBase {

    public Thread(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Waits until @thread finishes, i.e. the function @func, as
     * given to g_thread_new(), returns or g_thread_exit() is called.
     * If @thread has already terminated, then g_thread_join()
     * returns immediately.
     * 
     * Any thread can wait for any other thread by calling g_thread_join(),
     * not just its 'creator'. Calling g_thread_join() from multiple threads
     * for the same @thread leads to undefined behaviour.
     * 
     * The value returned by @func or given to g_thread_exit() is
     * returned by this function.
     * 
     * g_thread_join() consumes the reference to the passed-in @thread.
     * This will usually cause the #GThread struct and associated resources
     * to be freed. Use g_thread_ref() to obtain an extra reference if you
     * want to keep the GThread alive beyond the g_thread_join() call.
     */
    public jdk.incubator.foreign.MemoryAddress join() {
        var RESULT = gtk_h.g_thread_join(handle());
        return RESULT;
    }
    
    /**
     * Increase the reference count on @thread.
     */
    public Thread ref() {
        var RESULT = gtk_h.g_thread_ref(handle());
        return new Thread(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count on @thread, possibly freeing all
     * resources associated with it.
     * 
     * Note that each thread holds a reference to its #GThread while
     * it is running, so it is safe to drop your own reference to it
     * if you don't need it anymore.
     */
    public void unref() {
        gtk_h.g_thread_unref(handle());
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_thread_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Terminates the current thread.
     * 
     * If another thread is waiting for us using g_thread_join() then the
     * waiting thread will be woken up and get @retval as the return value
     * of g_thread_join().
     * 
     * Calling g_thread_exit() with a parameter @retval is equivalent to
     * returning @retval from the function @func, as given to g_thread_new().
     * 
     * You must only call g_thread_exit() from a thread that you created
     * yourself with g_thread_new() or related APIs. You must not call
     * this function from a thread created with another threading library
     * or or from within a #GThreadPool.
     */
    public static void exit(jdk.incubator.foreign.MemoryAddress retval) {
        gtk_h.g_thread_exit(retval);
    }
    
    /**
     * This function returns the #GThread corresponding to the
     * current thread. Note that this function does not increase
     * the reference count of the returned struct.
     * 
     * This function will return a #GThread even for threads that
     * were not created by GLib (i.e. those created by other threading
     * APIs). This may be useful for thread identification purposes
     * (i.e. comparisons) but you must not use GLib functions (such
     * as g_thread_join()) on these threads.
     */
    public static Thread self() {
        var RESULT = gtk_h.g_thread_self();
        return new Thread(References.get(RESULT, false));
    }
    
    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     * 
     * This function is often used as a method to make busy wait less evil.
     */
    public static void yield() {
        gtk_h.g_thread_yield();
    }
    
}
