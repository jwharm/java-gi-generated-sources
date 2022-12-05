package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Convert stereoscopic/multiview video using fragment shaders.
 */
public class GLViewConvert extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLViewConvert";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("shader"),
        Interop.valueLayout.C_INT.withName("input_mode_override"),
        Interop.valueLayout.C_INT.withName("input_flags_override"),
        Interop.valueLayout.C_INT.withName("output_mode_override"),
        Interop.valueLayout.C_INT.withName("output_flags_override"),
        Interop.valueLayout.C_INT.withName("downmix_mode"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
        Interop.valueLayout.C_INT.withName("from_texture_target"),
        Interop.valueLayout.C_INT.withName("to_texture_target"),
        Interop.valueLayout.C_INT.withName("caps_passthrough"),
        Interop.valueLayout.C_INT.withName("initted"),
        Interop.valueLayout.C_INT.withName("reconfigure"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("fbo"),
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
     * Create a GLViewConvert proxy instance for the provided memory address.
     * <p>
     * Because GLViewConvert is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLViewConvert(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLViewConvert if its GType is a (or inherits from) "GstGLViewConvert".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLViewConvert} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLViewConvert", a ClassCastException will be thrown.
     */
    public static GLViewConvert castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLViewConvert.getType())) {
            return new GLViewConvert(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLViewConvert");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLViewConvert() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.fixate_caps()
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} of {@code direction}
     * @param othercaps the {@link org.gstreamer.gst.Caps} to fixate
     * @return the fixated {@link org.gstreamer.gst.Caps}
     */
    public @NotNull org.gstreamer.gst.Caps fixateCaps(@NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Caps othercaps) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(othercaps, "Parameter 'othercaps' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_fixate_caps.invokeExact(
                    handle(),
                    direction.getValue(),
                    caps.handle(),
                    othercaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        othercaps.yieldOwnership();
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieve the processed output buffer placing the output in {@code outbuf_ptr}.
     * @param outbufPtr a {@link org.gstreamer.gst.Buffer}
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn getOutput(@NotNull Out<org.gstreamer.gst.Buffer> outbufPtr) {
        java.util.Objects.requireNonNull(outbufPtr, "Parameter 'outbufPtr' must not be null");
        MemorySegment outbufPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_view_convert_get_output.invokeExact(
                    handle(),
                    (Addressable) outbufPtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outbufPtr.set(new org.gstreamer.gst.Buffer(outbufPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Converts the data contained by {@code inbuf} using the formats specified by the
     * {@link org.gstreamer.gst.Caps} passed to gst_gl_view_convert_set_caps()
     * @param inbuf the {@link GLMemory} filled {@link org.gstreamer.gst.Buffer} to convert
     * @return a converted {@link org.gstreamer.gst.Buffer} or {@code null}
     */
    public @NotNull org.gstreamer.gst.Buffer perform(@NotNull org.gstreamer.gst.Buffer inbuf) {
        java.util.Objects.requireNonNull(inbuf, "Parameter 'inbuf' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_perform.invokeExact(
                    handle(),
                    inbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Reset {@code viewconvert} to the default state.  Further operation will require
     * setting the caps with gst_gl_view_convert_set_caps().
     */
    public void reset() {
        try {
            DowncallHandles.gst_gl_view_convert_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code viewconvert} with the information required for conversion.
     * @param inCaps input {@link org.gstreamer.gst.Caps}
     * @param outCaps output {@link org.gstreamer.gst.Caps}
     */
    public boolean setCaps(@NotNull org.gstreamer.gst.Caps inCaps, @NotNull org.gstreamer.gst.Caps outCaps) {
        java.util.Objects.requireNonNull(inCaps, "Parameter 'inCaps' must not be null");
        java.util.Objects.requireNonNull(outCaps, "Parameter 'outCaps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_view_convert_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set {@code context} on {@code viewconvert}
     * @param context the {@link GLContext} to set
     */
    public void setContext(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        try {
            DowncallHandles.gst_gl_view_convert_set_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Submit {@code input} to be processed by {@code viewconvert}
     * @param isDiscont true if we have a discontinuity
     * @param input a {@link org.gstreamer.gst.Buffer}
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn submitInputBuffer(boolean isDiscont, @NotNull org.gstreamer.gst.Buffer input) {
        java.util.Objects.requireNonNull(input, "Parameter 'input' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_view_convert_submit_input_buffer.invokeExact(
                    handle(),
                    isDiscont ? 1 : 0,
                    input.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        input.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.transform_caps()
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} to transform
     * @param filter a set of filter {@link org.gstreamer.gst.Caps}
     * @return the converted {@link org.gstreamer.gst.Caps}
     */
    public @NotNull org.gstreamer.gst.Caps transformCaps(@NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Caps filter) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(filter, "Parameter 'filter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_transform_caps.invokeExact(
                    handle(),
                    direction.getValue(),
                    caps.handle(),
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_view_convert_get_type.invokeExact();
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
         * A {@link GLViewConvert.Build} object constructs a {@link GLViewConvert} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLViewConvert} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLViewConvert} using {@link GLViewConvert#castFrom}.
         * @return A new instance of {@code GLViewConvert} with the properties 
         *         that were set in the Build object.
         */
        public GLViewConvert construct() {
            return GLViewConvert.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLViewConvert.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setDownmixMode(org.gstreamer.gl.GLStereoDownmix downmixMode) {
            names.add("downmix-mode");
            values.add(org.gtk.gobject.Value.create(downmixMode));
            return this;
        }
        
        public Build setInputFlagsOverride(org.gstreamer.video.VideoMultiviewFlags inputFlagsOverride) {
            names.add("input-flags-override");
            values.add(org.gtk.gobject.Value.create(inputFlagsOverride));
            return this;
        }
        
        public Build setInputModeOverride(org.gstreamer.video.VideoMultiviewMode inputModeOverride) {
            names.add("input-mode-override");
            values.add(org.gtk.gobject.Value.create(inputModeOverride));
            return this;
        }
        
        public Build setOutputFlagsOverride(org.gstreamer.video.VideoMultiviewFlags outputFlagsOverride) {
            names.add("output-flags-override");
            values.add(org.gtk.gobject.Value.create(outputFlagsOverride));
            return this;
        }
        
        public Build setOutputModeOverride(org.gstreamer.video.VideoMultiviewMode outputModeOverride) {
            names.add("output-mode-override");
            values.add(org.gtk.gobject.Value.create(outputModeOverride));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_view_convert_new = Interop.downcallHandle(
            "gst_gl_view_convert_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_fixate_caps = Interop.downcallHandle(
            "gst_gl_view_convert_fixate_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_get_output = Interop.downcallHandle(
            "gst_gl_view_convert_get_output",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_perform = Interop.downcallHandle(
            "gst_gl_view_convert_perform",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_reset = Interop.downcallHandle(
            "gst_gl_view_convert_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_set_caps = Interop.downcallHandle(
            "gst_gl_view_convert_set_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_set_context = Interop.downcallHandle(
            "gst_gl_view_convert_set_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_submit_input_buffer = Interop.downcallHandle(
            "gst_gl_view_convert_submit_input_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_transform_caps = Interop.downcallHandle(
            "gst_gl_view_convert_transform_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_view_convert_get_type = Interop.downcallHandle(
            "gst_gl_view_convert_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
