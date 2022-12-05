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
public class GLFramebuffer extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFramebuffer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.C_INT.withName("fbo_id"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("attachments"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a GLFramebuffer proxy instance for the provided memory address.
     * <p>
     * Because GLFramebuffer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLFramebuffer(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLFramebuffer if its GType is a (or inherits from) "GstGLFramebuffer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLFramebuffer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLFramebuffer", a ClassCastException will be thrown.
     */
    public static GLFramebuffer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLFramebuffer.getType())) {
            return new GLFramebuffer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLFramebuffer");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_framebuffer_new.invokeExact(
                    context.handle());
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
    public GLFramebuffer(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.FULL);
    }
    
    private static Addressable constructNewWithDefaultDepth(@NotNull org.gstreamer.gl.GLContext context, int width, int height) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
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
    public static GLFramebuffer newWithDefaultDepth(@NotNull org.gstreamer.gl.GLContext context, int width, int height) {
        return new GLFramebuffer(constructNewWithDefaultDepth(context, width, height), Ownership.NONE);
    }
    
    /**
     * attach {@code mem} to {@code attachment_point}
     * <p>
     * Must be called with the same OpenGL context current that {@code fb} was created
     * with.
     * @param attachmentPoint the OpenGL attachment point to bind {@code mem} to
     * @param mem the memory object to bind to {@code attachment_point}
     */
    public void attach(int attachmentPoint, @NotNull org.gstreamer.gl.GLBaseMemory mem) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
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
            DowncallHandles.gst_gl_framebuffer_bind.invokeExact(
                    handle());
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
    public boolean drawToTexture(@NotNull org.gstreamer.gl.GLMemory mem, @NotNull org.gstreamer.gl.GLFramebufferFunc func) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_framebuffer_draw_to_texture.invokeExact(
                    handle(),
                    mem.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLFramebufferFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieve the effective dimensions from the current attachments attached to
     * {@code fb}.
     * @param width output width
     * @param height output height
     */
    public void getEffectiveDimensions(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_gl_framebuffer_get_effective_dimensions.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_framebuffer_get_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_framebuffer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLFramebuffer.Build} object constructs a {@link GLFramebuffer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLFramebuffer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLFramebuffer} using {@link GLFramebuffer#castFrom}.
         * @return A new instance of {@code GLFramebuffer} with the properties 
         *         that were set in the Build object.
         */
        public GLFramebuffer construct() {
            return GLFramebuffer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLFramebuffer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
