package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SharedTaskPool} object.
 * @version 1.20
 */
public class SharedTaskPool extends org.gstreamer.gst.TaskPool {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSharedTaskPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.TaskPool.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SharedTaskPool proxy instance for the provided memory address.
     * <p>
     * Because SharedTaskPool is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SharedTaskPool(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SharedTaskPool> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SharedTaskPool(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_shared_task_pool_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new shared task pool. The shared task pool will queue tasks on
     * a maximum number of threads, 1 by default.
     * <p>
     * Do not use a {@link SharedTaskPool} to manage potentially inter-dependent tasks such
     * as pad tasks, as having one task waiting on another to return before returning
     * would cause obvious deadlocks if they happen to share the same thread.
     */
    public SharedTaskPool() {
        super(constructNew(), Ownership.FULL);
    }
    
    public int getMaxThreads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_shared_task_pool_get_max_threads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Update the maximal number of threads the {@code pool} may spawn. When
     * the maximal number of threads is reduced, existing threads are not
     * immediately shut down, see g_thread_pool_set_max_threads().
     * <p>
     * Setting {@code max_threads} to 0 effectively freezes the pool.
     * @param maxThreads Maximum number of threads to spawn.
     */
    public void setMaxThreads(int maxThreads) {
        try {
            DowncallHandles.gst_shared_task_pool_set_max_threads.invokeExact(
                    handle(),
                    maxThreads);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_shared_task_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SharedTaskPool.Builder} object constructs a {@link SharedTaskPool} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SharedTaskPool.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.TaskPool.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SharedTaskPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SharedTaskPool}.
         * @return A new instance of {@code SharedTaskPool} with the properties 
         *         that were set in the Builder object.
         */
        public SharedTaskPool build() {
            return (SharedTaskPool) org.gtk.gobject.GObject.newWithProperties(
                SharedTaskPool.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_shared_task_pool_new = Interop.downcallHandle(
            "gst_shared_task_pool_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_shared_task_pool_get_max_threads = Interop.downcallHandle(
            "gst_shared_task_pool_get_max_threads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_shared_task_pool_set_max_threads = Interop.downcallHandle(
            "gst_shared_task_pool_set_max_threads",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_shared_task_pool_get_type = Interop.downcallHandle(
            "gst_shared_task_pool_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
