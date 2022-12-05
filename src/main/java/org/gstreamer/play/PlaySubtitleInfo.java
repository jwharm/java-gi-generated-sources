package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PlayStreamInfo} specific to subtitle streams.
 * @version 1.20
 */
public class PlaySubtitleInfo extends org.gstreamer.play.PlayStreamInfo {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlaySubtitleInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlaySubtitleInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlaySubtitleInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlaySubtitleInfo if its GType is a (or inherits from) "GstPlaySubtitleInfo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlaySubtitleInfo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlaySubtitleInfo", a ClassCastException will be thrown.
     */
    public static PlaySubtitleInfo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlaySubtitleInfo.getType())) {
            return new PlaySubtitleInfo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlaySubtitleInfo");
        }
    }
    
    public @Nullable java.lang.String getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_subtitle_info_get_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_subtitle_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.play.PlayStreamInfo.Build {
        
         /**
         * A {@link PlaySubtitleInfo.Build} object constructs a {@link PlaySubtitleInfo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlaySubtitleInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlaySubtitleInfo} using {@link PlaySubtitleInfo#castFrom}.
         * @return A new instance of {@code PlaySubtitleInfo} with the properties 
         *         that were set in the Build object.
         */
        public PlaySubtitleInfo construct() {
            return PlaySubtitleInfo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlaySubtitleInfo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_subtitle_info_get_language = Interop.downcallHandle(
            "gst_play_subtitle_info_get_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_subtitle_info_get_type = Interop.downcallHandle(
            "gst_play_subtitle_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
