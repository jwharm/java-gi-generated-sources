package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link ThreadPool} struct represents a thread pool. It has three
 * public read-only members, but the underlying struct is bigger,
 * so you must not copy this struct.
 */
public class ThreadPool extends io.github.jwharm.javagi.ResourceBase {

    public ThreadPool(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees all resources allocated for {@code pool}.
     * <p>
     * If {@code immediate} is <code>true</code>, no new task is processed for {@code pool}.
     * Otherwise {@code pool} is not freed before the last task is processed.
     * Note however, that no thread of this pool is interrupted while
     * processing a task. Instead at least all still running threads
     * can finish their tasks before the {@code pool} is freed.
     * <p>
     * If {@code wait_} is <code>true</code>, this function does not return before all
     * tasks to be processed (dependent on {@code immediate}, whether all
     * or only the currently running) are ready.
     * Otherwise this function returns immediately.
     * <p>
     * After calling this function {@code pool} must not be used anymore.
     */
    public void free(boolean immediate, boolean wait) {
        gtk_h.g_thread_pool_free(handle(), immediate ? 1 : 0, wait ? 1 : 0);
    }
    
    /**
     * Returns the maximal number of threads for {@code pool}.
     */
    public int getMaxThreads() {
        var RESULT = gtk_h.g_thread_pool_get_max_threads(handle());
        return RESULT;
    }
    
    /**
     * Returns the number of threads currently running in {@code pool}.
     */
    public int getNumThreads() {
        var RESULT = gtk_h.g_thread_pool_get_num_threads(handle());
        return RESULT;
    }
    
    /**
     * Moves the item to the front of the queue of unprocessed
     * items, so that it will be processed next.
     */
    public boolean moveToFront(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_thread_pool_move_to_front(handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Inserts {@code data} into the list of tasks to be executed by {@code pool}.
     * <p>
     * When the number of currently running threads is lower than the
     * maximal allowed number of threads, a new thread is started (or
     * reused) with the properties given to g_thread_pool_new().
     * Otherwise, {@code data} stays in the queue until a thread in this pool
     * finishes its previous task and processes {@code data}.
     * <p>
     * {@code error} can be <code>null</code> to ignore errors, or non-<code>null</code> to report
     * errors. An error can only occur when a new thread couldn't be
     * created. In that case {@code data} is simply appended to the queue of
     * work to do.
     * <p>
     * Before version 2.32, this function did not return a success status.
     */
    public boolean push(java.lang.foreign.MemoryAddress data) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_thread_pool_push(handle(), data, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the maximal allowed number of threads for {@code pool}.
     * A value of -1 means that the maximal number of threads
     * is unlimited. If {@code pool} is an exclusive thread pool, setting
     * the maximal number of threads to -1 is not allowed.
     * <p>
     * Setting {@code max_threads} to 0 means stopping all work for {@code pool}.
     * It is effectively frozen until {@code max_threads} is set to a non-zero
     * value again.
     * <p>
     * A thread is never terminated while calling {@code func}, as supplied by
     * g_thread_pool_new(). Instead the maximal number of threads only
     * has effect for the allocation of new threads in g_thread_pool_push().
     * A new thread is allocated, whenever the number of currently
     * running threads in {@code pool} is smaller than the maximal number.
     * <p>
     * {@code error} can be <code>null</code> to ignore errors, or non-<code>null</code> to report
     * errors. An error can only occur when a new thread couldn't be
     * created.
     * <p>
     * Before version 2.32, this function did not return a success status.
     */
    public boolean setMaxThreads(int maxThreads) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_thread_pool_set_max_threads(handle(), maxThreads, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the function used to sort the list of tasks. This allows the
     * tasks to be processed by a priority determined by {@code func}, and not
     * just in the order in which they were added to the pool.
     * <p>
     * Note, if the maximum number of threads is more than 1, the order
     * that threads are executed cannot be guaranteed 100%. Threads are
     * scheduled by the operating system and are executed at random. It
     * cannot be assumed that threads are executed in the order they are
     * created.
     */
    public void setSortFunction(CompareDataFunc func) {
        try {
            gtk_h.g_thread_pool_set_sort_function(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the number of tasks still unprocessed in {@code pool}.
     */
    public int unprocessed() {
        var RESULT = gtk_h.g_thread_pool_unprocessed(handle());
        return RESULT;
    }
    
    /**
     * This function will return the maximum {@code interval} that a
     * thread will wait in the thread pool for new tasks before
     * being stopped.
     * <p>
     * If this function returns 0, threads waiting in the thread
     * pool for new work are not stopped.
     */
    public static int getMaxIdleTime() {
        var RESULT = gtk_h.g_thread_pool_get_max_idle_time();
        return RESULT;
    }
    
    /**
     * Returns the maximal allowed number of unused threads.
     */
    public static int getMaxUnusedThreads() {
        var RESULT = gtk_h.g_thread_pool_get_max_unused_threads();
        return RESULT;
    }
    
    /**
     * Returns the number of currently unused threads.
     */
    public static int getNumUnusedThreads() {
        var RESULT = gtk_h.g_thread_pool_get_num_unused_threads();
        return RESULT;
    }
    
    /**
     * This function creates a new thread pool.
     * <p>
     * Whenever you call g_thread_pool_push(), either a new thread is
     * created or an unused one is reused. At most {@code max_threads} threads
     * are running concurrently for this thread pool. {@code max_threads} = -1
     * allows unlimited threads to be created for this thread pool. The
     * newly created or reused thread now executes the function {@code func}
     * with the two arguments. The first one is the parameter to
     * g_thread_pool_push() and the second one is {@code user_data}.
     * <p>
     * Pass g_get_num_processors() to {@code max_threads} to create as many threads as
     * there are logical processors on the system. This will not pin each thread to
     * a specific processor.
     * <p>
     * The parameter {@code exclusive} determines whether the thread pool owns
     * all threads exclusive or shares them with other thread pools.
     * If {@code exclusive} is <code>true</code>, {@code max_threads} threads are started
     * immediately and they will run exclusively for this thread pool
     * until it is destroyed by g_thread_pool_free(). If {@code exclusive} is
     * <code>false</code>, threads are created when needed and shared between all
     * non-exclusive thread pools. This implies that {@code max_threads} may
     * not be -1 for exclusive thread pools. Besides, exclusive thread
     * pools are not affected by g_thread_pool_set_max_idle_time()
     * since their threads are never considered idle and returned to the
     * global pool.
     * <p>
     * {@code error} can be <code>null</code> to ignore errors, or non-<code>null</code> to report
     * errors. An error can only occur when {@code exclusive} is set to <code>true</code>
     * and not all {@code max_threads} threads could be created.
     * See {@link ThreadError} for possible errors that may occur.
     * Note, even in case of error a valid {@link ThreadPool} is returned.
     */
    public static ThreadPool new_(Func func, int maxThreads, boolean exclusive) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_thread_pool_new(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), maxThreads, exclusive ? 1 : 0, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new ThreadPool(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function creates a new thread pool similar to g_thread_pool_new()
     * but allowing {@code item_free_func} to be specified to free the data passed
     * to g_thread_pool_push() in the case that the {@link ThreadPool} is stopped
     * and freed before all tasks have been executed.
     */
    public static ThreadPool newFull(Func func, int maxThreads, boolean exclusive) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_thread_pool_new_full(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol(), maxThreads, exclusive ? 1 : 0, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new ThreadPool(References.get(RESULT, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function will set the maximum {@code interval} that a thread
     * waiting in the pool for new tasks can be idle for before
     * being stopped. This function is similar to calling
     * g_thread_pool_stop_unused_threads() on a regular timeout,
     * except this is done on a per thread basis.
     * <p>
     * By setting {@code interval} to 0, idle threads will not be stopped.
     * <p>
     * The default value is 15000 (15 seconds).
     */
    public static void setMaxIdleTime(int interval) {
        gtk_h.g_thread_pool_set_max_idle_time(interval);
    }
    
    /**
     * Sets the maximal number of unused threads to {@code max_threads}.
     * If {@code max_threads} is -1, no limit is imposed on the number
     * of unused threads.
     * <p>
     * The default value is 2.
     */
    public static void setMaxUnusedThreads(int maxThreads) {
        gtk_h.g_thread_pool_set_max_unused_threads(maxThreads);
    }
    
    /**
     * Stops all currently unused threads. This does not change the
     * maximal number of unused threads. This function can be used to
     * regularly stop all unused threads e.g. from g_timeout_add().
     */
    public static void stopUnusedThreads() {
        gtk_h.g_thread_pool_stop_unused_threads();
    }
    
}
