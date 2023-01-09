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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSink.getMemoryLayout().withName("element"),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoSink proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoSink(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoSink> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoSink(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @Deprecated
    public static void centerRect(org.gstreamer.video.VideoRectangle src, org.gstreamer.video.VideoRectangle dst, org.gstreamer.video.VideoRectangle result, boolean scaling) {
        try {
            DowncallHandles.gst_video_sink_center_rect.invokeExact(
                    src.handle(),
                    dst.handle(),
                    result.handle(),
                    Marshal.booleanToInteger.marshal(scaling, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VideoSink.Builder} object constructs a {@link VideoSink} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoSink.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseSink.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoSink}.
         * @return A new instance of {@code VideoSink} with the properties 
         *         that were set in the Builder object.
         */
        public VideoSink build() {
            return (VideoSink) org.gtk.gobject.GObject.newWithProperties(
                VideoSink.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to show video frames during preroll. If set to {@code false}, video
         * frames will only be rendered in PLAYING state.
         * @param showPrerollFrame The value for the {@code show-preroll-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowPrerollFrame(boolean showPrerollFrame) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_sink_get_type != null;
    }
}
