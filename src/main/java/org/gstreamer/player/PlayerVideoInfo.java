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
     */
    protected PlayerVideoInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerVideoInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayerVideoInfo(input);
    
    public int getBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_bitrate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public void getFramerate(Out<Integer> fpsN, Out<Integer> fpsD) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment fpsNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment fpsDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
    }
    
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getMaxBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_max_bitrate.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment parNPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment parDPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
    }
    
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_video_info_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_video_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PlayerVideoInfo.Builder} object constructs a {@link PlayerVideoInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PlayerVideoInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.player.PlayerStreamInfo.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PlayerVideoInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayerVideoInfo}.
         * @return A new instance of {@code PlayerVideoInfo} with the properties 
         *         that were set in the Builder object.
         */
        public PlayerVideoInfo build() {
            return (PlayerVideoInfo) org.gtk.gobject.GObject.newWithProperties(
                PlayerVideoInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_player_video_info_get_type != null;
    }
}
