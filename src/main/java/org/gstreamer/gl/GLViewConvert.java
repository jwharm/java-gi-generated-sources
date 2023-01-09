package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Convert stereoscopic/multiview video using fragment shaders.
 */
public class GLViewConvert extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLViewConvert";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
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
    }
    
    /**
     * Create a GLViewConvert proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLViewConvert(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLViewConvert> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLViewConvert(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLViewConvert() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Provides an implementation of {@link org.gstreamer.base.BaseTransformClass}.fixate_caps()
     * @param direction a {@link org.gstreamer.gst.PadDirection}
     * @param caps the {@link org.gstreamer.gst.Caps} of {@code direction}
     * @param othercaps the {@link org.gstreamer.gst.Caps} to fixate
     * @return the fixated {@link org.gstreamer.gst.Caps}
     */
    public org.gstreamer.gst.Caps fixateCaps(org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps othercaps) {
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
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieve the processed output buffer placing the output in {@code outbuf_ptr}.
     * @param outbufPtr a {@link org.gstreamer.gst.Buffer}
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public org.gstreamer.gst.FlowReturn getOutput(Out<org.gstreamer.gst.Buffer> outbufPtr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outbufPtrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_view_convert_get_output.invokeExact(
                        handle(),
                        (Addressable) outbufPtrPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outbufPtr.set(org.gstreamer.gst.Buffer.fromAddress.marshal(outbufPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.gst.FlowReturn.of(RESULT);
        }
    }
    
    /**
     * Converts the data contained by {@code inbuf} using the formats specified by the
     * {@link org.gstreamer.gst.Caps} passed to gst_gl_view_convert_set_caps()
     * @param inbuf the {@link GLMemory} filled {@link org.gstreamer.gst.Buffer} to convert
     * @return a converted {@link org.gstreamer.gst.Buffer} or {@code null}
     */
    public org.gstreamer.gst.Buffer perform(org.gstreamer.gst.Buffer inbuf) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_view_convert_perform.invokeExact(
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
     * Reset {@code viewconvert} to the default state.  Further operation will require
     * setting the caps with gst_gl_view_convert_set_caps().
     */
    public void reset() {
        try {
            DowncallHandles.gst_gl_view_convert_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code viewconvert} with the information required for conversion.
     * @param inCaps input {@link org.gstreamer.gst.Caps}
     * @param outCaps output {@link org.gstreamer.gst.Caps}
     */
    public boolean setCaps(org.gstreamer.gst.Caps inCaps, org.gstreamer.gst.Caps outCaps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_view_convert_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set {@code context} on {@code viewconvert}
     * @param context the {@link GLContext} to set
     */
    public void setContext(org.gstreamer.gl.GLContext context) {
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
    public org.gstreamer.gst.FlowReturn submitInputBuffer(boolean isDiscont, org.gstreamer.gst.Buffer input) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_view_convert_submit_input_buffer.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isDiscont, null).intValue(),
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
    public org.gstreamer.gst.Caps transformCaps(org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filter) {
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
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_view_convert_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLViewConvert.Builder} object constructs a {@link GLViewConvert} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLViewConvert.Builder#build()}. 
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
         * Finish building the {@link GLViewConvert} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLViewConvert}.
         * @return A new instance of {@code GLViewConvert} with the properties 
         *         that were set in the Builder object.
         */
        public GLViewConvert build() {
            return (GLViewConvert) org.gtk.gobject.GObject.newWithProperties(
                GLViewConvert.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDownmixMode(org.gstreamer.gl.GLStereoDownmix downmixMode) {
            names.add("downmix-mode");
            values.add(org.gtk.gobject.Value.create(downmixMode));
            return this;
        }
        
        public Builder setInputFlagsOverride(org.gstreamer.video.VideoMultiviewFlags inputFlagsOverride) {
            names.add("input-flags-override");
            values.add(org.gtk.gobject.Value.create(inputFlagsOverride));
            return this;
        }
        
        public Builder setInputModeOverride(org.gstreamer.video.VideoMultiviewMode inputModeOverride) {
            names.add("input-mode-override");
            values.add(org.gtk.gobject.Value.create(inputModeOverride));
            return this;
        }
        
        public Builder setOutputFlagsOverride(org.gstreamer.video.VideoMultiviewFlags outputFlagsOverride) {
            names.add("output-flags-override");
            values.add(org.gtk.gobject.Value.create(outputFlagsOverride));
            return this;
        }
        
        public Builder setOutputModeOverride(org.gstreamer.video.VideoMultiviewMode outputModeOverride) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_view_convert_get_type != null;
    }
}
