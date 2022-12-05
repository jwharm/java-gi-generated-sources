package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PlayerStreamInfo} specific to video streams.
 */
public class PlayerVideoInfo extends org.gstreamer.player.PlayerStreamInfo {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerVideoInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayerVideoInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerVideoInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlayerVideoInfo if its GType is a (or inherits from) "GstPlayerVideoInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayerVideoInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayerVideoInfo", a ClassCastException will be thrown.
     */
    public static PlayerVideoInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayerVideoInfo.getType())) {
            return new PlayerVideoInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayerVideoInfo");
        }
    }
    
    public int getBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public void getFramerate(Out<Integer> fpsN, Out<Integer> fpsD) {
        java.util.Objects.requireNonNull(fpsN, "Parameter 'fpsN' must not be null");
        MemorySegment fpsNPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(fpsD, "Parameter 'fpsD' must not be null");
        MemorySegment fpsDPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_player_video_info_get_framerate.invokeExact(
                    handle(),
                    (Addressable) fpsNPOINTER.address(),
                    (Addressable) fpsDPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        fpsN.set(fpsNPOINTER.get(Interop.valueLayout.C_INT, 0));
        fpsD.set(fpsDPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getMaxBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_max_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the pixel aspect ratio in {@code par_n} and {@code par_d}
     * @param parN numerator
     * @param parD denominator
     */
    public void getPixelAspectRatio(Out<Integer> parN, Out<Integer> parD) {
        java.util.Objects.requireNonNull(parN, "Parameter 'parN' must not be null");
        MemorySegment parNPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(parD, "Parameter 'parD' must not be null");
        MemorySegment parDPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_player_video_info_get_pixel_aspect_ratio.invokeExact(
                    handle(),
                    (Addressable) parNPOINTER.address(),
                    (Addressable) parDPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        parN.set(parNPOINTER.get(Interop.valueLayout.C_INT, 0));
        parD.set(parDPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_video_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.player.PlayerStreamInfo.Build {
        
         /**
         * A {@link PlayerVideoInfo.Build} object constructs a {@link PlayerVideoInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlayerVideoInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayerVideoInfo} using {@link PlayerVideoInfo#castFrom}.
         * @return A new instance of {@code PlayerVideoInfo} with the properties 
         *         that were set in the Build object.
         */
        public PlayerVideoInfo construct() {
            return PlayerVideoInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlayerVideoInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_video_info_get_bitrate = Interop.downcallHandle(
            "gst_player_video_info_get_bitrate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_framerate = Interop.downcallHandle(
            "gst_player_video_info_get_framerate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_height = Interop.downcallHandle(
            "gst_player_video_info_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_max_bitrate = Interop.downcallHandle(
            "gst_player_video_info_get_max_bitrate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_pixel_aspect_ratio = Interop.downcallHandle(
            "gst_player_video_info_get_pixel_aspect_ratio",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_width = Interop.downcallHandle(
            "gst_player_video_info_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_video_info_get_type = Interop.downcallHandle(
            "gst_player_video_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
