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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoDecoder.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("input_state"),
            Interop.valueLayout.C_INT.withName("parse_compressed_headers"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Vp9Decoder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9Decoder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9Decoder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9Decoder(input);
    
    /**
     * Called to set non-keyframe format change awareness
     * @param support whether subclass can support non-keyframe format change
     */
    public void setNonKeyframeFormatChangeSupport(boolean support) {
        try {
            DowncallHandles.gst_vp9_decoder_set_non_keyframe_format_change_support.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(support, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_vp9_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Vp9Decoder.Builder} object constructs a {@link Vp9Decoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Vp9Decoder.Builder#build()}. 
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
         * Finish building the {@link Vp9Decoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Vp9Decoder}.
         * @return A new instance of {@code Vp9Decoder} with the properties 
         *         that were set in the Builder object.
         */
        public Vp9Decoder build() {
            return (Vp9Decoder) org.gtk.gobject.GObject.newWithProperties(
                Vp9Decoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vp9_decoder_get_type != null;
    }
}
