package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This class is similar to GstAdapter, but it is made to work with
 * non-interleaved (planar) audio buffers. Before using, an audio format
 * must be configured with gst_planar_audio_adapter_configure()
 */
public class PlanarAudioAdapter extends org.gtk.gobject.Object {
    
    static {
        GstBadAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlanarAudioAdapter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlanarAudioAdapter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlanarAudioAdapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlanarAudioAdapter if its GType is a (or inherits from) "GstPlanarAudioAdapter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlanarAudioAdapter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlanarAudioAdapter", a ClassCastException will be thrown.
     */
    public static PlanarAudioAdapter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlanarAudioAdapter.getType())) {
            return new PlanarAudioAdapter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlanarAudioAdapter");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_planar_audio_adapter_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link PlanarAudioAdapter}. Free with g_object_unref().
     */
    public PlanarAudioAdapter() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the maximum amount of samples available, that is it returns the maximum
     * value that can be supplied to gst_planar_audio_adapter_get_buffer() without
     * that function returning {@code null}.
     * @return number of samples available in {@code adapter}
     */
    public long available() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_available.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes all buffers from {@code adapter}.
     */
    public void clear() {
        try {
            DowncallHandles.gst_planar_audio_adapter_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up the {@code adapter} to handle audio data of the specified audio format.
     * Note that this will internally clear the adapter and re-initialize it.
     * @param info a {@link org.gstreamer.audio.AudioInfo} describing the format of the audio data
     */
    public void configure(@NotNull org.gstreamer.audio.AudioInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.gst_planar_audio_adapter_configure.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public long distanceFromDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_distance_from_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the DTS that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_CLOCK_TIME_NONE.
     * @return The DTS at the last discont or GST_CLOCK_TIME_NONE.
     */
    public @NotNull org.gstreamer.gst.ClockTime dtsAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_dts_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Flushes the first {@code to_flush} samples in the {@code adapter}. The caller must ensure
     * that at least this many samples are available.
     * @param toFlush the number of samples to flush
     */
    public void flush(long toFlush) {
        try {
            DowncallHandles.gst_planar_audio_adapter_flush.invokeExact(
                    handle(),
                    toFlush);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nsamples} of the {@code adapter}, but
     * does not flush them from the adapter.
     * Use gst_planar_audio_adapter_take_buffer() for flushing at the same time.
     * <p>
     * The map {@code flags} can be used to give an optimization hint to this function.
     * When the requested buffer is meant to be mapped only for reading, it might
     * be possible to avoid copying memory in some cases.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nsamples the number of samples to get
     * @param flags hint the intended use of the returned buffer
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nsamples} of the adapter, or {@code null} if {@code nsamples} samples are not
     *     available. gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer getBuffer(long nsamples, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_planar_audio_adapter_get_buffer.invokeExact(
                    handle(),
                    nsamples,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the offset that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_BUFFER_OFFSET_NONE.
     * @return The offset at the last discont or GST_BUFFER_OFFSET_NONE.
     */
    public long offsetAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_offset_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the dts that was before the current sample in the adapter. When
     * {@code distance} is given, the amount of bytes between the dts and the current
     * position is returned.
     * <p>
     * The dts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that
     * before the first sample with a dts is removed from the adapter, the dts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen dts.
     */
    public @NotNull org.gstreamer.gst.ClockTime prevDts(Out<Long> distance) {
        java.util.Objects.requireNonNull(distance, "Parameter 'distance' must not be null");
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_prev_dts.invokeExact(
                    handle(),
                    (Addressable) distancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the offset that was before the current sample in the adapter. When
     * {@code distance} is given, the amount of samples between the offset and the current
     * position is returned.
     * <p>
     * The offset is reset to GST_BUFFER_OFFSET_NONE and the distance is set to 0
     * when the adapter is first created or when it is cleared. This also means that
     * before the first sample with an offset is removed from the adapter, the
     * offset and distance returned are GST_BUFFER_OFFSET_NONE and 0 respectively.
     * @param distance pointer to a location for distance, or {@code null}
     * @return The previous seen offset.
     */
    public long prevOffset(Out<Long> distance) {
        java.util.Objects.requireNonNull(distance, "Parameter 'distance' must not be null");
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_prev_offset.invokeExact(
                    handle(),
                    (Addressable) distancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Get the pts that was before the current sample in the adapter. When
     * {@code distance} is given, the amount of samples between the pts and the current
     * position is returned.
     * <p>
     * The pts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that before
     * the first sample with a pts is removed from the adapter, the pts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen pts.
     */
    public @NotNull org.gstreamer.gst.ClockTime prevPts(Out<Long> distance) {
        java.util.Objects.requireNonNull(distance, "Parameter 'distance' must not be null");
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_prev_pts.invokeExact(
                    handle(),
                    (Addressable) distancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the PTS that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_CLOCK_TIME_NONE.
     * @return The PTS at the last discont or GST_CLOCK_TIME_NONE.
     */
    public @NotNull org.gstreamer.gst.ClockTime ptsAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_pts_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Adds the data from {@code buf} to the data stored inside {@code adapter} and takes
     * ownership of the buffer.
     * @param buf a {@link org.gstreamer.gst.Buffer} to queue in the adapter
     */
    public void push(@NotNull org.gstreamer.gst.Buffer buf) {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        try {
            DowncallHandles.gst_planar_audio_adapter_push.invokeExact(
                    handle(),
                    buf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.yieldOwnership();
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nsamples} bytes of the
     * {@code adapter}. The returned bytes will be flushed from the adapter.
     * <p>
     * See gst_planar_audio_adapter_get_buffer() for more details.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nsamples the number of samples to take
     * @param flags hint the intended use of the returned buffer
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nsamples} of the adapter, or {@code null} if {@code nsamples} samples are not
     *     available. gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer takeBuffer(long nsamples, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_planar_audio_adapter_take_buffer.invokeExact(
                    handle(),
                    nsamples,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_planar_audio_adapter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PlanarAudioAdapter.Build} object constructs a {@link PlanarAudioAdapter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlanarAudioAdapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlanarAudioAdapter} using {@link PlanarAudioAdapter#castFrom}.
         * @return A new instance of {@code PlanarAudioAdapter} with the properties 
         *         that were set in the Build object.
         */
        public PlanarAudioAdapter construct() {
            return PlanarAudioAdapter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlanarAudioAdapter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_planar_audio_adapter_new = Interop.downcallHandle(
            "gst_planar_audio_adapter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_available = Interop.downcallHandle(
            "gst_planar_audio_adapter_available",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_clear = Interop.downcallHandle(
            "gst_planar_audio_adapter_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_configure = Interop.downcallHandle(
            "gst_planar_audio_adapter_configure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_distance_from_discont = Interop.downcallHandle(
            "gst_planar_audio_adapter_distance_from_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_dts_at_discont = Interop.downcallHandle(
            "gst_planar_audio_adapter_dts_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_flush = Interop.downcallHandle(
            "gst_planar_audio_adapter_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_get_buffer = Interop.downcallHandle(
            "gst_planar_audio_adapter_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_offset_at_discont = Interop.downcallHandle(
            "gst_planar_audio_adapter_offset_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_prev_dts = Interop.downcallHandle(
            "gst_planar_audio_adapter_prev_dts",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_prev_offset = Interop.downcallHandle(
            "gst_planar_audio_adapter_prev_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_prev_pts = Interop.downcallHandle(
            "gst_planar_audio_adapter_prev_pts",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_pts_at_discont = Interop.downcallHandle(
            "gst_planar_audio_adapter_pts_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_push = Interop.downcallHandle(
            "gst_planar_audio_adapter_push",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_take_buffer = Interop.downcallHandle(
            "gst_planar_audio_adapter_take_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_planar_audio_adapter_get_type = Interop.downcallHandle(
            "gst_planar_audio_adapter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
