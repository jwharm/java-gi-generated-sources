package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link BufferPool} is an object that can be used to pre-allocate and recycle
 * buffers of the same size and with the same properties.
 * <p>
 * A {@link BufferPool} is created with gst_buffer_pool_new().
 * <p>
 * Once a pool is created, it needs to be configured. A call to
 * gst_buffer_pool_get_config() returns the current configuration structure from
 * the pool. With gst_buffer_pool_config_set_params() and
 * gst_buffer_pool_config_set_allocator() the bufferpool parameters and
 * allocator can be configured. Other properties can be configured in the pool
 * depending on the pool implementation.
 * <p>
 * A bufferpool can have extra options that can be enabled with
 * gst_buffer_pool_config_add_option(). The available options can be retrieved
 * with gst_buffer_pool_get_options(). Some options allow for additional
 * configuration properties to be set.
 * <p>
 * After the configuration structure has been configured,
 * gst_buffer_pool_set_config() updates the configuration in the pool. This can
 * fail when the configuration structure is not accepted.
 * <p>
 * After the pool has been configured, it can be activated with
 * gst_buffer_pool_set_active(). This will preallocate the configured resources
 * in the pool.
 * <p>
 * When the pool is active, gst_buffer_pool_acquire_buffer() can be used to
 * retrieve a buffer from the pool.
 * <p>
 * Buffers allocated from a bufferpool will automatically be returned to the
 * pool with gst_buffer_pool_release_buffer() when their refcount drops to 0.
 * <p>
 * The bufferpool can be deactivated again with gst_buffer_pool_set_active().
 * All further gst_buffer_pool_acquire_buffer() calls will return an error. When
 * all buffers are returned to the pool they will be freed.
 */
public class BufferPool extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferPool";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.C_INT.withName("flushing"),
        MemoryLayout.paddingLayout(32),
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
     * Create a BufferPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BufferPool(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BufferPool if its GType is a (or inherits from) "GstBufferPool".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BufferPool} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstBufferPool", a ClassCastException will be thrown.
     */
    public static BufferPool castFrom(org.gtk.gobject.Object gobject) {
            return new BufferPool(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_pool_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link BufferPool} instance.
     */
    public BufferPool() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Acquires a buffer from {@code pool}. {@code buffer} should point to a memory location that
     * can hold a pointer to the new buffer.
     * <p>
     * {@code params} can contain optional parameters to influence the allocation.
     * @param buffer a location for a {@link Buffer}
     * @param params parameters.
     * @return a {@link FlowReturn} such as {@link FlowReturn#FLUSHING} when the pool is
     * inactive.
     */
    public @NotNull org.gstreamer.gst.FlowReturn acquireBuffer(@NotNull Out<org.gstreamer.gst.Buffer> buffer, @Nullable org.gstreamer.gst.BufferPoolAcquireParams params) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_acquire_buffer.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.set(new org.gstreamer.gst.Buffer(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return new org.gstreamer.gst.FlowReturn(RESULT);
    }
    
    /**
     * Gets a copy of the current configuration of the pool. This configuration
     * can be modified and used for the gst_buffer_pool_set_config() call.
     * @return a copy of the current configuration of {@code pool}.
     */
    public @NotNull org.gstreamer.gst.Structure getConfig() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_pool_get_config.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a {@code null} terminated array of string with supported bufferpool options for
     * {@code pool}. An option would typically be enabled with
     * gst_buffer_pool_config_add_option().
     * @return a {@code null} terminated array
     *          of strings.
     */
    public @NotNull PointerString getOptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_pool_get_options.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Checks if the bufferpool supports {@code option}.
     * @param option an option
     * @return {@code true} if the buffer pool contains {@code option}.
     */
    public boolean hasOption(@NotNull java.lang.String option) {
        java.util.Objects.requireNonNull(option, "Parameter 'option' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_has_option.invokeExact(
                    handle(),
                    Interop.allocateNativeString(option));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code pool} is active. A pool can be activated with the
     * gst_buffer_pool_set_active() call.
     * @return {@code true} when the pool is active.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Releases {@code buffer} to {@code pool}. {@code buffer} should have previously been allocated from
     * {@code pool} with gst_buffer_pool_acquire_buffer().
     * <p>
     * This function is usually called automatically when the last ref on {@code buffer}
     * disappears.
     * @param buffer a {@link Buffer}
     */
    public void releaseBuffer(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.gst_buffer_pool_release_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
    }
    
    /**
     * Controls the active state of {@code pool}. When the pool is inactive, new calls to
     * gst_buffer_pool_acquire_buffer() will return with {@link FlowReturn#FLUSHING}.
     * <p>
     * Activating the bufferpool will preallocate all resources in the pool based on
     * the configuration of the pool.
     * <p>
     * Deactivating will free the resources again when there are no outstanding
     * buffers. When there are outstanding buffers, they will be freed as soon as
     * they are all returned to the pool.
     * @param active the new active state
     * @return {@code false} when the pool was not configured or when preallocation of the
     * buffers failed.
     */
    public boolean setActive(boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_set_active.invokeExact(
                    handle(),
                    active ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the configuration of the pool. If the pool is already configured, and
     * the configuration hasn't changed, this function will return {@code true}. If the
     * pool is active, this method will return {@code false} and active configuration
     * will remain. Buffers allocated from this pool must be returned or else this
     * function will do nothing and return {@code false}.
     * <p>
     * {@code config} is a {@link Structure} that contains the configuration parameters for
     * the pool. A default and mandatory set of parameters can be configured with
     * gst_buffer_pool_config_set_params(), gst_buffer_pool_config_set_allocator()
     * and gst_buffer_pool_config_add_option().
     * <p>
     * If the parameters in {@code config} can not be set exactly, this function returns
     * {@code false} and will try to update as much state as possible. The new state can
     * then be retrieved and refined with gst_buffer_pool_get_config().
     * <p>
     * This function takes ownership of {@code config}.
     * @param config a {@link Structure}
     * @return {@code true} when the configuration could be set.
     */
    public boolean setConfig(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_set_config.invokeExact(
                    handle(),
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Enables or disables the flushing state of a {@code pool} without freeing or
     * allocating buffers.
     * @param flushing whether to start or stop flushing
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_buffer_pool_set_flushing.invokeExact(
                    handle(),
                    flushing ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_buffer_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Enables the option in {@code config}. This will instruct the {@code bufferpool} to enable
     * the specified option on the buffers that it allocates.
     * <p>
     * The options supported by {@code pool} can be retrieved with gst_buffer_pool_get_options().
     * @param config a {@link BufferPool} configuration
     * @param option an option to add
     */
    public static void configAddOption(@NotNull org.gstreamer.gst.Structure config, @NotNull java.lang.String option) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        java.util.Objects.requireNonNull(option, "Parameter 'option' must not be null");
        try {
            DowncallHandles.gst_buffer_pool_config_add_option.invokeExact(
                    config.handle(),
                    Interop.allocateNativeString(option));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code allocator} and {@code params} from {@code config}.
     * @param config a {@link BufferPool} configuration
     * @param allocator a {@link Allocator}, or {@code null}
     * @param params {@link AllocationParams}, or {@code null}
     * @return {@code true}, if the values are set.
     */
    public static boolean configGetAllocator(@NotNull org.gstreamer.gst.Structure config, @Nullable Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_config_get_allocator.invokeExact(
                    config.handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (allocator != null) allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return RESULT != 0;
    }
    
    /**
     * Parses an available {@code config} and gets the option at {@code index} of the options API
     * array.
     * @param config a {@link BufferPool} configuration
     * @param index position in the option array to read
     * @return the option at {@code index}.
     */
    public static @Nullable java.lang.String configGetOption(@NotNull org.gstreamer.gst.Structure config, int index) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_pool_config_get_option.invokeExact(
                    config.handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the configuration values from {@code config}.
     * @param config a {@link BufferPool} configuration
     * @param caps the caps of buffers
     * @param size the size of each buffer, not including prefix and padding
     * @param minBuffers the minimum amount of buffers to allocate.
     * @param maxBuffers the maximum amount of buffers to allocate or 0 for unlimited.
     * @return {@code true} if all parameters could be fetched.
     */
    public static boolean configGetParams(@NotNull org.gstreamer.gst.Structure config, @Nullable Out<org.gstreamer.gst.Caps> caps, Out<Integer> size, Out<Integer> minBuffers, Out<Integer> maxBuffers) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        MemorySegment capsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minBuffers, "Parameter 'minBuffers' must not be null");
        MemorySegment minBuffersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(maxBuffers, "Parameter 'maxBuffers' must not be null");
        MemorySegment maxBuffersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_config_get_params.invokeExact(
                    config.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : (Addressable) capsPOINTER.address()),
                    (Addressable) sizePOINTER.address(),
                    (Addressable) minBuffersPOINTER.address(),
                    (Addressable) maxBuffersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (caps != null) caps.set(new org.gstreamer.gst.Caps(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        minBuffers.set(minBuffersPOINTER.get(Interop.valueLayout.C_INT, 0));
        maxBuffers.set(maxBuffersPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code config} contains {@code option}.
     * @param config a {@link BufferPool} configuration
     * @param option an option
     * @return {@code true} if the options array contains {@code option}.
     */
    public static boolean configHasOption(@NotNull org.gstreamer.gst.Structure config, @NotNull java.lang.String option) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        java.util.Objects.requireNonNull(option, "Parameter 'option' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_config_has_option.invokeExact(
                    config.handle(),
                    Interop.allocateNativeString(option));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the number of values currently stored in the options array of the
     * {@code config} structure.
     * @param config a {@link BufferPool} configuration
     * @return the options array size as a {@code guint}.
     */
    public static int configNOptions(@NotNull org.gstreamer.gst.Structure config) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_config_n_options.invokeExact(
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the {@code allocator} and {@code params} on {@code config}.
     * <p>
     * One of {@code allocator} and {@code params} can be {@code null}, but not both. When {@code allocator}
     * is {@code null}, the default allocator of the pool will use the values in {@code param}
     * to perform its allocation. When {@code param} is {@code null}, the pool will use the
     * provided {@code allocator} with its default {@link AllocationParams}.
     * <p>
     * A call to gst_buffer_pool_set_config() can update the allocator and params
     * with the values that it is able to do. Some pools are, for example, not able
     * to operate with different allocators or cannot allocate with the values
     * specified in {@code params}. Use gst_buffer_pool_get_config() to get the currently
     * used values.
     * @param config a {@link BufferPool} configuration
     * @param allocator a {@link Allocator}
     * @param params {@link AllocationParams}
     */
    public static void configSetAllocator(@NotNull org.gstreamer.gst.Structure config, @Nullable org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        try {
            DowncallHandles.gst_buffer_pool_config_set_allocator.invokeExact(
                    config.handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures {@code config} with the given parameters.
     * @param config a {@link BufferPool} configuration
     * @param caps caps for the buffers
     * @param size the size of each buffer, not including prefix and padding
     * @param minBuffers the minimum amount of buffers to allocate.
     * @param maxBuffers the maximum amount of buffers to allocate or 0 for unlimited.
     */
    public static void configSetParams(@NotNull org.gstreamer.gst.Structure config, @Nullable org.gstreamer.gst.Caps caps, int size, int minBuffers, int maxBuffers) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        try {
            DowncallHandles.gst_buffer_pool_config_set_params.invokeExact(
                    config.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    size,
                    minBuffers,
                    maxBuffers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Validates that changes made to {@code config} are still valid in the context of the
     * expected parameters. This function is a helper that can be used to validate
     * changes made by a pool to a config when gst_buffer_pool_set_config()
     * returns {@code false}. This expects that {@code caps} haven't changed and that
     * {@code min_buffers} aren't lower then what we initially expected.
     * This does not check if options or allocator parameters are still valid,
     * won't check if size have changed, since changing the size is valid to adapt
     * padding.
     * @param config a {@link BufferPool} configuration
     * @param caps the excepted caps of buffers
     * @param size the expected size of each buffer, not including prefix and padding
     * @param minBuffers the expected minimum amount of buffers to allocate.
     * @param maxBuffers the expect maximum amount of buffers to allocate or 0 for unlimited.
     * @return {@code true}, if the parameters are valid in this context.
     */
    public static boolean configValidateParams(@NotNull org.gstreamer.gst.Structure config, @Nullable org.gstreamer.gst.Caps caps, int size, int minBuffers, int maxBuffers) {
        java.util.Objects.requireNonNull(config, "Parameter 'config' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_pool_config_validate_params.invokeExact(
                    config.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    size,
                    minBuffers,
                    maxBuffers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link BufferPool.Build} object constructs a {@link BufferPool} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BufferPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BufferPool} using {@link BufferPool#castFrom}.
         * @return A new instance of {@code BufferPool} with the properties 
         *         that were set in the Build object.
         */
        public BufferPool construct() {
            return BufferPool.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BufferPool.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_pool_new = Interop.downcallHandle(
            "gst_buffer_pool_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_acquire_buffer = Interop.downcallHandle(
            "gst_buffer_pool_acquire_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_get_config = Interop.downcallHandle(
            "gst_buffer_pool_get_config",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_get_options = Interop.downcallHandle(
            "gst_buffer_pool_get_options",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_has_option = Interop.downcallHandle(
            "gst_buffer_pool_has_option",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_is_active = Interop.downcallHandle(
            "gst_buffer_pool_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_release_buffer = Interop.downcallHandle(
            "gst_buffer_pool_release_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_set_active = Interop.downcallHandle(
            "gst_buffer_pool_set_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_set_config = Interop.downcallHandle(
            "gst_buffer_pool_set_config",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_set_flushing = Interop.downcallHandle(
            "gst_buffer_pool_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_get_type = Interop.downcallHandle(
            "gst_buffer_pool_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_add_option = Interop.downcallHandle(
            "gst_buffer_pool_config_add_option",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_get_allocator = Interop.downcallHandle(
            "gst_buffer_pool_config_get_allocator",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_get_option = Interop.downcallHandle(
            "gst_buffer_pool_config_get_option",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_get_params = Interop.downcallHandle(
            "gst_buffer_pool_config_get_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_has_option = Interop.downcallHandle(
            "gst_buffer_pool_config_has_option",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_n_options = Interop.downcallHandle(
            "gst_buffer_pool_config_n_options",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_set_allocator = Interop.downcallHandle(
            "gst_buffer_pool_config_set_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_set_params = Interop.downcallHandle(
            "gst_buffer_pool_config_set_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_validate_params = Interop.downcallHandle(
            "gst_buffer_pool_config_validate_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
