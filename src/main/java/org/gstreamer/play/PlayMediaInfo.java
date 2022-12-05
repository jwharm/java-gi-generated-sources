package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure containing the media information of a URI.
 * @version 1.20
 */
public class PlayMediaInfo extends org.gtk.gobject.Object {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayMediaInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayMediaInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayMediaInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlayMediaInfo if its GType is a (or inherits from) "GstPlayMediaInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayMediaInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayMediaInfo", a ClassCastException will be thrown.
     */
    public static PlayMediaInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayMediaInfo.getType())) {
            return new PlayMediaInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayMediaInfo");
        }
    }
    
    public @NotNull org.gtk.glib.List getAudioStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_audio_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public @Nullable java.lang.String getContainerFormat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_container_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_media_info_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Function to get the image (or preview-image) stored in taglist.
     * Application can use {@code gst_sample_*_()} API's to get caps, buffer etc.
     * @return GstSample or {@code null}.
     */
    public @Nullable org.gstreamer.gst.Sample getImageSample() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_image_sample.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.NONE);
    }
    
    public int getNumberOfAudioStreams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_get_number_of_audio_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getNumberOfStreams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_get_number_of_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getNumberOfSubtitleStreams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_get_number_of_subtitle_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getNumberOfVideoStreams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_get_number_of_video_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gtk.glib.List getStreamList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_stream_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gtk.glib.List getSubtitleStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_subtitle_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public @Nullable org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull org.gtk.glib.List getVideoStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_media_info_get_video_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public boolean isLive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_is_live.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean isSeekable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_media_info_is_seekable.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_play_media_info_get_type.invokeExact();
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
         * A {@link PlayMediaInfo.Build} object constructs a {@link PlayMediaInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlayMediaInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayMediaInfo} using {@link PlayMediaInfo#castFrom}.
         * @return A new instance of {@code PlayMediaInfo} with the properties 
         *         that were set in the Build object.
         */
        public PlayMediaInfo construct() {
            return PlayMediaInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlayMediaInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_media_info_get_audio_streams = Interop.downcallHandle(
            "gst_play_media_info_get_audio_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_container_format = Interop.downcallHandle(
            "gst_play_media_info_get_container_format",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_duration = Interop.downcallHandle(
            "gst_play_media_info_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_image_sample = Interop.downcallHandle(
            "gst_play_media_info_get_image_sample",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_number_of_audio_streams = Interop.downcallHandle(
            "gst_play_media_info_get_number_of_audio_streams",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_number_of_streams = Interop.downcallHandle(
            "gst_play_media_info_get_number_of_streams",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_number_of_subtitle_streams = Interop.downcallHandle(
            "gst_play_media_info_get_number_of_subtitle_streams",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_number_of_video_streams = Interop.downcallHandle(
            "gst_play_media_info_get_number_of_video_streams",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_stream_list = Interop.downcallHandle(
            "gst_play_media_info_get_stream_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_subtitle_streams = Interop.downcallHandle(
            "gst_play_media_info_get_subtitle_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_tags = Interop.downcallHandle(
            "gst_play_media_info_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_title = Interop.downcallHandle(
            "gst_play_media_info_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_uri = Interop.downcallHandle(
            "gst_play_media_info_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_video_streams = Interop.downcallHandle(
            "gst_play_media_info_get_video_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_is_live = Interop.downcallHandle(
            "gst_play_media_info_is_live",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_is_seekable = Interop.downcallHandle(
            "gst_play_media_info_is_seekable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_media_info_get_type = Interop.downcallHandle(
            "gst_play_media_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
