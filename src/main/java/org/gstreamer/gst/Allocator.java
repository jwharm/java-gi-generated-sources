package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Memory is usually created by allocators with a gst_allocator_alloc()
 * method call. When {@code null} is used as the allocator, the default allocator will
 * be used.
 * <p>
 * New allocators can be registered with gst_allocator_register().
 * Allocators are identified by name and can be retrieved with
 * gst_allocator_find(). gst_allocator_set_default() can be used to change the
 * default allocator.
 * <p>
 * New memory can be created with gst_memory_new_wrapped() that wraps the memory
 * allocated elsewhere.
 */
public class Allocator extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocator";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("mem_type"),
        Interop.valueLayout.ADDRESS.withName("mem_map"),
        Interop.valueLayout.ADDRESS.withName("mem_unmap"),
        Interop.valueLayout.ADDRESS.withName("mem_copy"),
        Interop.valueLayout.ADDRESS.withName("mem_share"),
        Interop.valueLayout.ADDRESS.withName("mem_is_span"),
        Interop.valueLayout.ADDRESS.withName("mem_map_full"),
        Interop.valueLayout.ADDRESS.withName("mem_unmap_full"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a Allocator proxy instance for the provided memory address.
     * <p>
     * Because Allocator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Allocator(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Allocator if its GType is a (or inherits from) "GstAllocator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Allocator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAllocator", a ClassCastException will be thrown.
     */
    public static Allocator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Allocator.getType())) {
            return new Allocator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAllocator");
        }
    }
    
    /**
     * Use {@code allocator} to allocate a new memory block with memory that is at least
     * {@code size} big.
     * <p>
     * The optional {@code params} can specify the prefix and padding for the memory. If
     * {@code null} is passed, no flags, no extra prefix/padding and a default alignment is
     * used.
     * <p>
     * The prefix/padding will be filled with 0 if flags contains
     * {@code GST_MEMORY_FLAG_ZERO_PREFIXED} and {@code GST_MEMORY_FLAG_ZERO_PADDED} respectively.
     * <p>
     * When {@code allocator} is {@code null}, the default allocator will be used.
     * <p>
     * The alignment in {@code params} is given as a bitmask so that {@code align} + 1 equals
     * the amount of bytes to align to. For example, to align to 8 bytes,
     * use an alignment of 7.
     * @param size size of the visible memory area
     * @param params optional parameters
     * @return a new {@link Memory}.
     */
    public @Nullable org.gstreamer.gst.Memory alloc(long size, @Nullable org.gstreamer.gst.AllocationParams params) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_allocator_alloc.invokeExact(
                    handle(),
                    size,
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    /**
     * Free {@code memory} that was previously allocated with gst_allocator_alloc().
     * @param memory the memory to free
     */
    public void free(@NotNull org.gstreamer.gst.Memory memory) {
        java.util.Objects.requireNonNull(memory, "Parameter 'memory' must not be null");
        try {
            DowncallHandles.gst_allocator_free.invokeExact(
                    handle(),
                    memory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        memory.yieldOwnership();
    }
    
    /**
     * Set the default allocator.
     */
    public void setDefault() {
        try {
            DowncallHandles.gst_allocator_set_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Find a previously registered allocator with {@code name}. When {@code name} is {@code null}, the
     * default allocator will be returned.
     * @param name the name of the allocator
     * @return a {@link Allocator} or {@code null} when
     * the allocator with {@code name} was not registered.
     */
    public static @Nullable org.gstreamer.gst.Allocator find(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_allocator_find.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Allocator(RESULT, Ownership.FULL);
    }
    
    /**
     * Registers the memory {@code allocator} with {@code name}.
     * @param name the name of the allocator
     * @param allocator {@link Allocator}
     */
    public static void register(@NotNull java.lang.String name, @NotNull org.gstreamer.gst.Allocator allocator) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        try {
            DowncallHandles.gst_allocator_register.invokeExact(
                    Interop.allocateNativeString(name),
                    allocator.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocator.yieldOwnership();
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link Allocator.Build} object constructs a {@link Allocator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Allocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Allocator} using {@link Allocator#castFrom}.
         * @return A new instance of {@code Allocator} with the properties 
         *         that were set in the Build object.
         */
        public Allocator construct() {
            return Allocator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Allocator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_allocator_alloc = Interop.downcallHandle(
            "gst_allocator_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocator_free = Interop.downcallHandle(
            "gst_allocator_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocator_set_default = Interop.downcallHandle(
            "gst_allocator_set_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocator_get_type = Interop.downcallHandle(
            "gst_allocator_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_allocator_find = Interop.downcallHandle(
            "gst_allocator_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_allocator_register = Interop.downcallHandle(
            "gst_allocator_register",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
