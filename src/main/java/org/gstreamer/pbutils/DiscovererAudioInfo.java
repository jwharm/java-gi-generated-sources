package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DiscovererStreamInfo} specific to audio streams.
 */
public class DiscovererAudioInfo extends org.gstreamer.pbutils.DiscovererStreamInfo {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererAudioInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DiscovererAudioInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DiscovererAudioInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DiscovererAudioInfo if its GType is a (or inherits from) "GstDiscovererAudioInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DiscovererAudioInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDiscovererAudioInfo", a ClassCastException will be thrown.
     */
    public static DiscovererAudioInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DiscovererAudioInfo.getType())) {
            return new DiscovererAudioInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDiscovererAudioInfo");
        }
    }
    
    public int getBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_audio_info_get_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public long getChannelMask() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_audio_info_get_channel_mask.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getChannels() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_audio_info_get_channels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_audio_info_get_depth.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull java.lang.String getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_audio_info_get_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public int getMaxBitrate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_audio_info_get_max_bitrate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getSampleRate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_audio_info_get_sample_rate.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_discoverer_audio_info_get_type.invokeExact();
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
         * A {@link DiscovererAudioInfo.Build} object constructs a {@link DiscovererAudioInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DiscovererAudioInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DiscovererAudioInfo} using {@link DiscovererAudioInfo#castFrom}.
         * @return A new instance of {@code DiscovererAudioInfo} with the properties 
         *         that were set in the Build object.
         */
        public DiscovererAudioInfo construct() {
            return DiscovererAudioInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DiscovererAudioInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_discoverer_audio_info_get_bitrate = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_bitrate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_channel_mask = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_channel_mask",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_channels = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_channels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_depth = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_depth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_language = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_max_bitrate = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_max_bitrate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_sample_rate = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_sample_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_discoverer_audio_info_get_type = Interop.downcallHandle(
            "gst_discoverer_audio_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
