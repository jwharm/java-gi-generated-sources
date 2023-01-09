package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An implementation of GstPad that can be used with {@link VideoAggregator}.
 * <p>
 * See {@link VideoAggregator} for more details.
 * @version 1.16
 */
public class VideoAggregatorConvertPad extends org.gstreamer.video.VideoAggregatorPad {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorConvertPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoAggregatorPad.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoAggregatorConvertPad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoAggregatorConvertPad(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorConvertPad> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorConvertPad(input);
    
    /**
     * Requests the pad to check and update the converter before the next usage to
     * update for any changes that have happened.
     */
    public void updateConversionInfo() {
        try {
            DowncallHandles.gst_video_aggregator_convert_pad_update_conversion_info.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gst_video_aggregator_convert_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoAggregatorConvertPad.Builder} object constructs a {@link VideoAggregatorConvertPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoAggregatorConvertPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.video.VideoAggregatorPad.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoAggregatorConvertPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorConvertPad}.
         * @return A new instance of {@code VideoAggregatorConvertPad} with the properties 
         *         that were set in the Builder object.
         */
        public VideoAggregatorConvertPad build() {
            return (VideoAggregatorConvertPad) org.gtk.gobject.GObject.newWithProperties(
                VideoAggregatorConvertPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setConverterConfig(org.gstreamer.gst.Structure converterConfig) {
            names.add("converter-config");
            values.add(org.gtk.gobject.Value.create(converterConfig));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_convert_pad_update_conversion_info = Interop.downcallHandle(
                "gst_video_aggregator_convert_pad_update_conversion_info",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_aggregator_convert_pad_get_type = Interop.downcallHandle(
                "gst_video_aggregator_convert_pad_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_aggregator_convert_pad_get_type != null;
    }
}
