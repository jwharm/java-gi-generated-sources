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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.BufferPool.getMemoryLayout().withName("bufferpool"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Create a GLBufferPool proxy instance for the provided memory address.
     * <p>
     * Because GLBufferPool is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBufferPool(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLBufferPool if its GType is a (or inherits from) "GstGLBufferPool".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLBufferPool} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLBufferPool", a ClassCastException will be thrown.
     */
    public static GLBufferPool castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLBufferPool.getType())) {
            return new GLBufferPool(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLBufferPool");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_buffer_pool_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLBufferPool(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.NONE);
    }
    
    /**
     * The returned {@link GLAllocationParams} will by {@code null} before the first successful
     * call to gst_buffer_pool_set_config().  Subsequent successful calls to
     * gst_buffer_pool_set_config() will cause this function to return a new
     * {@link GLAllocationParams} which may or may not contain the same information.
     * @return a copy of the {@link GLAllocationParams} being used by the {@code pool}
     */
    public @NotNull org.gstreamer.gl.GLAllocationParams getGlAllocationParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_buffer_pool_get_gl_allocation_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAllocationParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_buffer_pool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.BufferPool.Build {
        
         /**
         * A {@link GLBufferPool.Build} object constructs a {@link GLBufferPool} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLBufferPool} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBufferPool} using {@link GLBufferPool#castFrom}.
         * @return A new instance of {@code GLBufferPool} with the properties 
         *         that were set in the Build object.
         */
        public GLBufferPool construct() {
            return GLBufferPool.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLBufferPool.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
