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
public class GLColorConvert extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLColorConvert";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
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
    }
    
    /**
     * Create a GLColorConvert proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLColorConvert(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLColorConvert> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLColorConvert(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLColorConvert(org.gstreamer.gl.GLContext context) {
        super(constructNew(context));
        this.takeOwnership();
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.decide_allocation()
     * @param query a completed ALLOCATION {@link org.gstreamer.gst.Query}
     * @return whether the allocation parameters were successfully chosen
     */
    public boolean decideAllocation(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_color_convert_decide_allocation.invokeExact(
                    handle(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the data contained by {@code inbuf} using the formats specified by the
     * {@link org.gstreamer.gst.Caps} passed to gst_gl_color_convert_set_caps()
     * @param inbuf the {@link GLMemory} filled {@link org.gstreamer.gst.Buffer} to convert
     * @return a converted {@link org.gstreamer.gst.Buffer} or {@code null}
     */
    public org.gstreamer.gst.Buffer perform(org.gstreamer.gst.Buffer inbuf) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_color_convert_perform.invokeExact(
                    handle(),
                    inbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Initializes {@code convert} with the information required for conversion.
     * @param inCaps input {@link org.gstreamer.gst.Caps}
     * @param outCaps output {@link org.gstreamer.gst.Caps}
     */
    public boolean setCaps(org.gstreamer.gst.Caps inCaps, org.gstreamer.gst.Caps outCaps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_color_convert_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static org.gstreamer.gst.Caps fixateCaps(org.gstreamer.gl.GLContext context, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps other) {
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
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.transform_caps()
     * @param context a {@link GLContext} to use for transforming {@code caps}
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} to transform
     * @param filter a set of filter {@link org.gstreamer.gst.Caps}
     * @return the converted {@link org.gstreamer.gst.Caps}
     */
    public static org.gstreamer.gst.Caps transformCaps(org.gstreamer.gl.GLContext context, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filter) {
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
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link GLColorConvert.Builder} object constructs a {@link GLColorConvert} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLColorConvert.Builder#build()}. 
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
         * Finish building the {@link GLColorConvert} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLColorConvert}.
         * @return A new instance of {@code GLColorConvert} with the properties 
         *         that were set in the Builder object.
         */
        public GLColorConvert build() {
            return (GLColorConvert) org.gtk.gobject.GObject.newWithProperties(
                GLColorConvert.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_color_convert_get_type != null;
    }
}
