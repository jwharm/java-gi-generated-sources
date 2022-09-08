package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GThreadPool struct represents a thread pool. It has three
 * public read-only members, but the underlying struct is bigger,
 * so you must not copy this struct.
 */
public class ThreadPool extends io.github.jwharm.javagi.interop.ResourceBase {

    public ThreadPool(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees all resources allocated for @pool.
     * 
     * If @immediate is %TRUE, no new task is processed for @pool.
     * Otherwise @pool is not freed before the last task is processed.
     * Note however, that no thread of this pool is interrupted while
     * processing a task. Instead at least all still running threads
     * can finish their tasks before the @pool is freed.
     * 
     * If @wait_ is %TRUE, this function does not return before all
     * tasks to be processed (dependent on @immediate, whether all
     * or only the currently running) are ready.
     * Otherwise this function returns immediately.
     * 
     * After calling this function @pool must not be used anymore.
     */
    public void free(boolean immediate, boolean wait) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_free(HANDLE(), immediate ? 1 : 0, wait ? 1 : 0);
    }
    
    /**
     * Returns the maximal number of threads for @pool.
     */
    public int getMaxThreads() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_get_max_threads(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the number of threads currently running in @pool.
     */
    public int getNumThreads() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_get_num_threads(HANDLE());
        return RESULT;
    }
    
    /**
     * Moves the item to the front of the queue of unprocessed
     * items, so that it will be processed next.
     */
    public boolean moveToFront(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_move_to_front(HANDLE(), data);
        return (RESULT != 0);
    }
    
    /**
     * Inserts @data into the list of tasks to be executed by @pool.
     * 
     * When the number of currently running threads is lower than the
     * maximal allowed number of threads, a new thread is started (or
     * reused) with the properties given to g_thread_pool_new().
     * Otherwise, @data stays in the queue until a thread in this pool
     * finishes its previous task and processes @data.
     * 
     * @error can be %NULL to ignore errors, or non-%NULL to report
     * errors. An error can only occur when a new thread couldn't be
     * created. In that case @data is simply appended to the queue of
     * work to do.
     * 
     * Before version 2.32, this function did not return a success status.
     */
    public boolean push(jdk.incubator.foreign.MemoryAddress data) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_push(HANDLE(), data, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the maximal allowed number of threads for @pool.
     * A value of -1 means that the maximal number of threads
     * is unlimited. If @pool is an exclusive thread pool, setting
     * the maximal number of threads to -1 is not allowed.
     * 
     * Setting @max_threads to 0 means stopping all work for @pool.
     * It is effectively frozen until @max_threads is set to a non-zero
     * value again.
     * 
     * A thread is never terminated while calling @func, as supplied by
     * g_thread_pool_new(). Instead the maximal number of threads only
     * has effect for the allocation of new threads in g_thread_pool_push().
     * A new thread is allocated, whenever the number of currently
     * running threads in @pool is smaller than the maximal number.
     * 
     * @error can be %NULL to ignore errors, or non-%NULL to report
     * errors. An error can only occur when a new thread couldn't be
     * created.
     * 
     * Before version 2.32, this function did not return a success status.
     */
    public boolean setMaxThreads(int maxThreads) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_set_max_threads(HANDLE(), maxThreads, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of tasks still unprocessed in @pool.
     */
    public int unprocessed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_thread_pool_unprocessed(HANDLE());
        return RESULT;
    }
    
}
