package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLColorConvert} is an object that converts between color spaces and/or
 * formats using OpenGL Shaders.
 * <p>
 * A {@link GLColorConvert} can be created with gst_gl_color_convert_new(), the
 * configuration negotiated with gst_gl_color_convert_transform_caps() and the
 * conversion performed with gst_gl_color_convert_perform().
 * <p>
 * The glcolorconvertelement provides a GStreamer element that uses
 * {@link GLColorConvert} to convert between video formats and color spaces.
 */
public class GLColorConvert extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLColorConvert";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("context"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
        Interop.valueLayout.C_INT.withName("initted"),
        Interop.valueLayout.C_INT.withName("passthrough"),
        Interop.valueLayout.ADDRESS.withName("inbuf"),
        Interop.valueLayout.ADDRESS.withName("outbuf"),
        Interop.valueLayout.ADDRESS.withName("fbo"),
        Interop.valueLayout.ADDRESS.withName("shader"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
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
     * Create a GLColorConvert proxy instance for the provided memory address.
     * <p>
     * Because GLColorConvert is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLColorConvert(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLColorConvert if its GType is a (or inherits from) "GstGLColorConvert".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLColorConvert} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLColorConvert", a ClassCastException will be thrown.
     */
    public static GLColorConvert castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLColorConvert.getType())) {
            return new GLColorConvert(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLColorConvert");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLColorConvert(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.FULL);
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.decide_allocation()
     * @param query a completed ALLOCATION {@link org.gstreamer.gst.Query}
     * @return whether the allocation parameters were successfully chosen
     */
    public boolean decideAllocation(@NotNull org.gstreamer.gst.Query query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_color_convert_decide_allocation.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Converts the data contained by {@code inbuf} using the formats specified by the
     * {@link org.gstreamer.gst.Caps} passed to gst_gl_color_convert_set_caps()
     * @param inbuf the {@link GLMemory} filled {@link org.gstreamer.gst.Buffer} to convert
     * @return a converted {@link org.gstreamer.gst.Buffer} or {@code null}
     */
    public @NotNull org.gstreamer.gst.Buffer perform(@NotNull org.gstreamer.gst.Buffer inbuf) {
        java.util.Objects.requireNonNull(inbuf, "Parameter 'inbuf' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_perform.invokeExact(
                    handle(),
                    inbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes {@code convert} with the information required for conversion.
     * @param inCaps input {@link org.gstreamer.gst.Caps}
     * @param outCaps output {@link org.gstreamer.gst.Caps}
     */
    public boolean setCaps(@NotNull org.gstreamer.gst.Caps inCaps, @NotNull org.gstreamer.gst.Caps outCaps) {
        java.util.Objects.requireNonNull(inCaps, "Parameter 'inCaps' must not be null");
        java.util.Objects.requireNonNull(outCaps, "Parameter 'outCaps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_color_convert_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_color_convert_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.fixate_caps()
     * @param context a {@link GLContext} to use for transforming {@code caps}
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} of {@code direction}
     * @param other the {@link org.gstreamer.gst.Caps} to fixate
     * @return the fixated {@link org.gstreamer.gst.Caps}
     */
    public static @NotNull org.gstreamer.gst.Caps fixateCaps(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Caps other) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_fixate_caps.invokeExact(
                    context.handle(),
                    direction.getValue(),
                    caps.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        other.yieldOwnership();
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.transform_caps()
     * @param context a {@link GLContext} to use for transforming {@code caps}
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} to transform
     * @param filter a set of filter {@link org.gstreamer.gst.Caps}
     * @return the converted {@link org.gstreamer.gst.Caps}
     */
    public static @NotNull org.gstreamer.gst.Caps transformCaps(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Caps filter) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(filter, "Parameter 'filter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_transform_caps.invokeExact(
                    context.handle(),
                    direction.getValue(),
                    caps.handle(),
                    filter.handle());
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
         * A {@link GLColorConvert.Build} object constructs a {@link GLColorConvert} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLColorConvert} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLColorConvert} using {@link GLColorConvert#castFrom}.
         * @return A new instance of {@code GLColorConvert} with the properties 
         *         that were set in the Build object.
         */
        public GLColorConvert construct() {
            return GLColorConvert.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLColorConvert.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_color_convert_new = Interop.downcallHandle(
            "gst_gl_color_convert_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_decide_allocation = Interop.downcallHandle(
            "gst_gl_color_convert_decide_allocation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_perform = Interop.downcallHandle(
            "gst_gl_color_convert_perform",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_set_caps = Interop.downcallHandle(
            "gst_gl_color_convert_set_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_get_type = Interop.downcallHandle(
            "gst_gl_color_convert_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_fixate_caps = Interop.downcallHandle(
            "gst_gl_color_convert_fixate_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_color_convert_transform_caps = Interop.downcallHandle(
            "gst_gl_color_convert_transform_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
