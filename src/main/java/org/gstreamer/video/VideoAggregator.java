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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.Aggregator.getMemoryLayout().withName("aggregator"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a VideoAggregator proxy instance for the provided memory address.
     * <p>
     * Because VideoAggregator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAggregator(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoAggregator if its GType is a (or inherits from) "GstVideoAggregator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoAggregator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoAggregator", a ClassCastException will be thrown.
     */
    public static VideoAggregator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoAggregator.getType())) {
            return new VideoAggregator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoAggregator");
        }
    }
    
    /**
     * The returned {@link org.gstreamer.gst.TaskPool} is used internally for performing parallel
     * video format conversions/scaling/etc during the
     * {@link VideoAggregatorPadClass}::prepare_frame_start() process.
     * Subclasses can add their own operation to perform using the returned
     * {@link org.gstreamer.gst.TaskPool} during {@link VideoAggregatorClass}::aggregate_frames().
     * @return the {@link org.gstreamer.gst.TaskPool} that can be used by subclasses
     *     for performing concurrent operations
     */
    public @NotNull org.gstreamer.gst.TaskPool getExecutionTaskPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_aggregator_get_execution_task_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TaskPool(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.Aggregator.Build {
        
         /**
         * A {@link VideoAggregator.Build} object constructs a {@link VideoAggregator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoAggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoAggregator} using {@link VideoAggregator#castFrom}.
         * @return A new instance of {@code VideoAggregator} with the properties 
         *         that were set in the Build object.
         */
        public VideoAggregator construct() {
            return VideoAggregator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoAggregator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
