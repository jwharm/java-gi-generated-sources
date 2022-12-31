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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    /**
     * Create a GLFilter proxy instance for the provided memory address.
     * <p>
     * Because GLFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLFilter(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLFilter(input, ownership);
    
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
    public boolean filterTexture(org.gstreamer.gst.Buffer input, org.gstreamer.gst.Buffer output) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_filter_filter_texture.invokeExact(
                    handle(),
                    input.handle(),
                    output.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Transforms {@code input} into {@code output} using {@code func} on through FBO.
     * @param input the input texture
     * @param output the output texture
     * @param func the function to transform {@code input} into {@code output}. called with {@code data}
     * @return the return value of {@code func}
     */
    public boolean renderToTarget(org.gstreamer.gl.GLMemory input, org.gstreamer.gl.GLMemory output, org.gstreamer.gl.GLFilterRenderFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_filter_render_to_target.invokeExact(
                    handle(),
                    input.handle(),
                    output.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Transforms {@code input} into {@code output} using {@code shader} with a FBO.
     * <p>
     * See also: gst_gl_filter_render_to_target()
     * @param input the input texture
     * @param output the output texture
     * @param shader the shader to use.
     */
    public void renderToTargetWithShader(org.gstreamer.gl.GLMemory input, org.gstreamer.gl.GLMemory output, org.gstreamer.gl.GLShader shader) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static void addRgbaPadTemplates(org.gstreamer.gl.GLFilterClass klass) {
        try {
            DowncallHandles.gst_gl_filter_add_rgba_pad_templates.invokeExact(
                    klass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GLFilter.Builder} object constructs a {@link GLFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gl.GLBaseFilter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLFilter}.
         * @return A new instance of {@code GLFilter} with the properties 
         *         that were set in the Builder object.
         */
        public GLFilter build() {
            return (GLFilter) org.gtk.gobject.GObject.newWithProperties(
                GLFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
