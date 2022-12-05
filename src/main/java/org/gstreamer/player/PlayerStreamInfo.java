package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base structure for information concerning a media stream. Depending on
 * the stream type, one can find more media-specific information in
 * {@link PlayerVideoInfo}, {@link PlayerAudioInfo}, {@link PlayerSubtitleInfo}.
 */
public class PlayerStreamInfo extends org.gtk.gobject.Object {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerStreamInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayerStreamInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerStreamInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlayerStreamInfo if its GType is a (or inherits from) "GstPlayerStreamInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayerStreamInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayerStreamInfo", a ClassCastException will be thrown.
     */
    public static PlayerStreamInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayerStreamInfo.getType())) {
            return new PlayerStreamInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayerStreamInfo");
        }
    }
    
    public @Nullable org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_stream_info_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.NONE);
    }
    
    /**
     * A string describing codec used in {@link PlayerStreamInfo}.
     * @return codec string or {@code null} on unknown.
     */
    public @Nullable java.lang.String getCodec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_stream_info_get_codec.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Function to get stream index from {@link PlayerStreamInfo} instance or -1 if
     * unknown.
     * @return the stream index of this stream.
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_player_stream_info_get_index.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Function to return human readable name for the stream type
     * of the given {@code info} (ex: "audio", "video", "subtitle")
     * @return a human readable name
     */
    public @NotNull java.lang.String getStreamType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_stream_info_get_stream_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @Nullable org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_stream_info_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_stream_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PlayerStreamInfo.Build} object constructs a {@link PlayerStreamInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlayerStreamInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayerStreamInfo} using {@link PlayerStreamInfo#castFrom}.
         * @return A new instance of {@code PlayerStreamInfo} with the properties 
         *         that were set in the Build object.
         */
        public PlayerStreamInfo construct() {
            return PlayerStreamInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlayerStreamInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_stream_info_get_caps = Interop.downcallHandle(
            "gst_player_stream_info_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_stream_info_get_codec = Interop.downcallHandle(
            "gst_player_stream_info_get_codec",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_stream_info_get_index = Interop.downcallHandle(
            "gst_player_stream_info_get_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_stream_info_get_stream_type = Interop.downcallHandle(
            "gst_player_stream_info_get_stream_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_stream_info_get_tags = Interop.downcallHandle(
            "gst_player_stream_info_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_player_stream_info_get_type = Interop.downcallHandle(
            "gst_player_stream_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
