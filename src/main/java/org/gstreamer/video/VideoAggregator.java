package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * VideoAggregator can accept AYUV, ARGB and BGRA video streams. For each of the requested
 * sink pads it will compare the incoming geometry and framerate to define the
 * output parameters. Indeed output video frames will have the geometry of the
 * biggest incoming video stream and the framerate of the fastest incoming one.
 * <p>
 * VideoAggregator will do colorspace conversion.
 * <p>
 * Zorder for each input stream can be configured on the
 * {@link VideoAggregatorPad}.
 * @version 1.16
 */
public class VideoAggregator extends org.gstreamer.base.Aggregator {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.Aggregator.getMemoryLayout().withName("aggregator"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoAggregator proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAggregator(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VideoAggregator> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregator(input, ownership);
    
    /**
     * The returned {@link org.gstreamer.gst.TaskPool} is used internally for performing parallel
     * video format conversions/scaling/etc during the
     * {@link VideoAggregatorPadClass}::prepare_frame_start() process.
     * Subclasses can add their own operation to perform using the returned
     * {@link org.gstreamer.gst.TaskPool} during {@link VideoAggregatorClass}::aggregate_frames().
     * @return the {@link org.gstreamer.gst.TaskPool} that can be used by subclasses
     *     for performing concurrent operations
     */
    public org.gstreamer.gst.TaskPool getExecutionTaskPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_get_execution_task_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.TaskPool.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoAggregator.Builder} object constructs a {@link VideoAggregator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoAggregator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.Aggregator.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoAggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregator}.
         * @return A new instance of {@code VideoAggregator} with the properties 
         *         that were set in the Builder object.
         */
        public VideoAggregator build() {
            return (VideoAggregator) org.gtk.gobject.GObject.newWithProperties(
                VideoAggregator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_aggregator_get_execution_task_pool = Interop.downcallHandle(
            "gst_video_aggregator_get_execution_task_pool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_aggregator_get_type = Interop.downcallHandle(
            "gst_video_aggregator_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
