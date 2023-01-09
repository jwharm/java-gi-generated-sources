package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure containing the information of a URI analyzed by {@link Discoverer}.
 */
public class DiscovererInfo extends org.gtk.gobject.GObject {
    
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
     */
    protected DiscovererInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererInfo(input);
    
    public org.gstreamer.pbutils.DiscovererInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.pbutils.DiscovererInfo) Interop.register(RESULT, org.gstreamer.pbutils.DiscovererInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds all the {@link DiscovererAudioInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public org.gtk.glib.List getAudioStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_audio_streams.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds all the {@link DiscovererContainerInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public org.gtk.glib.List getContainerStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_container_streams.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_info_get_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    public boolean getLive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_live.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    @Deprecated
    public org.gstreamer.gst.Structure getMisc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_misc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the installer details for missing elements
     * @return An array of strings
     * containing information about how to install the various missing elements
     * for {@code info} to be usable. If you wish to use the strings after the life-time
     * of {@code info}, you will need to copy them.
     */
    public PointerString getMissingElementsInstallerDetails() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_missing_elements_installer_details.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    public org.gstreamer.pbutils.DiscovererResult getResult() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_result.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.pbutils.DiscovererResult.of(RESULT);
    }
    
    public boolean getSeekable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_info_get_seekable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.pbutils.DiscovererStreamInfo getStreamInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_stream_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.pbutils.DiscovererStreamInfo) Interop.register(RESULT, org.gstreamer.pbutils.DiscovererStreamInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gtk.glib.List getStreamList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_stream_list.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds the {@link DiscovererStreamInfo} contained in {@code info} that match the
     * given {@code streamtype}.
     * @param streamtype a {@link org.gtk.glib.Type} derived from {@link DiscovererStreamInfo}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public org.gtk.glib.List getStreams(org.gtk.glib.Type streamtype) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_streams.invokeExact(
                    handle(),
                    streamtype.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds all the {@link DiscovererSubtitleInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public org.gtk.glib.List getSubtitleStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_subtitle_streams.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    @Deprecated
    public org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_tags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    }
    
    public org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_toc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Toc.fromAddress.marshal(RESULT, null);
    }
    
    public java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Finds all the {@link DiscovererVideoInfo} contained in {@code info}
     * @return A {@link org.gtk.glib.List} of
     * matching {@link DiscovererStreamInfo}. The caller should free it with
     * gst_discoverer_stream_info_list_free().
     */
    public org.gtk.glib.List getVideoStreams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_get_video_streams.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public org.gtk.glib.Variant toVariant(org.gstreamer.pbutils.DiscovererSerializeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_to_variant.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static org.gstreamer.pbutils.DiscovererInfo fromVariant(org.gtk.glib.Variant variant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_info_from_variant.invokeExact(variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.pbutils.DiscovererInfo) Interop.register(RESULT, org.gstreamer.pbutils.DiscovererInfo.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link DiscovererInfo.Builder} object constructs a {@link DiscovererInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DiscovererInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DiscovererInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererInfo}.
         * @return A new instance of {@code DiscovererInfo} with the properties 
         *         that were set in the Builder object.
         */
        public DiscovererInfo build() {
            return (DiscovererInfo) org.gtk.gobject.GObject.newWithProperties(
                DiscovererInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_discoverer_info_get_type != null;
    }
}
