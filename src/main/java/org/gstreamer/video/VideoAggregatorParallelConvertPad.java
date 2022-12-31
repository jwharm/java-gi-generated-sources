package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An implementation of GstPad that can be used with {@link VideoAggregator}.
 * <p>
 * See {@link VideoAggregator} for more details.
 * @version 1.20
 */
public class VideoAggregatorParallelConvertPad extends org.gstreamer.video.VideoAggregatorConvertPad {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorParallelConvertPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoAggregatorConvertPad.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoAggregatorParallelConvertPad proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregatorParallelConvertPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAggregatorParallelConvertPad(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VideoAggregatorParallelConvertPad> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorParallelConvertPad(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_aggregator_parallel_convert_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoAggregatorParallelConvertPad.Builder} object constructs a {@link VideoAggregatorParallelConvertPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoAggregatorParallelConvertPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.video.VideoAggregatorConvertPad.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoAggregatorParallelConvertPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorParallelConvertPad}.
         * @return A new instance of {@code VideoAggregatorParallelConvertPad} with the properties 
         *         that were set in the Builder object.
         */
        public VideoAggregatorParallelConvertPad build() {
            return (VideoAggregatorParallelConvertPad) org.gtk.gobject.GObject.newWithProperties(
                VideoAggregatorParallelConvertPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_parallel_convert_pad_get_type = Interop.downcallHandle(
            "gst_video_aggregator_parallel_convert_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
