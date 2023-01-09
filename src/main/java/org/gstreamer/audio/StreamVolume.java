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
 * the "volume" {@link org.gtk.gobject.GObject} property can be used or the helper functions gst_stream_volume_set_volume()
 * and gst_stream_volume_get_volume(). This volume is always a linear factor, i.e. 0.0 is muted
 * 1.0 is 100%. For showing the volume in a GUI it might make sense to convert it to
 * a different format by using gst_stream_volume_convert_volume(). Volume sliders should usually
 * use a cubic volume.
 * <p>
 * Separate from the volume the stream can also be muted by the "mute" {@link org.gtk.gobject.GObject} property or
 * gst_stream_volume_set_mute() and gst_stream_volume_get_mute().
 * <p>
 * Elements that provide some kind of stream volume should implement the "volume" and
 * "mute" {@link org.gtk.gobject.GObject} properties and handle setting and getting of them properly.
 * The volume property is defined to be a linear volume factor.
 */
public interface StreamVolume extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StreamVolumeImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StreamVolumeImpl(input);
    
    default boolean getMute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_volume_get_mute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    default double getVolume(org.gstreamer.audio.StreamVolumeFormat format) {
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
                    Marshal.booleanToInteger.marshal(mute, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void setVolume(org.gstreamer.audio.StreamVolumeFormat format, double val) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_stream_volume_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static double convertVolume(org.gstreamer.audio.StreamVolumeFormat from, org.gstreamer.audio.StreamVolumeFormat to, double val) {
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
    
    /**
     * The StreamVolumeImpl type represents a native instance of the StreamVolume interface.
     */
    class StreamVolumeImpl extends org.gtk.gobject.GObject implements StreamVolume {
        
        static {
            GstAudio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of StreamVolume for the provided memory address.
         * @param address the memory address of the instance
         */
        public StreamVolumeImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_stream_volume_get_type != null;
    }
}
