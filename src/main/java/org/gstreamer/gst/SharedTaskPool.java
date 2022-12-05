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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.TaskPool.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a SharedTaskPool proxy instance for the provided memory address.
     * <p>
     * Because SharedTaskPool is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SharedTaskPool(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to SharedTaskPool if its GType is a (or inherits from) "GstSharedTaskPool".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SharedTaskPool} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstSharedTaskPool", a ClassCastException will be thrown.
     */
    public static SharedTaskPool castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SharedTaskPool.getType())) {
            return new SharedTaskPool(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstSharedTaskPool");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_shared_task_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.TaskPool.Build {
        
         /**
         * A {@link SharedTaskPool.Build} object constructs a {@link SharedTaskPool} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SharedTaskPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SharedTaskPool} using {@link SharedTaskPool#castFrom}.
         * @return A new instance of {@code SharedTaskPool} with the properties 
         *         that were set in the Build object.
         */
        public SharedTaskPool construct() {
            return SharedTaskPool.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SharedTaskPool.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
