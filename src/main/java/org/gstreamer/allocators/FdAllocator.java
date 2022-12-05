package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for allocators with fd-backed memory
 * @version 1.6
 */
public class FdAllocator extends org.gstreamer.gst.Allocator {
    
    static {
        GstAllocators.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstFdAllocator";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Allocator.getMemoryLayout().withName("parent")
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
     * Create a FdAllocator proxy instance for the provided memory address.
     * <p>
     * Because FdAllocator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FdAllocator(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to FdAllocator if its GType is a (or inherits from) "GstFdAllocator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FdAllocator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstFdAllocator", a ClassCastException will be thrown.
     */
    public static FdAllocator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FdAllocator.getType())) {
            return new FdAllocator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstFdAllocator");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_fd_allocator_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Return a new fd allocator.
     */
    public FdAllocator() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_fd_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Return a {@code GstMemory} that wraps a generic file descriptor.
     * @param allocator allocator to be used for this memory
     * @param fd file descriptor
     * @param size memory size
     * @param flags extra {@link FdMemoryFlags}
     * @return a GstMemory based on {@code allocator}.
     * When the buffer will be released the allocator will close the {@code fd} unless
     * the {@link FdMemoryFlags#DONT_CLOSE} flag is specified.
     * The memory is only mmapped on gst_buffer_map() request.
     */
    public static @NotNull org.gstreamer.gst.Memory alloc(@NotNull org.gstreamer.gst.Allocator allocator, int fd, long size, @NotNull org.gstreamer.allocators.FdMemoryFlags flags) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_fd_allocator_alloc.invokeExact(
                    allocator.handle(),
                    fd,
                    size,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Allocator.Build {
        
         /**
         * A {@link FdAllocator.Build} object constructs a {@link FdAllocator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FdAllocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FdAllocator} using {@link FdAllocator#castFrom}.
         * @return A new instance of {@code FdAllocator} with the properties 
         *         that were set in the Build object.
         */
        public FdAllocator construct() {
            return FdAllocator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FdAllocator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_fd_allocator_new = Interop.downcallHandle(
            "gst_fd_allocator_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_fd_allocator_get_type = Interop.downcallHandle(
            "gst_fd_allocator_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_fd_allocator_alloc = Interop.downcallHandle(
            "gst_fd_allocator_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
    }
}
