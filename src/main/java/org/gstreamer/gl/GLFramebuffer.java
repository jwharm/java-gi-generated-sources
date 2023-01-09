package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link GLFramebuffer} represents and holds an OpenGL framebuffer object with
 * it's associated attachments.
 * <p>
 * A {@link GLFramebuffer} can be created with gst_gl_framebuffer_new() or
 * gst_gl_framebuffer_new_with_default_depth() and bound with
 * gst_gl_framebuffer_bind().  Other resources can be bound with
 * gst_gl_framebuffer_attach()
 * <p>
 * Note: OpenGL framebuffers are not shareable resources so cannot be used
 * between multiple OpenGL contexts.
 * @version 1.10
 */
public class GLFramebuffer extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFramebuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.C_INT.withName("fbo_id"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("attachments"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLFramebuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLFramebuffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLFramebuffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLFramebuffer(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_framebuffer_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function will internally create an OpenGL framebuffer object and must
     * be called on {@code context}'s OpenGL thread.
     * @param context a {@link GLContext}
     */
    public GLFramebuffer(org.gstreamer.gl.GLContext context) {
        super(constructNew(context));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithDefaultDepth(org.gstreamer.gl.GLContext context, int width, int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_framebuffer_new_with_default_depth.invokeExact(
                    context.handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * This function will internally create an OpenGL framebuffer object and must
     * be called on {@code context}'s OpenGL thread.
     * @param context a {@link GLContext}
     * @param width width for the depth buffer
     * @param height for the depth buffer
     * @return a new {@link GLFramebuffer} with a depth buffer of {@code width} and {@code height}
     */
    public static GLFramebuffer newWithDefaultDepth(org.gstreamer.gl.GLContext context, int width, int height) {
        var RESULT = constructNewWithDefaultDepth(context, width, height);
        var OBJECT = (org.gstreamer.gl.GLFramebuffer) Interop.register(RESULT, org.gstreamer.gl.GLFramebuffer.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * attach {@code mem} to {@code attachment_point}
     * <p>
     * Must be called with the same OpenGL context current that {@code fb} was created
     * with.
     * @param attachmentPoint the OpenGL attachment point to bind {@code mem} to
     * @param mem the memory object to bind to {@code attachment_point}
     */
    public void attach(int attachmentPoint, org.gstreamer.gl.GLBaseMemory mem) {
        try {
            DowncallHandles.gst_gl_framebuffer_attach.invokeExact(
                    handle(),
                    attachmentPoint,
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Bind {@code fb} into the current thread
     * <p>
     * Must be called with the same OpenGL context current that {@code fb} was created
     * with.
     */
    public void bind() {
        try {
            DowncallHandles.gst_gl_framebuffer_bind.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform the steps necessary to have the output of a glDraw* command in
     * {@code func} update the contents of {@code mem}.
     * <p>
     * Note: this function does not map {@code mem} for writing with OpenGL and that must
     * be done manually by the caller using any of the mapping functions such as
     * gst_memory_map() with the map flags {@link org.gstreamer.gst.MapFlags#WRITE} | {@code GST_MAP_GL}.
     * <p>
     * Must be called with the same OpenGL context current that {@code fb} was created
     * with.
     * @param mem the {@link GLMemory} to draw to
     * @param func the function to run
     * @return the result of executing {@code func}
     */
    public boolean drawToTexture(org.gstreamer.gl.GLMemory mem, org.gstreamer.gl.GLFramebufferFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_framebuffer_draw_to_texture.invokeExact(
                    handle(),
                    mem.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve the effective dimensions from the current attachments attached to
     * {@code fb}.
     * @param width output width
     * @param height output height
     */
    public void getEffectiveDimensions(Out<Integer> width, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_gl_framebuffer_get_effective_dimensions.invokeExact(
                        handle(),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_framebuffer_get_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_framebuffer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLFramebuffer.Builder} object constructs a {@link GLFramebuffer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLFramebuffer.Builder#build()}. 
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
         * Finish building the {@link GLFramebuffer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLFramebuffer}.
         * @return A new instance of {@code GLFramebuffer} with the properties 
         *         that were set in the Builder object.
         */
        public GLFramebuffer build() {
            return (GLFramebuffer) org.gtk.gobject.GObject.newWithProperties(
                GLFramebuffer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_framebuffer_new = Interop.downcallHandle(
                "gst_gl_framebuffer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_new_with_default_depth = Interop.downcallHandle(
                "gst_gl_framebuffer_new_with_default_depth",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_attach = Interop.downcallHandle(
                "gst_gl_framebuffer_attach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_bind = Interop.downcallHandle(
                "gst_gl_framebuffer_bind",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_draw_to_texture = Interop.downcallHandle(
                "gst_gl_framebuffer_draw_to_texture",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_get_effective_dimensions = Interop.downcallHandle(
                "gst_gl_framebuffer_get_effective_dimensions",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_get_id = Interop.downcallHandle(
                "gst_gl_framebuffer_get_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_framebuffer_get_type = Interop.downcallHandle(
                "gst_gl_framebuffer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_framebuffer_get_type != null;
    }
}
