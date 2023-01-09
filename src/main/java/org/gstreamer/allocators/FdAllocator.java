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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Allocator.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FdAllocator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FdAllocator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FdAllocator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FdAllocator(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static org.gstreamer.gst.Memory alloc(org.gstreamer.gst.Allocator allocator, int fd, long size, org.gstreamer.allocators.FdMemoryFlags flags) {
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
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link FdAllocator.Builder} object constructs a {@link FdAllocator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FdAllocator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Allocator.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FdAllocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FdAllocator}.
         * @return A new instance of {@code FdAllocator} with the properties 
         *         that were set in the Builder object.
         */
        public FdAllocator build() {
            return (FdAllocator) org.gtk.gobject.GObject.newWithProperties(
                FdAllocator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_fd_allocator_get_type != null;
    }
}
