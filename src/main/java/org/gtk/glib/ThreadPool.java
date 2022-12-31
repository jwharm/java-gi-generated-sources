package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ThreadPool} struct represents a thread pool. It has three
 * public read-only members, but the underlying struct is bigger,
 * so you must not copy this struct.
 */
public class ThreadPool extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GThreadPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("func"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.C_INT.withName("exclusive")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ThreadPool}
     * @return A new, uninitialized @{link ThreadPool}
     */
    public static ThreadPool allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ThreadPool newInstance = new ThreadPool(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code func}
     * @return The value of the field {@code func}
     */
    public org.gtk.glib.Func getFunc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code func}
     * @param func The new value of the field {@code func}
     */
    public void setFunc(org.gtk.glib.Func func) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
    }
    
    /**
     * Get the value of the field {@code exclusive}
     * @return The value of the field {@code exclusive}
     */
    public boolean getExclusive() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("exclusive"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code exclusive}
     * @param exclusive The new value of the field {@code exclusive}
     */
    public void setExclusive(boolean exclusive) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("exclusive"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(exclusive, null).intValue());
    }
    
    /**
     * Create a ThreadPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ThreadPool(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ThreadPool> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ThreadPool(input, ownership);
    
    /**
     * Frees all resources allocated for {@code pool}.
     * <p>
     * If {@code immediate} is {@code true}, no new task is processed for {@code pool}.
     * Otherwise {@code pool} is not freed before the last task is processed.
     * Note however, that no thread of this pool is interrupted while
     * processing a task. Instead at least all still running threads
     * can finish their tasks before the {@code pool} is freed.
     * <p>
     * If {@code wait_} is {@code true}, this function does not return before all
     * tasks to be processed (dependent on {@code immediate}, whether all
     * or only the currently running) are ready.
     * Otherwise this function returns immediately.
     * <p>
     * After calling this function {@code pool} must not be used anymore.
     * @param immediate should {@code pool} shut down immediately?
     * @param wait_ should the function wait for all tasks to be finished?
     */
    public void free(boolean immediate, boolean wait_) {
        try {
            DowncallHandles.g_thread_pool_free.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(immediate, null).intValue(),
                    Marshal.booleanToInteger.marshal(wait_, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the maximal number of threads for {@code pool}.
     * @return the maximal number of threads
     */
    public int getMaxThreads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_get_max_threads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of threads currently running in {@code pool}.
     * @return the number of threads currently running
     */
    public int getNumThreads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_get_num_threads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Moves the item to the front of the queue of unprocessed
     * items, so that it will be processed next.
     * @return {@code true} if the item was found and moved
     */
    public boolean moveToFront() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_move_to_front.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * {@code error} can be {@code null} to ignore errors, or non-{@code null} to report
     * errors. An error can only occur when a new thread couldn't be
     * created. In that case {@code data} is simply appended to the queue of
     * work to do.
     * <p>
     * Before version 2.32, this function did not return a success status.
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean push() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_push.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * {@code error} can be {@code null} to ignore errors, or non-{@code null} to report
     * errors. An error can only occur when a new thread couldn't be
     * created.
     * <p>
     * Before version 2.32, this function did not return a success status.
     * @param maxThreads a new maximal number of threads for {@code pool},
     *     or -1 for unlimited
     * @return {@code true} on success, {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setMaxThreads(int maxThreads) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_set_max_threads.invokeExact(
                    handle(),
                    maxThreads,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param func the {@link CompareDataFunc} used to sort the list of tasks.
     *     This function is passed two tasks. It should return
     *     0 if the order in which they are handled does not matter,
     *     a negative value if the first task should be processed before
     *     the second or a positive value if the second task should be
     *     processed first.
     */
    public void setSortFunction(org.gtk.glib.CompareDataFunc func) {
        try {
            DowncallHandles.g_thread_pool_set_sort_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the number of tasks still unprocessed in {@code pool}.
     * @return the number of unprocessed tasks
     */
    public int unprocessed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_unprocessed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function will return the maximum {@code interval} that a
     * thread will wait in the thread pool for new tasks before
     * being stopped.
     * <p>
     * If this function returns 0, threads waiting in the thread
     * pool for new work are not stopped.
     * @return the maximum {@code interval} (milliseconds) to wait
     *     for new tasks in the thread pool before stopping the
     *     thread
     */
    public static int getMaxIdleTime() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_get_max_idle_time.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the maximal allowed number of unused threads.
     * @return the maximal number of unused threads
     */
    public static int getMaxUnusedThreads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_get_max_unused_threads.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of currently unused threads.
     * @return the number of currently unused threads
     */
    public static int getNumUnusedThreads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_pool_get_num_unused_threads.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code exclusive} is {@code true}, {@code max_threads} threads are started
     * immediately and they will run exclusively for this thread pool
     * until it is destroyed by g_thread_pool_free(). If {@code exclusive} is
     * {@code false}, threads are created when needed and shared between all
     * non-exclusive thread pools. This implies that {@code max_threads} may
     * not be -1 for exclusive thread pools. Besides, exclusive thread
     * pools are not affected by g_thread_pool_set_max_idle_time()
     * since their threads are never considered idle and returned to the
     * global pool.
     * <p>
     * {@code error} can be {@code null} to ignore errors, or non-{@code null} to report
     * errors. An error can only occur when {@code exclusive} is set to {@code true}
     * and not all {@code max_threads} threads could be created.
     * See {@link ThreadError} for possible errors that may occur.
     * Note, even in case of error a valid {@link ThreadPool} is returned.
     * @param func a function to execute in the threads of the new thread pool
     * @param maxThreads the maximal number of threads to execute concurrently
     *     in  the new thread pool, -1 means no limit
     * @param exclusive should this thread pool be exclusive?
     * @return the new {@link ThreadPool}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.ThreadPool new_(org.gtk.glib.Func func, int maxThreads, boolean exclusive) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_pool_new.invokeExact(
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    maxThreads,
                    Marshal.booleanToInteger.marshal(exclusive, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.glib.ThreadPool.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * This function creates a new thread pool similar to g_thread_pool_new()
     * but allowing {@code item_free_func} to be specified to free the data passed
     * to g_thread_pool_push() in the case that the {@link ThreadPool} is stopped
     * and freed before all tasks have been executed.
     * @param func a function to execute in the threads of the new thread pool
     * @param itemFreeFunc used to pass as a free function to
     *     g_async_queue_new_full()
     * @param maxThreads the maximal number of threads to execute concurrently
     *     in the new thread pool, {@code -1} means no limit
     * @param exclusive should this thread pool be exclusive?
     * @return the new {@link ThreadPool}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.ThreadPool newFull(org.gtk.glib.Func func, @Nullable org.gtk.glib.DestroyNotify itemFreeFunc, int maxThreads, boolean exclusive) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_pool_new_full.invokeExact(
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (itemFreeFunc == null ? MemoryAddress.NULL : (Addressable) itemFreeFunc.toCallback()),
                    maxThreads,
                    Marshal.booleanToInteger.marshal(exclusive, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.glib.ThreadPool.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * @param interval the maximum {@code interval} (in milliseconds)
     *     a thread can be idle
     */
    public static void setMaxIdleTime(int interval) {
        try {
            DowncallHandles.g_thread_pool_set_max_idle_time.invokeExact(
                    interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximal number of unused threads to {@code max_threads}.
     * If {@code max_threads} is -1, no limit is imposed on the number
     * of unused threads.
     * <p>
     * The default value is 2.
     * @param maxThreads maximal number of unused threads
     */
    public static void setMaxUnusedThreads(int maxThreads) {
        try {
            DowncallHandles.g_thread_pool_set_max_unused_threads.invokeExact(
                    maxThreads);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops all currently unused threads. This does not change the
     * maximal number of unused threads. This function can be used to
     * regularly stop all unused threads e.g. from g_timeout_add().
     */
    public static void stopUnusedThreads() {
        try {
            DowncallHandles.g_thread_pool_stop_unused_threads.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_thread_pool_free = Interop.downcallHandle(
            "g_thread_pool_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_get_max_threads = Interop.downcallHandle(
            "g_thread_pool_get_max_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_get_num_threads = Interop.downcallHandle(
            "g_thread_pool_get_num_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_move_to_front = Interop.downcallHandle(
            "g_thread_pool_move_to_front",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_push = Interop.downcallHandle(
            "g_thread_pool_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_set_max_threads = Interop.downcallHandle(
            "g_thread_pool_set_max_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_set_sort_function = Interop.downcallHandle(
            "g_thread_pool_set_sort_function",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_unprocessed = Interop.downcallHandle(
            "g_thread_pool_unprocessed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_get_max_idle_time = Interop.downcallHandle(
            "g_thread_pool_get_max_idle_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_get_max_unused_threads = Interop.downcallHandle(
            "g_thread_pool_get_max_unused_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_get_num_unused_threads = Interop.downcallHandle(
            "g_thread_pool_get_num_unused_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_new = Interop.downcallHandle(
            "g_thread_pool_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_new_full = Interop.downcallHandle(
            "g_thread_pool_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_pool_set_max_idle_time = Interop.downcallHandle(
            "g_thread_pool_set_max_idle_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_set_max_unused_threads = Interop.downcallHandle(
            "g_thread_pool_set_max_unused_threads",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_pool_stop_unused_threads = Interop.downcallHandle(
            "g_thread_pool_stop_unused_threads",
            FunctionDescriptor.ofVoid(),
            false
        );
    }
    
    /**
     * A {@link ThreadPool.Builder} object constructs a {@link ThreadPool} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ThreadPool.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ThreadPool struct;
        
        private Builder() {
            struct = ThreadPool.allocate();
        }
        
         /**
         * Finish building the {@link ThreadPool} struct.
         * @return A new instance of {@code ThreadPool} with the fields 
         *         that were set in the Builder object.
         */
        public ThreadPool build() {
            return struct;
        }
        
        /**
         * the function to execute in the threads of this pool
         * @param func The value for the {@code func} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFunc(org.gtk.glib.Func func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()));
            return this;
        }
        
        /**
         * the user data for the threads of this pool
         * @param userData The value for the {@code userData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        /**
         * are all threads exclusive to this pool
         * @param exclusive The value for the {@code exclusive} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExclusive(boolean exclusive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("exclusive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(exclusive, null).intValue());
            return this;
        }
    }
}
