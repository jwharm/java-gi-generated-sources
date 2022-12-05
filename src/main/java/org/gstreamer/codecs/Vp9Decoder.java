package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link Vp9Decoder} data structure.
 */
public class Vp9Decoder extends org.gstreamer.video.VideoDecoder {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9Decoder";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoDecoder.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("input_state"),
        Interop.valueLayout.C_INT.withName("parse_compressed_headers"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Create a Vp9Decoder proxy instance for the provided memory address.
     * <p>
     * Because Vp9Decoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9Decoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Vp9Decoder if its GType is a (or inherits from) "GstVp9Decoder".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Vp9Decoder} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVp9Decoder", a ClassCastException will be thrown.
     */
    public static Vp9Decoder castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Vp9Decoder.getType())) {
            return new Vp9Decoder(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVp9Decoder");
        }
    }
    
    /**
     * Called to set non-keyframe format change awareness
     * @param support whether subclass can support non-keyframe format change
     */
    public void setNonKeyframeFormatChangeSupport(boolean support) {
        try {
            DowncallHandles.gst_vp9_decoder_set_non_keyframe_format_change_support.invokeExact(
                    handle(),
                    support ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_vp9_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.video.VideoDecoder.Build {
        
         /**
         * A {@link Vp9Decoder.Build} object constructs a {@link Vp9Decoder} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Vp9Decoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Vp9Decoder} using {@link Vp9Decoder#castFrom}.
         * @return A new instance of {@code Vp9Decoder} with the properties 
         *         that were set in the Build object.
         */
        public Vp9Decoder construct() {
            return Vp9Decoder.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Vp9Decoder.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vp9_decoder_set_non_keyframe_format_change_support = Interop.downcallHandle(
            "gst_vp9_decoder_set_non_keyframe_format_change_support",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_vp9_decoder_get_type = Interop.downcallHandle(
            "gst_vp9_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
