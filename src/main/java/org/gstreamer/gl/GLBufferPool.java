package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * a {@link GLBufferPool} is an object that allocates buffers with {@link GLBaseMemory}
 * <p>
 * A {@link GLBufferPool} is created with gst_gl_buffer_pool_new()
 * <p>
 * {@link GLBufferPool} implements the VideoMeta buffer pool option
 * {@code GST_BUFFER_POOL_OPTION_VIDEO_META}, the VideoAligment buffer pool option
 * {@code GST_BUFFER_POOL_OPTION_VIDEO_ALIGNMENT} as well as the OpenGL specific
 * {@code GST_BUFFER_POOL_OPTION_GL_SYNC_META} buffer pool option.
 */
public class GLBufferPool extends org.gstreamer.gst.BufferPool {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBufferPool";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.BufferPool.getMemoryLayout().withName("bufferpool"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLBufferPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBufferPool(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBufferPool> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBufferPool(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_buffer_pool_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLBufferPool(org.gstreamer.gl.GLContext context) {
        super(constructNew(context));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * The returned {@link GLAllocationParams} will by {@code null} before the first successful
     * call to gst_buffer_pool_set_config().  Subsequent successful calls to
     * gst_buffer_pool_set_config() will cause this function to return a new
     * {@link GLAllocationParams} which may or may not contain the same information.
     * @return a copy of the {@link GLAllocationParams} being used by the {@code pool}
     */
    public org.gstreamer.gl.GLAllocationParams getGlAllocationParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_buffer_pool_get_gl_allocation_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_buffer_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLBufferPool.Builder} object constructs a {@link GLBufferPool} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLBufferPool.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.BufferPool.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLBufferPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBufferPool}.
         * @return A new instance of {@code GLBufferPool} with the properties 
         *         that were set in the Builder object.
         */
        public GLBufferPool build() {
            return (GLBufferPool) org.gtk.gobject.GObject.newWithProperties(
                GLBufferPool.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_buffer_pool_new = Interop.downcallHandle(
                "gst_gl_buffer_pool_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_buffer_pool_get_gl_allocation_params = Interop.downcallHandle(
                "gst_gl_buffer_pool_get_gl_allocation_params",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_buffer_pool_get_type = Interop.downcallHandle(
                "gst_gl_buffer_pool_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_buffer_pool_get_type != null;
    }
}
