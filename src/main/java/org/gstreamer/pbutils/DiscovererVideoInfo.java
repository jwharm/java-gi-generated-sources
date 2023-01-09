package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DiscovererStreamInfo} specific to video streams (this includes images).
 */
public class DiscovererVideoInfo extends org.gstreamer.pbutils.DiscovererStreamInfo {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererVideoInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DiscovererVideoInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DiscovererVideoInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererVideoInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererVideoInfo(input);
    
    public int getBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_bitrate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_depth.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFramerateDenom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_framerate_denom.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFramerateNum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_framerate_num.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getMaxBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_max_bitrate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getParDenom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_par_denom.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getParNum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_par_num.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public boolean isImage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_is_image.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean isInterlaced() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_is_interlaced.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_video_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DiscovererVideoInfo.Builder} object constructs a {@link DiscovererVideoInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DiscovererVideoInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.pbutils.DiscovererStreamInfo.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DiscovererVideoInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererVideoInfo}.
         * @return A new instance of {@code DiscovererVideoInfo} with the properties 
         *         that were set in the Builder object.
         */
        public DiscovererVideoInfo build() {
            return (DiscovererVideoInfo) org.gtk.gobject.GObject.newWithProperties(
                DiscovererVideoInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_discoverer_video_info_get_bitrate = Interop.downcallHandle(
                "gst_discoverer_video_info_get_bitrate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_depth = Interop.downcallHandle(
                "gst_discoverer_video_info_get_depth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_framerate_denom = Interop.downcallHandle(
                "gst_discoverer_video_info_get_framerate_denom",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_framerate_num = Interop.downcallHandle(
                "gst_discoverer_video_info_get_framerate_num",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_height = Interop.downcallHandle(
                "gst_discoverer_video_info_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_max_bitrate = Interop.downcallHandle(
                "gst_discoverer_video_info_get_max_bitrate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_par_denom = Interop.downcallHandle(
                "gst_discoverer_video_info_get_par_denom",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_par_num = Interop.downcallHandle(
                "gst_discoverer_video_info_get_par_num",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_width = Interop.downcallHandle(
                "gst_discoverer_video_info_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_is_image = Interop.downcallHandle(
                "gst_discoverer_video_info_is_image",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_is_interlaced = Interop.downcallHandle(
                "gst_discoverer_video_info_is_interlaced",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_video_info_get_type = Interop.downcallHandle(
                "gst_discoverer_video_info_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_discoverer_video_info_get_type != null;
    }
}
