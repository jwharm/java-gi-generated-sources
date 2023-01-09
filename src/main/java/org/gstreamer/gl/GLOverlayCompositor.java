package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque {@link GLOverlayCompositor} object
 */
public class GLOverlayCompositor extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLOverlayCompositor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.C_INT.withName("last_window_width"),
            Interop.valueLayout.C_INT.withName("last_window_height"),
            Interop.valueLayout.ADDRESS.withName("overlays"),
            Interop.valueLayout.ADDRESS.withName("shader"),
            Interop.valueLayout.C_INT.withName("position_attrib"),
            Interop.valueLayout.C_INT.withName("texcoord_attrib"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLOverlayCompositor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLOverlayCompositor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLOverlayCompositor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLOverlayCompositor(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_overlay_compositor_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLOverlayCompositor(org.gstreamer.gl.GLContext context) {
        super(constructNew(context));
        this.refSink();
        this.takeOwnership();
    }
    
    public void drawOverlays() {
        try {
            DowncallHandles.gst_gl_overlay_compositor_draw_overlays.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void freeOverlays() {
        try {
            DowncallHandles.gst_gl_overlay_compositor_free_overlays.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void uploadOverlays(org.gstreamer.gst.Buffer buf) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_overlay_compositor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.gst.Caps addCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_overlay_compositor_add_caps.invokeExact(caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link GLOverlayCompositor.Builder} object constructs a {@link GLOverlayCompositor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLOverlayCompositor.Builder#build()}. 
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
         * Finish building the {@link GLOverlayCompositor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLOverlayCompositor}.
         * @return A new instance of {@code GLOverlayCompositor} with the properties 
         *         that were set in the Builder object.
         */
        public GLOverlayCompositor build() {
            return (GLOverlayCompositor) org.gtk.gobject.GObject.newWithProperties(
                GLOverlayCompositor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setYinvert(boolean yinvert) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_overlay_compositor_get_type != null;
    }
}
