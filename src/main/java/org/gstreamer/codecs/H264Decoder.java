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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoDecoder.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("input_state"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a H264Decoder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected H264Decoder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264Decoder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new H264Decoder(input);
    
    /**
     * Retrive DPB and return a {@link H264Picture} corresponding to
     * the {@code system_frame_number}
     * @param systemFrameNumber a target system frame number of {@link H264Picture}
     * @return a {@link H264Picture} if successful, or {@code null} otherwise
     */
    public org.gstreamer.codecs.H264Picture getPicture(int systemFrameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_decoder_get_picture.invokeExact(
                    handle(),
                    systemFrameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.codecs.H264Picture.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Called to en/disable reference picture modification process.
     * @param process whether subclass is requiring reference picture modification process
     */
    public void setProcessRefPicLists(boolean process) {
        try {
            DowncallHandles.gst_h264_decoder_set_process_ref_pic_lists.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(process, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_h264_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link H264Decoder.Builder} object constructs a {@link H264Decoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link H264Decoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.video.VideoDecoder.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link H264Decoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link H264Decoder}.
         * @return A new instance of {@code H264Decoder} with the properties 
         *         that were set in the Builder object.
         */
        public H264Decoder build() {
            return (H264Decoder) org.gtk.gobject.GObject.newWithProperties(
                H264Decoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setCompliance(org.gstreamer.codecs.H264DecoderCompliance compliance) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_h264_decoder_get_type != null;
    }
}
