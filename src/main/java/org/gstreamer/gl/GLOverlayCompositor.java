package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque {@link GLOverlayCompositor} object
 */
public class GLOverlayCompositor extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLOverlayCompositor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.C_INT.withName("last_window_width"),
        Interop.valueLayout.C_INT.withName("last_window_height"),
        Interop.valueLayout.ADDRESS.withName("overlays"),
        Interop.valueLayout.ADDRESS.withName("shader"),
        Interop.valueLayout.C_INT.withName("position_attrib"),
        Interop.valueLayout.C_INT.withName("texcoord_attrib"),
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
     * Create a GLOverlayCompositor proxy instance for the provided memory address.
     * <p>
     * Because GLOverlayCompositor is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLOverlayCompositor(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLOverlayCompositor if its GType is a (or inherits from) "GstGLOverlayCompositor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLOverlayCompositor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLOverlayCompositor", a ClassCastException will be thrown.
     */
    public static GLOverlayCompositor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLOverlayCompositor.getType())) {
            return new GLOverlayCompositor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLOverlayCompositor");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_overlay_compositor_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLOverlayCompositor(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.NONE);
    }
    
    public void drawOverlays() {
        try {
            DowncallHandles.gst_gl_overlay_compositor_draw_overlays.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void freeOverlays() {
        try {
            DowncallHandles.gst_gl_overlay_compositor_free_overlays.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void uploadOverlays(@NotNull org.gstreamer.gst.Buffer buf) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        try {
            DowncallHandles.gst_gl_overlay_compositor_upload_overlays.invokeExact(
                    handle(),
                    buf.handle());
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
            RESULT = (long) DowncallHandles.gst_gl_overlay_compositor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull org.gstreamer.gst.Caps addCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_overlay_compositor_add_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLOverlayCompositor.Build} object constructs a {@link GLOverlayCompositor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLOverlayCompositor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLOverlayCompositor} using {@link GLOverlayCompositor#castFrom}.
         * @return A new instance of {@code GLOverlayCompositor} with the properties 
         *         that were set in the Build object.
         */
        public GLOverlayCompositor construct() {
            return GLOverlayCompositor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLOverlayCompositor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setYinvert(boolean yinvert) {
            names.add("yinvert");
            values.add(org.gtk.gobject.Value.create(yinvert));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_overlay_compositor_new = Interop.downcallHandle(
            "gst_gl_overlay_compositor_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_overlay_compositor_draw_overlays = Interop.downcallHandle(
            "gst_gl_overlay_compositor_draw_overlays",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_overlay_compositor_free_overlays = Interop.downcallHandle(
            "gst_gl_overlay_compositor_free_overlays",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_overlay_compositor_upload_overlays = Interop.downcallHandle(
            "gst_gl_overlay_compositor_upload_overlays",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_overlay_compositor_get_type = Interop.downcallHandle(
            "gst_gl_overlay_compositor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_overlay_compositor_add_caps = Interop.downcallHandle(
            "gst_gl_overlay_compositor_add_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
