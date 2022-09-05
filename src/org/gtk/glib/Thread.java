package org.gtk.glib;

import org.gtk.gobject.*;
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

    public Thread(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_join(HANDLE());
        return RESULT;
    }
    
    /**
     * Increase the reference count on @thread.
     */
    public Thread ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_ref(HANDLE());
        return new Thread(ProxyFactory.get(RESULT, true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_unref(HANDLE());
    }
    
}
