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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.AggregatorPad.getMemoryLayout().withName("parent"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a VideoAggregatorPad proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregatorPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregatorPad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoAggregatorPad if its GType is a (or inherits from) "GstVideoAggregatorPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoAggregatorPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoAggregatorPad", a ClassCastException will be thrown.
     */
    public static VideoAggregatorPad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoAggregatorPad.getType())) {
            return new VideoAggregatorPad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoAggregatorPad");
        }
    }
    
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
    public @NotNull org.gstreamer.gst.Buffer getCurrentBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_pad_get_current_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.NONE);
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
    public @NotNull org.gstreamer.video.VideoFrame getPreparedFrame() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_pad_get_prepared_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoFrame(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gst_video_aggregator_pad_has_current_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allows selecting that this pad requires an output format with alpha
     * @param needsAlpha {@code true} if this pad requires alpha output
     */
    public void setNeedsAlpha(boolean needsAlpha) {
        try {
            DowncallHandles.gst_video_aggregator_pad_set_needs_alpha.invokeExact(
                    handle(),
                    needsAlpha ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_video_aggregator_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.AggregatorPad.Build {
        
         /**
         * A {@link VideoAggregatorPad.Build} object constructs a {@link VideoAggregatorPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoAggregatorPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregatorPad} using {@link VideoAggregatorPad#castFrom}.
         * @return A new instance of {@code VideoAggregatorPad} with the properties 
         *         that were set in the Build object.
         */
        public VideoAggregatorPad construct() {
            return VideoAggregatorPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoAggregatorPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setMaxLastBufferRepeat(long maxLastBufferRepeat) {
            names.add("max-last-buffer-repeat");
            values.add(org.gtk.gobject.Value.create(maxLastBufferRepeat));
            return this;
        }
        
        public Build setRepeatAfterEos(boolean repeatAfterEos) {
            names.add("repeat-after-eos");
            values.add(org.gtk.gobject.Value.create(repeatAfterEos));
            return this;
        }
        
        public Build setZorder(int zorder) {
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
}
