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
public class DiscovererStreamInfo extends org.gtk.gobject.GObject {
    
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
    protected DiscovererStreamInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DiscovererStreamInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DiscovererStreamInfo(input, ownership);
    
    public org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    @Deprecated
    public org.gstreamer.gst.Structure getMisc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_misc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public org.gstreamer.pbutils.DiscovererStreamInfo getNext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.pbutils.DiscovererStreamInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.pbutils.DiscovererStreamInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.pbutils.DiscovererStreamInfo getPrevious() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_previous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.pbutils.DiscovererStreamInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.pbutils.DiscovererStreamInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public java.lang.String getStreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_stream_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    
    public java.lang.String getStreamTypeNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_stream_type_nick.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_stream_info_get_toc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Toc.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static void listFree(org.gtk.glib.List infos) {
        try {
            DowncallHandles.gst_discoverer_stream_info_list_free.invokeExact(
                    infos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DiscovererStreamInfo.Builder} object constructs a {@link DiscovererStreamInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DiscovererStreamInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DiscovererStreamInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererStreamInfo}.
         * @return A new instance of {@code DiscovererStreamInfo} with the properties 
         *         that were set in the Builder object.
         */
        public DiscovererStreamInfo build() {
            return (DiscovererStreamInfo) org.gtk.gobject.GObject.newWithProperties(
                DiscovererStreamInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
