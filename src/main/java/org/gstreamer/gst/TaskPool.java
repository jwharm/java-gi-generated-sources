package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object provides an abstraction for creating threads. The default
 * implementation uses a regular GThreadPool to start tasks.
 * <p>
 * Subclasses can be made to create custom threads.
 */
public class TaskPool extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTaskPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("pool"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TaskPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TaskPool(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TaskPool> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TaskPool(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_task_pool_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new default task pool. The default task pool will use a regular
     * GThreadPool for threads.
     */
    public TaskPool() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Wait for all tasks to be stopped. This is mainly used internally
     * to ensure proper cleanup of internal data structures in test suites.
     * <p>
     * MT safe.
     */
    public void cleanup() {
        try {
            DowncallHandles.gst_task_pool_cleanup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Dispose of the handle returned by gst_task_pool_push(). This does
     * not need to be called with the default implementation as the default
     * {@link TaskPoolClass}::push implementation always returns {@code null}. This does not need to be
     * called either when calling gst_task_pool_join(), but should be called
     * when joining is not necessary, but gst_task_pool_push() returned a
     * non-{@code null} value.
     * <p>
     * This method should only be called with the same {@code pool} instance that provided
     * {@code id}.
     * @param id the id
     */
    public void disposeHandle(@Nullable java.lang.foreign.MemoryAddress id) {
        try {
            DowncallHandles.gst_task_pool_dispose_handle.invokeExact(
                    handle(),
                    (Addressable) (id == null ? MemoryAddress.NULL : (Addressable) id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Join a task and/or return it to the pool. {@code id} is the id obtained from
     * gst_task_pool_push(). The default implementation does nothing, as the
     * default {@link TaskPoolClass}::push implementation always returns {@code null}.
     * <p>
     * This method should only be called with the same {@code pool} instance that provided
     * {@code id}.
     * @param id the id
     */
    public void join(@Nullable java.lang.foreign.MemoryAddress id) {
        try {
            DowncallHandles.gst_task_pool_join.invokeExact(
                    handle(),
                    (Addressable) (id == null ? MemoryAddress.NULL : (Addressable) id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepare the taskpool for accepting gst_task_pool_push() operations.
     * <p>
     * MT safe.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public void prepare() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_task_pool_prepare.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
        }
    }
    
    /**
     * Start the execution of a new thread from {@code pool}.
     * @param func the function to call
     * @return a pointer that should be used
     * for the gst_task_pool_join function. This pointer can be {@code null}, you
     * must check {@code error} to detect errors. If the pointer is not {@code null} and
     * gst_task_pool_join() is not used, call gst_task_pool_dispose_handle()
     * instead.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.foreign.MemoryAddress push(org.gstreamer.gst.TaskPoolFunction func) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_task_pool_push.invokeExact(
                        handle(),
                        (Addressable) func.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_task_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TaskPool.Builder} object constructs a {@link TaskPool} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TaskPool.Builder#build()}. 
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
         * Finish building the {@link TaskPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TaskPool}.
         * @return A new instance of {@code TaskPool} with the properties 
         *         that were set in the Builder object.
         */
        public TaskPool build() {
            return (TaskPool) org.gtk.gobject.GObject.newWithProperties(
                TaskPool.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_task_pool_new = Interop.downcallHandle(
                "gst_task_pool_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_cleanup = Interop.downcallHandle(
                "gst_task_pool_cleanup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_dispose_handle = Interop.downcallHandle(
                "gst_task_pool_dispose_handle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_join = Interop.downcallHandle(
                "gst_task_pool_join",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_prepare = Interop.downcallHandle(
                "gst_task_pool_prepare",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_push = Interop.downcallHandle(
                "gst_task_pool_push",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_task_pool_get_type = Interop.downcallHandle(
                "gst_task_pool_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_task_pool_get_type != null;
    }
}
