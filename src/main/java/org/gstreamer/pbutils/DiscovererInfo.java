package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure containing the information of a URI analyzed by {@link Discoverer}.
 */
public class DiscovererInfo extends org.gtk.gobject.Object {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DiscovererInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DiscovererInfo if its GType is a (or inherits from) "GstDiscovererInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DiscovererInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDiscovererInfo", a ClassCastException will be thrown.
     */
    public static DiscovererInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DiscovererInfo.getType())) {
            return new DiscovererInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDiscovererInfo");
        }
    }
    
    public @NotNull org.gstreamer.pbutils.DiscovererInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.DiscovererInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds all the {@link DiscovererAudioInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public @NotNull org.gtk.glib.List getAudioStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_audio_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds all the {@link DiscovererContainerInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public @NotNull org.gtk.glib.List getContainerStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_container_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_info_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    public boolean getLive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_live.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @Deprecated
    public @NotNull org.gstreamer.gst.Structure getMisc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_misc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the installer details for missing elements
     * @return An array of strings
     * containing information about how to install the various missing elements
     * for {@code info} to be usable. If you wish to use the strings after the life-time
     * of {@code info}, you will need to copy them.
     */
    public @NotNull PointerString getMissingElementsInstallerDetails() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_missing_elements_installer_details.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    public @NotNull org.gstreamer.pbutils.DiscovererResult getResult() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_result.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.pbutils.DiscovererResult.of(RESULT);
    }
    
    public boolean getSeekable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_seekable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.pbutils.DiscovererStreamInfo getStreamInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_stream_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.DiscovererStreamInfo(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gtk.glib.List getStreamList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_stream_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds the {@link DiscovererStreamInfo} contained in {@code info} that match the
     * given {@code streamtype}.
     * @param streamtype a {@link org.gtk.gobject.Type} derived from {@link DiscovererStreamInfo}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public @NotNull org.gtk.glib.List getStreams(@NotNull org.gtk.glib.Type streamtype) {
        java.util.Objects.requireNonNull(streamtype, "Parameter 'streamtype' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_streams.invokeExact(
                    handle(),
                    streamtype.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds all the {@link DiscovererSubtitleInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public @NotNull org.gtk.glib.List getSubtitleStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_subtitle_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    @Deprecated
    public @NotNull org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_toc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Toc(RESULT, Ownership.NONE);
    }
    
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Finds all the {@link DiscovererVideoInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public @NotNull org.gtk.glib.List getVideoStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_video_streams.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Serializes {@code info} to a {@link org.gtk.glib.Variant} that can be parsed again
     * through gst_discoverer_info_from_variant().
     * <p>
     * Note that any {@link org.gstreamer.gst.Toc} (s) that might have been discovered will not be serialized
     * for now.
     * @param flags A combination of {@link DiscovererSerializeFlags} to specify
     * what needs to be serialized.
     * @return A newly-allocated {@link org.gtk.glib.Variant} representing {@code info}.
     */
    public @NotNull org.gtk.glib.Variant toVariant(@NotNull org.gstreamer.pbutils.DiscovererSerializeFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_to_variant.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Parses a {@link org.gtk.glib.Variant} as produced by gst_discoverer_info_to_variant()
     * back to a {@link DiscovererInfo}.
     * @param variant A {@link org.gtk.glib.Variant} to deserialize into a {@link DiscovererInfo}.
     * @return A newly-allocated {@link DiscovererInfo}.
     */
    public static @NotNull org.gstreamer.pbutils.DiscovererInfo fromVariant(@NotNull org.gtk.glib.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_from_variant.invokeExact(
                    variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.DiscovererInfo(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DiscovererInfo.Build} object constructs a {@link DiscovererInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DiscovererInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererInfo} using {@link DiscovererInfo#castFrom}.
         * @return A new instance of {@code DiscovererInfo} with the properties 
         *         that were set in the Build object.
         */
        public DiscovererInfo construct() {
            return DiscovererInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DiscovererInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_discoverer_info_copy = Interop.downcallHandle(
            "gst_discoverer_info_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_audio_streams = Interop.downcallHandle(
            "gst_discoverer_info_get_audio_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_container_streams = Interop.downcallHandle(
            "gst_discoverer_info_get_container_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_duration = Interop.downcallHandle(
            "gst_discoverer_info_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_live = Interop.downcallHandle(
            "gst_discoverer_info_get_live",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_misc = Interop.downcallHandle(
            "gst_discoverer_info_get_misc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_missing_elements_installer_details = Interop.downcallHandle(
            "gst_discoverer_info_get_missing_elements_installer_details",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_result = Interop.downcallHandle(
            "gst_discoverer_info_get_result",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_seekable = Interop.downcallHandle(
            "gst_discoverer_info_get_seekable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_stream_info = Interop.downcallHandle(
            "gst_discoverer_info_get_stream_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_stream_list = Interop.downcallHandle(
            "gst_discoverer_info_get_stream_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_streams = Interop.downcallHandle(
            "gst_discoverer_info_get_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_subtitle_streams = Interop.downcallHandle(
            "gst_discoverer_info_get_subtitle_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_tags = Interop.downcallHandle(
            "gst_discoverer_info_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_toc = Interop.downcallHandle(
            "gst_discoverer_info_get_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_uri = Interop.downcallHandle(
            "gst_discoverer_info_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_video_streams = Interop.downcallHandle(
            "gst_discoverer_info_get_video_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_to_variant = Interop.downcallHandle(
            "gst_discoverer_info_to_variant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_get_type = Interop.downcallHandle(
            "gst_discoverer_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_discoverer_info_from_variant = Interop.downcallHandle(
            "gst_discoverer_info_from_variant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
