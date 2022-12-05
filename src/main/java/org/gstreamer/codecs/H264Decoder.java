package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link H264Decoder} data structure.
 */
public class H264Decoder extends org.gstreamer.video.VideoDecoder {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264Decoder";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoDecoder.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("input_state"),
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
     * Create a H264Decoder proxy instance for the provided memory address.
     * <p>
     * Because H264Decoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public H264Decoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to H264Decoder if its GType is a (or inherits from) "GstH264Decoder".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code H264Decoder} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstH264Decoder", a ClassCastException will be thrown.
     */
    public static H264Decoder castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), H264Decoder.getType())) {
            return new H264Decoder(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstH264Decoder");
        }
    }
    
    /**
     * Retrive DPB and return a {@link H264Picture} corresponding to
     * the {@code system_frame_number}
     * @param systemFrameNumber a target system frame number of {@link H264Picture}
     * @return a {@link H264Picture} if successful, or {@code null} otherwise
     */
    public @NotNull org.gstreamer.codecs.H264Picture getPicture(int systemFrameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_decoder_get_picture.invokeExact(
                    handle(),
                    systemFrameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.H264Picture(RESULT, Ownership.FULL);
    }
    
    /**
     * Called to en/disable reference picture modification process.
     * @param process whether subclass is requiring reference picture modification process
     */
    public void setProcessRefPicLists(boolean process) {
        try {
            DowncallHandles.gst_h264_decoder_set_process_ref_pic_lists.invokeExact(
                    handle(),
                    process ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_h264_decoder_get_type.invokeExact();
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
         * A {@link H264Decoder.Build} object constructs a {@link H264Decoder} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link H264Decoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link H264Decoder} using {@link H264Decoder#castFrom}.
         * @return A new instance of {@code H264Decoder} with the properties 
         *         that were set in the Build object.
         */
        public H264Decoder construct() {
            return H264Decoder.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    H264Decoder.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The compliance controls the behavior of the decoder to handle some
         * subtle cases and contexts, such as the low-latency DPB bumping or
         * mapping the baseline profile as the constrained-baseline profile,
         * etc.
         * @param compliance The value for the {@code compliance} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompliance(org.gstreamer.codecs.H264DecoderCompliance compliance) {
            names.add("compliance");
            values.add(org.gtk.gobject.Value.create(compliance));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h264_decoder_get_picture = Interop.downcallHandle(
            "gst_h264_decoder_get_picture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_h264_decoder_set_process_ref_pic_lists = Interop.downcallHandle(
            "gst_h264_decoder_set_process_ref_pic_lists",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_h264_decoder_get_type = Interop.downcallHandle(
            "gst_h264_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
