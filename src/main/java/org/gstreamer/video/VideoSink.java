package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides useful functions and a base class for video sinks.
 * <p>
 * GstVideoSink will configure the default base sink to drop frames that
 * arrive later than 20ms as this is considered the default threshold for
 * observing out-of-sync frames.
 */
public class VideoSink extends org.gstreamer.base.BaseSink {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoSink";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseSink.getMemoryLayout().withName("element"),
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("height"),
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
     * Create a VideoSink proxy instance for the provided memory address.
     * <p>
     * Because VideoSink is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoSink(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VideoSink if its GType is a (or inherits from) "GstVideoSink".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VideoSink} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVideoSink", a ClassCastException will be thrown.
     */
    public static VideoSink castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VideoSink.getType())) {
            return new VideoSink(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVideoSink");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @Deprecated
    public static void centerRect(@NotNull org.gstreamer.video.VideoRectangle src, @NotNull org.gstreamer.video.VideoRectangle dst, @NotNull org.gstreamer.video.VideoRectangle result, boolean scaling) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(dst, "Parameter 'dst' must not be null");
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        try {
            DowncallHandles.gst_video_sink_center_rect.invokeExact(
                    src.handle(),
                    dst.handle(),
                    result.handle(),
                    scaling ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.BaseSink.Build {
        
         /**
         * A {@link VideoSink.Build} object constructs a {@link VideoSink} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VideoSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoSink} using {@link VideoSink#castFrom}.
         * @return A new instance of {@code VideoSink} with the properties 
         *         that were set in the Build object.
         */
        public VideoSink construct() {
            return VideoSink.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VideoSink.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether to show video frames during preroll. If set to {@code false}, video
         * frames will only be rendered in PLAYING state.
         * @param showPrerollFrame The value for the {@code show-preroll-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowPrerollFrame(boolean showPrerollFrame) {
            names.add("show-preroll-frame");
            values.add(org.gtk.gobject.Value.create(showPrerollFrame));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_sink_get_type = Interop.downcallHandle(
            "gst_video_sink_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_video_sink_center_rect = Interop.downcallHandle(
            "gst_video_sink_center_rect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
