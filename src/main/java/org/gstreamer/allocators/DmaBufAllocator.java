package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for allocators with dmabuf-backed memory
 * @version 1.12
 */
public class DmaBufAllocator extends org.gstreamer.allocators.FdAllocator {
    
    static {
        GstAllocators.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDmaBufAllocator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.allocators.FdAllocator.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DmaBufAllocator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DmaBufAllocator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DmaBufAllocator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DmaBufAllocator(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_dmabuf_allocator_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Return a new dmabuf allocator.
     */
    public DmaBufAllocator() {
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
            RESULT = (long) DowncallHandles.gst_dmabuf_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Return a {@code GstMemory} that wraps a dmabuf file descriptor.
     * @param allocator allocator to be used for this memory
     * @param fd dmabuf file descriptor
     * @param size memory size
     * @return a GstMemory based on {@code allocator}.
     * When the buffer will be released dmabuf allocator will close the {@code fd}.
     * The memory is only mmapped on gst_buffer_map() request.
     */
    public static org.gstreamer.gst.Memory alloc(org.gstreamer.gst.Allocator allocator, int fd, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_dmabuf_allocator_alloc.invokeExact(
                    allocator.handle(),
                    fd,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Return a {@code GstMemory} that wraps a dmabuf file descriptor.
     * @param allocator allocator to be used for this memory
     * @param fd dmabuf file descriptor
     * @param size memory size
     * @param flags extra {@link FdMemoryFlags}
     * @return a GstMemory based on {@code allocator}.
     * <p>
     * When the buffer will be released the allocator will close the {@code fd} unless
     * the {@link FdMemoryFlags#DONT_CLOSE} flag is specified.
     * The memory is only mmapped on gst_buffer_mmap() request.
     */
    public static org.gstreamer.gst.Memory allocWithFlags(org.gstreamer.gst.Allocator allocator, int fd, long size, org.gstreamer.allocators.FdMemoryFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_dmabuf_allocator_alloc_with_flags.invokeExact(
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
     * A {@link DmaBufAllocator.Builder} object constructs a {@link DmaBufAllocator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DmaBufAllocator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.allocators.FdAllocator.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DmaBufAllocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DmaBufAllocator}.
         * @return A new instance of {@code DmaBufAllocator} with the properties 
         *         that were set in the Builder object.
         */
        public DmaBufAllocator build() {
            return (DmaBufAllocator) org.gtk.gobject.GObject.newWithProperties(
                DmaBufAllocator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_dmabuf_allocator_new = Interop.downcallHandle(
                "gst_dmabuf_allocator_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_dmabuf_allocator_get_type = Interop.downcallHandle(
                "gst_dmabuf_allocator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_dmabuf_allocator_alloc = Interop.downcallHandle(
                "gst_dmabuf_allocator_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_dmabuf_allocator_alloc_with_flags = Interop.downcallHandle(
                "gst_dmabuf_allocator_alloc_with_flags",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_dmabuf_allocator_get_type != null;
    }
}
