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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.SystemClock.getMemoryLayout().withName("clock"),
        Interop.valueLayout.ADDRESS.withName("func"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        Interop.valueLayout.ADDRESS.withName("destroy_notify"),
        Interop.valueLayout.C_LONG.withName("last_time"),
        Interop.valueLayout.C_LONG.withName("time_offset"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a AudioClock proxy instance for the provided memory address.
     * <p>
     * Because AudioClock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioClock(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioClock if its GType is a (or inherits from) "GstAudioClock".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioClock} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioClock", a ClassCastException will be thrown.
     */
    public static AudioClock castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioClock.getType())) {
            return new AudioClock(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioClock");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull org.gstreamer.audio.AudioClockGetTimeFunc func) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_clock_new.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstAudio.Callbacks.class, "cbAudioClockGetTimeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link AudioClock} instance. Whenever the clock time should be
     * calculated it will call {@code func} with {@code user_data}. When {@code func} returns
     * {@code GST_CLOCK_TIME_NONE}, the clock will return the last reported time.
     * @param name the name of the clock
     * @param func a function
     */
    public AudioClock(@NotNull java.lang.String name, @NotNull org.gstreamer.audio.AudioClockGetTimeFunc func) {
        super(constructNew(name, func), Ownership.FULL);
    }
    
    /**
     * Adjust {@code time} with the internal offset of the audio clock.
     * @param time a {@link org.gstreamer.gst.ClockTime}
     * @return {@code time} adjusted with the internal offset.
     */
    public @NotNull org.gstreamer.gst.ClockTime adjust(@NotNull org.gstreamer.gst.ClockTime time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
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
    public @NotNull org.gstreamer.gst.ClockTime getTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_clock_get_time.invokeExact(
                    handle());
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
            DowncallHandles.gst_audio_clock_invalidate.invokeExact(
                    handle());
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
    public void reset(@NotNull org.gstreamer.gst.ClockTime time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.SystemClock.Build {
        
         /**
         * A {@link AudioClock.Build} object constructs a {@link AudioClock} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioClock} using {@link AudioClock#castFrom}.
         * @return A new instance of {@code AudioClock} with the properties 
         *         that were set in the Build object.
         */
        public AudioClock construct() {
            return AudioClock.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioClock.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
