package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLFilter} helps to implement simple OpenGL filter elements taking a
 * single input and producing a single output with a {@link GLFramebuffer}
 */
public class GLFilter extends org.gstreamer.gl.GLBaseFilter {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFilter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLBaseFilter.getMemoryLayout().withName("parent"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
        Interop.valueLayout.C_INT.withName("in_texture_target"),
        Interop.valueLayout.C_INT.withName("out_texture_target"),
        Interop.valueLayout.ADDRESS.withName("out_caps"),
        Interop.valueLayout.ADDRESS.withName("fbo"),
        Interop.valueLayout.C_INT.withName("gl_result"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("inbuf"),
        Interop.valueLayout.ADDRESS.withName("outbuf"),
        Interop.valueLayout.ADDRESS.withName("default_shader"),
        Interop.valueLayout.C_INT.withName("valid_attributes"),
        Interop.valueLayout.C_INT.withName("vao"),
        Interop.valueLayout.C_INT.withName("vbo_indices"),
        Interop.valueLayout.C_INT.withName("vertex_buffer"),
        Interop.valueLayout.C_INT.withName("draw_attr_position_loc"),
        Interop.valueLayout.C_INT.withName("draw_attr_texture_loc"),
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
     * Create a GLFilter proxy instance for the provided memory address.
     * <p>
     * Because GLFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLFilter(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLFilter if its GType is a (or inherits from) "GstGLFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLFilter", a ClassCastException will be thrown.
     */
    public static GLFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLFilter.getType())) {
            return new GLFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLFilter");
        }
    }
    
    /**
     * Render a fullscreen quad using the current GL state.  The only GL state this
     * modifies is the necessary vertex/index buffers and, if necessary, a
     * Vertex Array Object for drawing a fullscreen quad.  Framebuffer state,
     * any shaders, viewport state, etc must be setup by the caller.
     */
    public void drawFullscreenQuad() {
        try {
            DowncallHandles.gst_gl_filter_draw_fullscreen_quad.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls filter_texture vfunc with correctly mapped {@code GstGLMemorys}
     * @param input an input buffer
     * @param output an output buffer
     * @return whether the transformation succeeded
     */
    public boolean filterTexture(@NotNull org.gstreamer.gst.Buffer input, @NotNull org.gstreamer.gst.Buffer output) {
        java.util.Objects.requireNonNull(input, "Parameter 'input' must not be null");
        java.util.Objects.requireNonNull(output, "Parameter 'output' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_filter_filter_texture.invokeExact(
                    handle(),
                    input.handle(),
                    output.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Transforms {@code input} into {@code output} using {@code func} on through FBO.
     * @param input the input texture
     * @param output the output texture
     * @param func the function to transform {@code input} into {@code output}. called with {@code data}
     * @return the return value of {@code func}
     */
    public boolean renderToTarget(@NotNull org.gstreamer.gl.GLMemory input, @NotNull org.gstreamer.gl.GLMemory output, @NotNull org.gstreamer.gl.GLFilterRenderFunc func) {
        java.util.Objects.requireNonNull(input, "Parameter 'input' must not be null");
        java.util.Objects.requireNonNull(output, "Parameter 'output' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_filter_render_to_target.invokeExact(
                    handle(),
                    input.handle(),
                    output.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLFilterRenderFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Transforms {@code input} into {@code output} using {@code shader} with a FBO.
     * <p>
     * See also: gst_gl_filter_render_to_target()
     * @param input the input texture
     * @param output the output texture
     * @param shader the shader to use.
     */
    public void renderToTargetWithShader(@NotNull org.gstreamer.gl.GLMemory input, @NotNull org.gstreamer.gl.GLMemory output, @NotNull org.gstreamer.gl.GLShader shader) {
        java.util.Objects.requireNonNull(input, "Parameter 'input' must not be null");
        java.util.Objects.requireNonNull(output, "Parameter 'output' must not be null");
        java.util.Objects.requireNonNull(shader, "Parameter 'shader' must not be null");
        try {
            DowncallHandles.gst_gl_filter_render_to_target_with_shader.invokeExact(
                    handle(),
                    input.handle(),
                    output.handle(),
                    shader.handle());
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
            RESULT = (long) DowncallHandles.gst_gl_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static void addRgbaPadTemplates(@NotNull org.gstreamer.gl.GLFilterClass klass) {
        java.util.Objects.requireNonNull(klass, "Parameter 'klass' must not be null");
        try {
            DowncallHandles.gst_gl_filter_add_rgba_pad_templates.invokeExact(
                    klass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gl.GLBaseFilter.Build {
        
         /**
         * A {@link GLFilter.Build} object constructs a {@link GLFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLFilter} using {@link GLFilter#castFrom}.
         * @return A new instance of {@code GLFilter} with the properties 
         *         that were set in the Build object.
         */
        public GLFilter construct() {
            return GLFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_filter_draw_fullscreen_quad = Interop.downcallHandle(
            "gst_gl_filter_draw_fullscreen_quad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_filter_filter_texture = Interop.downcallHandle(
            "gst_gl_filter_filter_texture",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_filter_render_to_target = Interop.downcallHandle(
            "gst_gl_filter_render_to_target",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_filter_render_to_target_with_shader = Interop.downcallHandle(
            "gst_gl_filter_render_to_target_with_shader",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_filter_get_type = Interop.downcallHandle(
            "gst_gl_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_filter_add_rgba_pad_templates = Interop.downcallHandle(
            "gst_gl_filter_add_rgba_pad_templates",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
