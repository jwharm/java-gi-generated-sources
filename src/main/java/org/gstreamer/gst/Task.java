package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Task} is used by {@link Element} and {@link Pad} to provide the data passing
 * threads in a {@link Pipeline}.
 * <p>
 * A {@link Pad} will typically start a {@link Task} to push or pull data to/from the
 * peer pads. Most source elements start a {@link Task} to push data. In some cases
 * a demuxer element can start a {@link Task} to pull data from a peer element. This
 * is typically done when the demuxer can perform random access on the upstream
 * peer element for improved performance.
 * <p>
 * Although convenience functions exist on {@link Pad} to start/pause/stop tasks, it
 * might sometimes be needed to create a {@link Task} manually if it is not related to
 * a {@link Pad}.
 * <p>
 * Before the {@link Task} can be run, it needs a {@link org.gtk.glib.RecMutex} that can be set with
 * gst_task_set_lock().
 * <p>
 * The task can be started, paused and stopped with gst_task_start(), gst_task_pause()
 * and gst_task_stop() respectively or with the gst_task_set_state() function.
 * <p>
 * A {@link Task} will repeatedly call the {@link TaskFunction} with the user data
 * that was provided when creating the task with gst_task_new(). While calling
 * the function it will acquire the provided lock. The provided lock is released
 * when the task pauses or stops.
 * <p>
 * Stopping a task with gst_task_stop() will not immediately make sure the task is
 * not running anymore. Use gst_task_join() to make sure the task is completely
 * stopped and the thread is stopped.
 * <p>
 * After creating a {@link Task}, use gst_object_unref() to free its resources. This can
 * only be done when the task is not running anymore.
 * <p>
 * Task functions can send a {@link Message} to send out-of-band data to the
 * application. The application can receive messages from the {@link Bus} in its
 * mainloop.
 * <p>
 * For debugging purposes, the task will configure its object name as the thread
 * name on Linux. Please note that the object name should be configured before the
 * task is started; changing the object name after the task has been started, has
 * no effect on the thread name.
 */
public class Task extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTask";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.C_INT.withName("state"),
            MemoryLayout.paddingLayout(32),
            org.gtk.glib.Cond.getMemoryLayout().withName("cond"),
            Interop.valueLayout.ADDRESS.withName("lock"),
            Interop.valueLayout.ADDRESS.withName("func"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.C_INT.withName("running"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("thread"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Task proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Task(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Task> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Task(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.TaskFunction func, org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_task_new.invokeExact(
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new Task that will repeatedly call the provided {@code func}
     * with {@code user_data} as a parameter. Typically the task will run in
     * a new thread.
     * <p>
     * The function cannot be changed after the task has been created. You
     * must create a new {@link Task} to change the function.
     * <p>
     * This function will not yet create and start a thread. Use gst_task_start() or
     * gst_task_pause() to create and start the GThread.
     * <p>
     * Before the task can be used, a {@link org.gtk.glib.RecMutex} must be configured using the
     * gst_task_set_lock() function. This lock will always be acquired while
     * {@code func} is called.
     * @param func The {@link TaskFunction} to use
     * @param notify the function to call when {@code user_data} is no longer needed.
     */
    public Task(org.gstreamer.gst.TaskFunction func, org.gtk.glib.DestroyNotify notify) {
        super(constructNew(func, notify));
        this.takeOwnership();
    }
    
    /**
     * Get the {@link TaskPool} that this task will use for its streaming
     * threads.
     * <p>
     * MT safe.
     * @return the {@link TaskPool} used by {@code task}. gst_object_unref()
     * after usage.
     */
    public org.gstreamer.gst.TaskPool getPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_task_get_pool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.TaskPool) Interop.register(RESULT, org.gstreamer.gst.TaskPool.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the current state of the task.
     * @return The {@link TaskState} of the task
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.TaskState getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TaskState.of(RESULT);
    }
    
    /**
     * Joins {@code task}. After this call, it is safe to unref the task
     * and clean up the lock set with gst_task_set_lock().
     * <p>
     * The task will automatically be stopped with this call.
     * <p>
     * This function cannot be called from within a task function as this
     * would cause a deadlock. The function will detect this and print a
     * g_warning.
     * @return {@code true} if the task could be joined.
     * <p>
     * MT safe.
     */
    public boolean join() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_join.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pauses {@code task}. This method can also be called on a task in the
     * stopped state, in which case a thread will be started and will remain
     * in the paused state. This function does not wait for the task to complete
     * the paused state.
     * @return {@code true} if the task could be paused.
     * <p>
     * MT safe.
     */
    public boolean pause() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_pause.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Resume {@code task} in case it was paused. If the task was stopped, it will
     * remain in that state and this function will return {@code false}.
     * @return {@code true} if the task could be resumed.
     * <p>
     * MT safe.
     */
    public boolean resume() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_resume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Call {@code enter_func} when the task function of {@code task} is entered. {@code user_data} will
     * be passed to {@code enter_func} and {@code notify} will be called when {@code user_data} is no
     * longer referenced.
     * @param enterFunc a {@link TaskThreadFunc}
     * @param notify called when {@code user_data} is no longer referenced
     */
    public void setEnterCallback(org.gstreamer.gst.TaskThreadFunc enterFunc, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_task_set_enter_callback.invokeExact(
                    handle(),
                    (Addressable) enterFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Call {@code leave_func} when the task function of {@code task} is left. {@code user_data} will
     * be passed to {@code leave_func} and {@code notify} will be called when {@code user_data} is no
     * longer referenced.
     * @param leaveFunc a {@link TaskThreadFunc}
     * @param notify called when {@code user_data} is no longer referenced
     */
    public void setLeaveCallback(org.gstreamer.gst.TaskThreadFunc leaveFunc, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_task_set_leave_callback.invokeExact(
                    handle(),
                    (Addressable) leaveFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the mutex used by the task. The mutex will be acquired before
     * calling the {@link TaskFunction}.
     * <p>
     * This function has to be called before calling gst_task_pause() or
     * gst_task_start().
     * <p>
     * MT safe.
     * @param mutex The {@link org.gtk.glib.RecMutex} to use
     */
    public void setLock(org.gtk.glib.RecMutex mutex) {
        try {
            DowncallHandles.gst_task_set_lock.invokeExact(
                    handle(),
                    mutex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code pool} as the new GstTaskPool for {@code task}. Any new streaming threads that
     * will be created by {@code task} will now use {@code pool}.
     * <p>
     * MT safe.
     * @param pool a {@link TaskPool}
     */
    public void setPool(org.gstreamer.gst.TaskPool pool) {
        try {
            DowncallHandles.gst_task_set_pool.invokeExact(
                    handle(),
                    pool.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state of {@code task} to {@code state}.
     * <p>
     * The {@code task} must have a lock associated with it using
     * gst_task_set_lock() when going to GST_TASK_STARTED or GST_TASK_PAUSED or
     * this function will return {@code false}.
     * <p>
     * MT safe.
     * @param state the new task state
     * @return {@code true} if the state could be changed.
     */
    public boolean setState(org.gstreamer.gst.TaskState state) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_set_state.invokeExact(
                    handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Starts {@code task}. The {@code task} must have a lock associated with it using
     * gst_task_set_lock() or this function will return {@code false}.
     * @return {@code true} if the task could be started.
     * <p>
     * MT safe.
     */
    public boolean start() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Stops {@code task}. This method merely schedules the task to stop and
     * will not wait for the task to have completely stopped. Use
     * gst_task_join() to stop and wait for completion.
     * @return {@code true} if the task could be stopped.
     * <p>
     * MT safe.
     */
    public boolean stop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_task_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_task_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Wait for all tasks to be stopped. This is mainly used internally
     * to ensure proper cleanup of internal data structures in test suites.
     * <p>
     * MT safe.
     */
    public static void cleanupAll() {
        try {
            DowncallHandles.gst_task_cleanup_all.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Task.Builder} object constructs a {@link Task} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Task.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Task} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Task}.
         * @return A new instance of {@code Task} with the properties 
         *         that were set in the Builder object.
         */
        public Task build() {
            return (Task) org.gtk.gobject.GObject.newWithProperties(
                Task.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_task_new = Interop.downcallHandle(
                "gst_task_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_get_pool = Interop.downcallHandle(
                "gst_task_get_pool",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_get_state = Interop.downcallHandle(
                "gst_task_get_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_join = Interop.downcallHandle(
                "gst_task_join",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pause = Interop.downcallHandle(
                "gst_task_pause",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_resume = Interop.downcallHandle(
                "gst_task_resume",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_set_enter_callback = Interop.downcallHandle(
                "gst_task_set_enter_callback",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_set_leave_callback = Interop.downcallHandle(
                "gst_task_set_leave_callback",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_set_lock = Interop.downcallHandle(
                "gst_task_set_lock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_set_pool = Interop.downcallHandle(
                "gst_task_set_pool",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_set_state = Interop.downcallHandle(
                "gst_task_set_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_task_start = Interop.downcallHandle(
                "gst_task_start",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_stop = Interop.downcallHandle(
                "gst_task_stop",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_get_type = Interop.downcallHandle(
                "gst_task_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_task_cleanup_all = Interop.downcallHandle(
                "gst_task_cleanup_all",
                FunctionDescriptor.ofVoid(),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_task_get_type != null;
    }
}
