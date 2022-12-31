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
public class Allocator extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
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
    }
    
    /**
     * Create a Allocator proxy instance for the provided memory address.
     * <p>
     * Because Allocator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Allocator(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Allocator> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Allocator(input, ownership);
    
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
        return org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Free {@code memory} that was previously allocated with gst_allocator_alloc().
     * @param memory the memory to free
     */
    public void free(org.gstreamer.gst.Memory memory) {
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
    public static org.gtk.glib.Type getType() {
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
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Allocator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Allocator.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Registers the memory {@code allocator} with {@code name}.
     * @param name the name of the allocator
     * @param allocator {@link Allocator}
     */
    public static void register(java.lang.String name, org.gstreamer.gst.Allocator allocator) {
        try {
            DowncallHandles.gst_allocator_register.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    allocator.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocator.yieldOwnership();
    }
    
    /**
     * A {@link Allocator.Builder} object constructs a {@link Allocator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Allocator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Allocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Allocator}.
         * @return A new instance of {@code Allocator} with the properties 
         *         that were set in the Builder object.
         */
        public Allocator build() {
            return (Allocator) org.gtk.gobject.GObject.newWithProperties(
                Allocator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
