package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorPad extends org.gstreamer.base.AggregatorPad {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorPad.getMemoryLayout().withName("parent"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoAggregatorPad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoAggregatorPad(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorPad> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorPad(input);
    
    /**
     * Returns the currently queued buffer that is going to be used
     * for the current output frame.
     * <p>
     * This must only be called from the {@link VideoAggregatorClass}::aggregate_frames virtual method,
     * or from the {@link VideoAggregatorPadClass}::prepare_frame virtual method of the aggregator pads.
     * <p>
     * The return value is only valid until {@link VideoAggregatorClass}::aggregate_frames or {@link VideoAggregatorPadClass}::prepare_frame
     * returns.
     * @return The currently queued buffer
     */
    public org.gstreamer.gst.Buffer getCurrentBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_pad_get_current_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the currently prepared video frame that has to be aggregated into
     * the current output frame.
     * <p>
     * This must only be called from the {@link VideoAggregatorClass}::aggregate_frames virtual method,
     * or from the {@link VideoAggregatorPadClass}::prepare_frame virtual method of the aggregator pads.
     * <p>
     * The return value is only valid until {@link VideoAggregatorClass}::aggregate_frames or {@link VideoAggregatorPadClass}::prepare_frame
     * returns.
     * @return The currently prepared video frame
     */
    public org.gstreamer.video.VideoFrame getPreparedFrame() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_pad_get_prepared_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFrame.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Checks if the pad currently has a buffer queued that is going to be used
     * for the current output frame.
     * <p>
     * This must only be called from the {@link VideoAggregatorClass}::aggregate_frames virtual method,
     * or from the {@link VideoAggregatorPadClass}::prepare_frame virtual method of the aggregator pads.
     * @return {@code true} if the pad has currently a buffer queued
     */
    public boolean hasCurrentBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_aggregator_pad_has_current_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Allows selecting that this pad requires an output format with alpha
     * @param needsAlpha {@code true} if this pad requires alpha output
     */
    public void setNeedsAlpha(boolean needsAlpha) {
        try {
            DowncallHandles.gst_video_aggregator_pad_set_needs_alpha.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(needsAlpha, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_video_aggregator_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoAggregatorPad.Builder} object constructs a {@link VideoAggregatorPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoAggregatorPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.AggregatorPad.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoAggregatorPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorPad}.
         * @return A new instance of {@code VideoAggregatorPad} with the properties 
         *         that were set in the Builder object.
         */
        public VideoAggregatorPad build() {
            return (VideoAggregatorPad) org.gtk.gobject.GObject.newWithProperties(
                VideoAggregatorPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setMaxLastBufferRepeat(long maxLastBufferRepeat) {
            names.add("max-last-buffer-repeat");
            values.add(org.gtk.gobject.Value.create(maxLastBufferRepeat));
            return this;
        }
        
        public Builder setRepeatAfterEos(boolean repeatAfterEos) {
            names.add("repeat-after-eos");
            values.add(org.gtk.gobject.Value.create(repeatAfterEos));
            return this;
        }
        
        public Builder setZorder(int zorder) {
            names.add("zorder");
            values.add(org.gtk.gobject.Value.create(zorder));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_pad_get_current_buffer = Interop.downcallHandle(
                "gst_video_aggregator_pad_get_current_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_aggregator_pad_get_prepared_frame = Interop.downcallHandle(
                "gst_video_aggregator_pad_get_prepared_frame",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_aggregator_pad_has_current_buffer = Interop.downcallHandle(
                "gst_video_aggregator_pad_has_current_buffer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_aggregator_pad_set_needs_alpha = Interop.downcallHandle(
                "gst_video_aggregator_pad_set_needs_alpha",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_aggregator_pad_get_type = Interop.downcallHandle(
                "gst_video_aggregator_pad_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_aggregator_pad_get_type != null;
    }
}
