package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface is implemented by elements that provide a stream volume. Examples for
 * such elements are {@code volume} and {@code playbin}.
 * <p>
 * Applications can use this interface to get or set the current stream volume. For this
 * the "volume" {@link org.gtk.gobject.Object} property can be used or the helper functions gst_stream_volume_set_volume()
 * and gst_stream_volume_get_volume(). This volume is always a linear factor, i.e. 0.0 is muted
 * 1.0 is 100%. For showing the volume in a GUI it might make sense to convert it to
 * a different format by using gst_stream_volume_convert_volume(). Volume sliders should usually
 * use a cubic volume.
 * <p>
 * Separate from the volume the stream can also be muted by the "mute" {@link org.gtk.gobject.Object} property or
 * gst_stream_volume_set_mute() and gst_stream_volume_get_mute().
 * <p>
 * Elements that provide some kind of stream volume should implement the "volume" and
 * "mute" {@link org.gtk.gobject.Object} properties and handle setting and getting of them properly.
 * The volume property is defined to be a linear volume factor.
 */
public interface StreamVolume extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to StreamVolume if its GType is a (or inherits from) "GstStreamVolume".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StreamVolume} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstStreamVolume", a ClassCastException will be thrown.
     */
    public static StreamVolume castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), StreamVolume.getType())) {
            return new StreamVolumeImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstStreamVolume");
        }
    }
    
    default boolean getMute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_volume_get_mute.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    default double getVolume(@NotNull org.gstreamer.audio.StreamVolumeFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_stream_volume_get_volume.invokeExact(
                    handle(),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    default void setMute(boolean mute) {
        try {
            DowncallHandles.gst_stream_volume_set_mute.invokeExact(
                    handle(),
                    mute ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void setVolume(@NotNull org.gstreamer.audio.StreamVolumeFormat format, double val) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_stream_volume_set_volume.invokeExact(
                    handle(),
                    format.getValue(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_stream_volume_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static double convertVolume(@NotNull org.gstreamer.audio.StreamVolumeFormat from, @NotNull org.gstreamer.audio.StreamVolumeFormat to, double val) {
        java.util.Objects.requireNonNull(from, "Parameter 'from' must not be null");
        java.util.Objects.requireNonNull(to, "Parameter 'to' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_stream_volume_convert_volume.invokeExact(
                    from.getValue(),
                    to.getValue(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_get_mute = Interop.downcallHandle(
            "gst_stream_volume_get_mute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_get_volume = Interop.downcallHandle(
            "gst_stream_volume_get_volume",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_set_mute = Interop.downcallHandle(
            "gst_stream_volume_set_mute",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_set_volume = Interop.downcallHandle(
            "gst_stream_volume_set_volume",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_get_type = Interop.downcallHandle(
            "gst_stream_volume_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_stream_volume_convert_volume = Interop.downcallHandle(
            "gst_stream_volume_convert_volume",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
    }
    
    class StreamVolumeImpl extends org.gtk.gobject.Object implements StreamVolume {
        
        static {
            GstAudio.javagi$ensureInitialized();
        }
        
        public StreamVolumeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
