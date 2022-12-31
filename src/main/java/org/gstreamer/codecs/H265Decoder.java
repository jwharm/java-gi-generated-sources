package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link H265Decoder} data structure.
 */
public class H265Decoder extends org.gstreamer.video.VideoDecoder {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH265Decoder";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoDecoder.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("input_state"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("RefPicSetStCurrBefore"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("RefPicSetStCurrAfter"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("RefPicSetStFoll"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("RefPicSetLtCurr"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("RefPicSetLtFoll"),
            Interop.valueLayout.C_INT.withName("NumPocStCurrBefore"),
            Interop.valueLayout.C_INT.withName("NumPocStCurrAfter"),
            Interop.valueLayout.C_INT.withName("NumPocStFoll"),
            Interop.valueLayout.C_INT.withName("NumPocLtCurr"),
            Interop.valueLayout.C_INT.withName("NumPocLtFoll"),
            Interop.valueLayout.C_INT.withName("NumPicTotalCurr"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a H265Decoder proxy instance for the provided memory address.
     * <p>
     * Because H265Decoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected H265Decoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, H265Decoder> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new H265Decoder(input, ownership);
    
    /**
     * Retrive DPB and return a {@link H265Picture} corresponding to
     * the {@code system_frame_number}
     * @param systemFrameNumber a target system frame number of {@link H265Picture}
     * @return a {@link H265Picture} if successful, or {@code null} otherwise
     */
    public org.gstreamer.codecs.H265Picture getPicture(int systemFrameNumber) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_decoder_get_picture.invokeExact(
                    handle(),
                    systemFrameNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.H265Picture.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Called to en/disable reference picture modification process.
     * @param process whether subclass is requiring reference picture modification process
     */
    public void setProcessRefPicLists(boolean process) {
        try {
            DowncallHandles.gst_h265_decoder_set_process_ref_pic_lists.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_h265_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link H265Decoder.Builder} object constructs a {@link H265Decoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link H265Decoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.video.VideoDecoder.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link H265Decoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link H265Decoder}.
         * @return A new instance of {@code H265Decoder} with the properties 
         *         that were set in the Builder object.
         */
        public H265Decoder build() {
            return (H265Decoder) org.gtk.gobject.GObject.newWithProperties(
                H265Decoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h265_decoder_get_picture = Interop.downcallHandle(
            "gst_h265_decoder_get_picture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_h265_decoder_set_process_ref_pic_lists = Interop.downcallHandle(
            "gst_h265_decoder_set_process_ref_pic_lists",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_h265_decoder_get_type = Interop.downcallHandle(
            "gst_h265_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
