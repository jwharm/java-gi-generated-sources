package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioClock} makes it easy for elements to implement a {@link org.gstreamer.gst.Clock}, they
 * simply need to provide a function that returns the current clock time.
 * <p>
 * This object is internally used to implement the clock in {@link AudioBaseSink}.
 */
public class AudioClock extends org.gstreamer.gst.SystemClock {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioClock";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.SystemClock.getMemoryLayout().withName("clock"),
            Interop.valueLayout.ADDRESS.withName("func"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("destroy_notify"),
            Interop.valueLayout.C_LONG.withName("last_time"),
            Interop.valueLayout.C_LONG.withName("time_offset"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioClock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioClock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioClock(input);
    
    private static MemoryAddress constructNew(java.lang.String name, org.gstreamer.audio.AudioClockGetTimeFunc func, org.gtk.glib.DestroyNotify destroyNotify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_audio_clock_new.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) func.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) destroyNotify.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new {@link AudioClock} instance. Whenever the clock time should be
     * calculated it will call {@code func} with {@code user_data}. When {@code func} returns
     * {@code GST_CLOCK_TIME_NONE}, the clock will return the last reported time.
     * @param name the name of the clock
     * @param func a function
     * @param destroyNotify {@link org.gtk.glib.DestroyNotify} for {@code user_data}
     */
    public AudioClock(java.lang.String name, org.gstreamer.audio.AudioClockGetTimeFunc func, org.gtk.glib.DestroyNotify destroyNotify) {
        super(constructNew(name, func, destroyNotify));
        this.takeOwnership();
    }
    
    /**
     * Adjust {@code time} with the internal offset of the audio clock.
     * @param time a {@link org.gstreamer.gst.ClockTime}
     * @return {@code time} adjusted with the internal offset.
     */
    public org.gstreamer.gst.ClockTime adjust(org.gstreamer.gst.ClockTime time) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_clock_adjust.invokeExact(
                    handle(),
                    time.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Report the time as returned by the {@link AudioClockGetTimeFunc} without applying
     * any offsets.
     * @return the time as reported by the time function of the audio clock
     */
    public org.gstreamer.gst.ClockTime getTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_clock_get_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Invalidate the clock function. Call this function when the provided
     * {@link AudioClockGetTimeFunc} cannot be called anymore, for example, when the
     * user_data becomes invalid.
     * <p>
     * After calling this function, {@code clock} will return the last returned time for
     * the rest of its lifetime.
     */
    public void invalidate() {
        try {
            DowncallHandles.gst_audio_clock_invalidate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inform {@code clock} that future calls to {@link AudioClockGetTimeFunc} will return values
     * starting from {@code time}. The clock will update an internal offset to make sure that
     * future calls to internal_time will return an increasing result as required by
     * the {@link org.gstreamer.gst.Clock} object.
     * @param time a {@link org.gstreamer.gst.ClockTime}
     */
    public void reset(org.gstreamer.gst.ClockTime time) {
        try {
            DowncallHandles.gst_audio_clock_reset.invokeExact(
                    handle(),
                    time.getValue().longValue());
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
            RESULT = (long) DowncallHandles.gst_audio_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioClock.Builder} object constructs a {@link AudioClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.SystemClock.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioClock}.
         * @return A new instance of {@code AudioClock} with the properties 
         *         that were set in the Builder object.
         */
        public AudioClock build() {
            return (AudioClock) org.gtk.gobject.GObject.newWithProperties(
                AudioClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_clock_new = Interop.downcallHandle(
                "gst_audio_clock_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_clock_adjust = Interop.downcallHandle(
                "gst_audio_clock_adjust",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_clock_get_time = Interop.downcallHandle(
                "gst_audio_clock_get_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_clock_invalidate = Interop.downcallHandle(
                "gst_audio_clock_invalidate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_clock_reset = Interop.downcallHandle(
                "gst_audio_clock_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_clock_get_type = Interop.downcallHandle(
                "gst_audio_clock_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_clock_get_type != null;
    }
}
