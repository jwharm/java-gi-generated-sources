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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererVideoInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DiscovererVideoInfo if its GType is a (or inherits from) "GstDiscovererVideoInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DiscovererVideoInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDiscovererVideoInfo", a ClassCastException will be thrown.
     */
    public static DiscovererVideoInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DiscovererVideoInfo.getType())) {
            return new DiscovererVideoInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDiscovererVideoInfo");
        }
    }
    
    public int getBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_depth.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFramerateDenom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_framerate_denom.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFramerateNum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_framerate_num.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getMaxBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_max_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getParDenom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_par_denom.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getParNum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_par_num.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public boolean isImage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_is_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean isInterlaced() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_video_info_is_interlaced.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_video_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.pbutils.DiscovererStreamInfo.Build {
        
         /**
         * A {@link DiscovererVideoInfo.Build} object constructs a {@link DiscovererVideoInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DiscovererVideoInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererVideoInfo} using {@link DiscovererVideoInfo#castFrom}.
         * @return A new instance of {@code DiscovererVideoInfo} with the properties 
         *         that were set in the Build object.
         */
        public DiscovererVideoInfo construct() {
            return DiscovererVideoInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DiscovererVideoInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
