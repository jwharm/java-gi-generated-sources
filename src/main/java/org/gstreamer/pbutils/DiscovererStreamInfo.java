package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base structure for information concerning a media stream. Depending on the
 * stream type, one can find more media-specific information in
 * {@link DiscovererAudioInfo}, {@link DiscovererVideoInfo}, and
 * {@link DiscovererContainerInfo}.
 * <p>
 * The {@link DiscovererStreamInfo} represents the topology of the stream. Siblings
 * can be iterated over with gst_discoverer_stream_info_get_next() and
 * gst_discoverer_stream_info_get_previous(). Children (sub-streams) of a
 * stream can be accessed using the {@link DiscovererContainerInfo} API.
 * <p>
 * As a simple example, if you run {@link Discoverer} on an AVI file with one audio
 * and one video stream, you will get a {@link DiscovererContainerInfo}
 * corresponding to the AVI container, which in turn will have a
 * {@link DiscovererAudioInfo} sub-stream and a {@link DiscovererVideoInfo} sub-stream
 * for the audio and video streams respectively.
 */
public class DiscovererStreamInfo extends org.gtk.gobject.Object {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererStreamInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DiscovererStreamInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererStreamInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DiscovererStreamInfo if its GType is a (or inherits from) "GstDiscovererStreamInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DiscovererStreamInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDiscovererStreamInfo", a ClassCastException will be thrown.
     */
    public static DiscovererStreamInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DiscovererStreamInfo.getType())) {
            return new DiscovererStreamInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDiscovererStreamInfo");
        }
    }
    
    public @NotNull org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    @Deprecated
    public @NotNull org.gstreamer.gst.Structure getMisc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_misc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.pbutils.DiscovererStreamInfo getNext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.DiscovererStreamInfo(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.pbutils.DiscovererStreamInfo getPrevious() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_previous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.DiscovererStreamInfo(RESULT, Ownership.FULL);
    }
    
    public @NotNull java.lang.String getStreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_stream_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public int getStreamNumber() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_stream_info_get_stream_number.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull java.lang.String getStreamTypeNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_stream_type_nick.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_toc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Toc(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_stream_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Decrements the reference count of all contained {@link DiscovererStreamInfo}
     * and fress the {@link org.gtk.glib.List}.
     * @param infos a {@link org.gtk.glib.List} of {@link DiscovererStreamInfo}
     */
    public static void listFree(@NotNull org.gtk.glib.List infos) {
        java.util.Objects.requireNonNull(infos, "Parameter 'infos' must not be null");
        try {
            DowncallHandles.gst_discoverer_stream_info_list_free.invokeExact(
                    infos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DiscovererStreamInfo.Build} object constructs a {@link DiscovererStreamInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DiscovererStreamInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererStreamInfo} using {@link DiscovererStreamInfo#castFrom}.
         * @return A new instance of {@code DiscovererStreamInfo} with the properties 
         *         that were set in the Build object.
         */
        public DiscovererStreamInfo construct() {
            return DiscovererStreamInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DiscovererStreamInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_discoverer_stream_info_get_caps = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_misc = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_misc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_next = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_next",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_previous = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_previous",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_stream_id = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_stream_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_stream_number = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_stream_number",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_stream_type_nick = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_stream_type_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_tags = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_toc = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_get_type = Interop.downcallHandle(
            "gst_discoverer_stream_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_discoverer_stream_info_list_free = Interop.downcallHandle(
            "gst_discoverer_stream_info_list_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
