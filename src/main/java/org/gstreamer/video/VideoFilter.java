package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides useful functions and a base class for video filters.
 * <p>
 * The videofilter will by default enable QoS on the parent GstBaseTransform
 * to implement frame dropping.
 */
public class VideoFilter extends org.gstreamer.base.BaseTransform {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFilter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransform.getMemoryLayout().withName("element"),
            Interop.valueLayout.C_INT.withName("negotiated"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VideoFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoFilter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoFilter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoFilter(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VideoFilter.Builder} object constructs a {@link VideoFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VideoFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseTransform.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VideoFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VideoFilter}.
         * @return A new instance of {@code VideoFilter} with the properties 
         *         that were set in the Builder object.
         */
        public VideoFilter build() {
            return (VideoFilter) org.gtk.gobject.GObject.newWithProperties(
                VideoFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_filter_get_type = Interop.downcallHandle(
                "gst_video_filter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_video_filter_get_type != null;
    }
}
