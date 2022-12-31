package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque {@link GLMemoryEGLAllocator} struct
 */
public class GLMemoryEGLAllocator extends org.gstreamer.gl.GLMemoryAllocator {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryEGLAllocator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLMemoryAllocator.getMemoryLayout().withName("parent"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLMemoryEGLAllocator proxy instance for the provided memory address.
     * <p>
     * Because GLMemoryEGLAllocator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLMemoryEGLAllocator(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLMemoryEGLAllocator> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLMemoryEGLAllocator(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_memory_egl_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLMemoryEGLAllocator.Builder} object constructs a {@link GLMemoryEGLAllocator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLMemoryEGLAllocator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gl.GLMemoryAllocator.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLMemoryEGLAllocator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLMemoryEGLAllocator}.
         * @return A new instance of {@code GLMemoryEGLAllocator} with the properties 
         *         that were set in the Builder object.
         */
        public GLMemoryEGLAllocator build() {
            return (GLMemoryEGLAllocator) org.gtk.gobject.GObject.newWithProperties(
                GLMemoryEGLAllocator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_memory_egl_allocator_get_type = Interop.downcallHandle(
            "gst_gl_memory_egl_allocator_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
